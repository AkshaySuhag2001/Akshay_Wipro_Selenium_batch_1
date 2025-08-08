package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class HospitalManagement {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Wipro", "root", "Akshay@2001");
            System.out.println("Connected Successfully");

            Statement stmt = con.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS patient (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT, " +
                    "name VARCHAR(100), " +
                    "age INT, " +
                    "disease VARCHAR(100), " +
                    "admissionDate VARCHAR(100), " +
                    "doctor VARCHAR(100))";
            stmt.executeUpdate(sql);
            System.out.println("Table created!!");

            Scanner sc = new Scanner(System.in);
            
            System.out.print("Enter Patient Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Disease: ");
            String disease = sc.nextLine();
            System.out.print("Enter Admission Date (YYYY-MM-DD): ");
            String admissionDate = sc.nextLine();
            System.out.print("Enter Doctor Name: ");
            String doctor = sc.nextLine();
            
            
            String insertData = "INSERT INTO patient(name, age, disease, admissionDate, doctor) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement psmt = con.prepareStatement(insertData);
            psmt.setString(1, name);
            psmt.setInt(2, age);
            psmt.setString(3, disease);
            psmt.setString(4, admissionDate);
            psmt.setString(5, doctor);

            psmt.executeUpdate();
            System.out.println("Patient added successfully.");

            psmt.close();
            con.close();
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
