package fileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PatientRecord {
    static final String FILE_NAME = "patient.pdf";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Patient Records Management System ---");
            System.out.println("1. Add New Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
                        System.out.print("Enter Patient ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Patient Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Disease: ");
                        String disease = sc.nextLine();
                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();

                        String record = "ID: " + id + ", Name: " + name + ", Disease: " + disease + ", Age: " + age;
                        writer.write(record);
                        writer.newLine();
                        System.out.println("Patient record saved successfully!");
                    } catch (IOException e) {
                        System.out.println("Error writing to file.");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Patient Records ---");
                    try {
                        BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
                        String line;
                        while ((line = reader.readLine()) != null) {
                            System.out.println(line);
                        }
                        reader.close();
                    } catch (IOException e) {
                        System.out.println("Error reading the file.");
                    }
                    break;


                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 3);

        sc.close();
    }
}
