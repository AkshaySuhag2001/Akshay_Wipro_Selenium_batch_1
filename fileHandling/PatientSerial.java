package fileHandling;

import java.io.*;
import java.util.*;

class Patient implements Serializable {
    int id;
    String name;
    String disease;
    int age;

    public Patient(int id, String name, String disease, int age) {
        this.id = id;
        this.name = name;
        this.disease = disease;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Disease: " + disease + ", Age: " + age;
    }
}

public class PatientSerial {
    static final String FILE_NAME = "patients_list.dat";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Patient> patients = loadPatients();

        int choice;
        do {
            System.out.println("\n--- Patient Management System ---");
            System.out.println("1. Add Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Disease: ");
                    String disease = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    patients.add(new Patient(id, name, disease, age));
                    savePatients(patients);
                    System.out.println("Patient added successfully!");
                    break;

                case 2:
                    if (patients.isEmpty()) {
                        System.out.println("No patients found.");
                    } else {
                        System.out.println("\n--- Patient Records ---");
                        for (Patient p : patients) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 3);

        sc.close();
    }

    @SuppressWarnings("unchecked")
	private static List<Patient> loadPatients() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Patient>) in.readObject();
        } catch (Exception e) {
            return new ArrayList<>(); // return empty list if file not found or error occurs
        }
    }

    private static void savePatients(List<Patient> patients) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            out.writeObject(patients);
        } catch (IOException e) {
            System.out.println("Error saving patients to file.");
        }
    }
}
