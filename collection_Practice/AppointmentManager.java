package collection_Practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.TreeSet;

class Appointment implements Comparable<Appointment> {
    private String patientName;
    private LocalDateTime dateTime;

    public Appointment(String patientName, LocalDateTime dateTime) {
        this.patientName = patientName;
        this.dateTime = dateTime;
    }

    public String getPatientName() {
        return patientName;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public int compareTo(Appointment other) {
        return this.dateTime.compareTo(other.dateTime);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Appointment)) return false;
        Appointment other = (Appointment) obj;
        return this.dateTime.equals(other.dateTime);
    }

    @Override
    public int hashCode() {
        return dateTime.hashCode();
    }

    @Override
    public String toString() {
        return "[" + dateTime + "] - Patient: " + patientName;
    }
}

public class AppointmentManager {

    public static void main(String[] args) {
        TreeSet<Appointment> appointments = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        int choice;

        do {
            System.out.println("\n--- Appointment Scheduler ---");
            System.out.println("1. Book Appointment");
            System.out.println("2. View All Appointments");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Patient Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Appointment Date & Time (yyyy-MM-dd HH:mm): ");
                    String dateTimeInput = sc.nextLine();

                    try {
                        LocalDateTime dateTime = LocalDateTime.parse(dateTimeInput, formatter);
                        Appointment newAppointment = new Appointment(name, dateTime);

                        if (appointments.add(newAppointment)) {
                            System.out.println("Appointment booked successfully.");
                        } else {
                            System.out.println("This time slot is already booked!");
                        }

                    } catch (Exception e) {
                        System.out.println("Invalid date/time format.");
                    }
                    break;

                case 2:
                    if (appointments.isEmpty()) {
                        System.out.println("No appointments scheduled.");
                    } else {
                        System.out.println("\nScheduled Appointments:");
                        for (Appointment a : appointments) {
                            System.out.println(a);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting scheduler...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 3);

        sc.close();
    }
}
