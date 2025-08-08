package collection_Practice;

import java.util.HashSet;
import java.util.Scanner;

class DoctorData {
    private int id;
    private String name;
    private String department;

    public DoctorData(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof DoctorData)) return false;
        DoctorData other = (DoctorData) obj;
        return this.id == other.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public String toString() {
        return "[ID: " + id + ", Name: " + name + ", Department: " + department + "]";
    }
}

public class DoctorRegistration {

    public static void main(String[] args) {
        HashSet<DoctorData> doctorSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Unique Doctor Registration System ---");
            System.out.println("1. Register New Doctor");
            System.out.println("2. View All Registered Doctors");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Doctor ID (int): ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Doctor Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();

                    DoctorData newDoctor = new DoctorData(id, name, dept);

                    if (doctorSet.add(newDoctor)) {
                        System.out.println("Doctor registered successfully.");
                    } else {
                        System.out.println("Doctor with this ID is already registered.");
                    }
                    break;

                case 2:
                    if (doctorSet.isEmpty()) {
                        System.out.println("No doctors are registered yet.");
                    } else {
                        System.out.println("Registered Doctors are:");
                        for (DoctorData d : doctorSet) {
                            System.out.println(d);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 3);

        sc.close();
    }
}
