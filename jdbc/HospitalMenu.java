package jdbc;

import java.sql.*;
import java.util.Scanner;

public class HospitalMenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Load JDBC driver and connect
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Wipro", "root", "Akshay@2001");
            System.out.println("Connected to Database");

            int choice;
            do {
                System.out.println("\n--- Hospital Patient Management System ---");
                System.out.println("1. Add Patient");
                System.out.println("2. View All Patients");
                System.out.println("3. Delete Patient");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                sc.nextLine(); // consume newline

                switch (choice) {
                    case 1: // Add Patient
                        String insertSQL = "INSERT INTO patient(name, age, disease, admissionDate, doctor) VALUES (?, ?, ?, ?, ?)";
                        PreparedStatement addStmt = con.prepareStatement(insertSQL);

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Disease: ");
                        String disease = sc.nextLine();
                        System.out.print("Enter Admission Date (e.g., 01 Aug 25): ");
                        String date = sc.nextLine();
                        System.out.print("Enter Doctor Name: ");
                        String doctor = sc.nextLine();

                        addStmt.setString(1, name);
                        addStmt.setInt(2, age);
                        addStmt.setString(3, disease);
                        addStmt.setString(4, date);
                        addStmt.setString(5, doctor);

                        addStmt.executeUpdate();
                        addStmt.close();
                        System.out.println("Patient Added Successfully!");
                        break;

                    case 2: // View All Patients
                        String selectSQL = "SELECT * FROM patient";
                        Statement viewStmt = con.createStatement();
                        ResultSet rs = viewStmt.executeQuery(selectSQL);
                        System.out.println("\n--- Patient Records ---");
                        while (rs.next()) {
                            System.out.println("ID: " + rs.getInt("id") +
                                    ", Name: " + rs.getString("name") +
                                    ", Age: " + rs.getInt("age") +
                                    ", Disease: " + rs.getString("disease") +
                                    ", Date: " + rs.getString("admissionDate") +
                                    ", Doctor: " + rs.getString("doctor"));
                        }
                        rs.close();
                        viewStmt.close();
                        break;

                    case 3: // Delete Patient
                        System.out.print("Enter Patient ID to Delete: ");
                        int idToDelete = sc.nextInt();
                        String deleteSQL = "DELETE FROM patient WHERE id = ?";
                        PreparedStatement deleteStmt = con.prepareStatement(deleteSQL);
                        deleteStmt.setInt(1, idToDelete);
                        int deleted = deleteStmt.executeUpdate();
                        deleteStmt.close();
                        if (deleted > 0) {
                            System.out.println("Patient Deleted Successfully!");
                        } else {
                            System.out.println("Patient ID Not Found!");
                        }
                        break;

                    case 4:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }

            } while (choice != 4);

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
