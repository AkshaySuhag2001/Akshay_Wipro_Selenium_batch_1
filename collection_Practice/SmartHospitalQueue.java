package collection_Practice;

import java.util.LinkedList;
import java.util.Scanner;

class PatientDetails {
    String id;
    String name;

    public PatientDetails(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "[ID: " + id + ", Name: " + name + "]";
    }
}

public class SmartHospitalQueue {

    public static void main(String[] args) {
        LinkedList<PatientDetails> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Smart Hospital Queue System ---");
            System.out.println("1. Add Normal Patient");
            System.out.println("2. Add Emergency Patient");
            System.out.println("3. Cancel Appointment");
            System.out.println("4. View All Patients");
            System.out.println("5. View Next & Last Patient");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Patient ID: ");
                    String id = sc.nextLine();
                    if (isDuplicate(queue, id)) {
                        System.out.println("Patient with this ID already exists!");
                        break;
                    }
                    System.out.print("Enter Patient Name: ");
                    String name = sc.nextLine();
                    queue.addLast(new PatientDetails(id, name));
                    System.out.println("Patient added to the queue.");
                    break;

                case 2:
                    System.out.print("Enter Emergency Patient ID: ");
                    String eid = sc.nextLine();
                    if (isDuplicate(queue, eid)) {
                        System.out.println("Patient with this ID already exists!");
                        break;
                    }
                    System.out.print("Enter Patient Name: ");
                    String ename = sc.nextLine();
                    queue.addFirst(new PatientDetails(eid, ename));
                    System.out.println("Emergency patient added to front.");
                    break;

                case 3:
                    System.out.print("Enter Patient ID to cancel: ");
                    String cancelId = sc.nextLine();
                    boolean removed = false;
                    for (PatientDetails p : queue) {
                        if (p.id.equals(cancelId)) {
                            queue.remove(p);
                            System.out.println("Appointment cancelled for ID: " + cancelId);
                            removed = true;
                            break;
                        }
                    }
                    if (!removed)
                        System.out.println("Patient not found.");
                    break;

                case 4:
                    if (queue.isEmpty()) {
                        System.out.println("No patients in queue.");
                    } else {
                        System.out.println("Current Patients:");
                        for (PatientDetails p : queue)
                            System.out.println(p);
                    }
                    break;

                case 5:
                    if (queue.isEmpty()) {
                        System.out.println("No patients in queue.");
                    } else {
                        System.out.println("Next Patient: " + queue.getFirst());
                        System.out.println("Last Patient: " + queue.getLast());
                    }
                    break;

                case 6:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }

    public static boolean isDuplicate(LinkedList<PatientDetails> list, String id) {
        for (PatientDetails p : list) {
            if (p.id.equals(id)) {
                return true;
            }
        }
        return false;
    }
}
