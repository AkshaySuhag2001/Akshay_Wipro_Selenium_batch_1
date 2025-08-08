package collection_Practice;

import java.util.LinkedList;
import java.util.Scanner;

public class HospitalQueue {

	public static void main(String[] args) {
		LinkedList<String> patientQueue = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\n Hospital Ptient Service");
			System.out.println("1. Add Normal Patient: ");
			System.out.println("2. Add emergency patient: ");
			System.out.println("3. Remove Patient Details: ");
			System.out.println("4. View all patient: ");
			System.out.println("5. View first and last patient: ");
			System.out.println("6. Search patient name: "); // new
			System.out.println("7. Total number of patients: "); //new
			System.out.println("8. Exit");

			System.out.println("Enter Your Choice");
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				System.out.println("Enter patient name: ");
				String patient = sc.next();
				patientQueue.addLast(patient);
				System.out.println("Patient added.");
				break;
			case 2:
				System.out.println("Enter emergency patient name: ");
				String emergencyPatient = sc.next();
				patientQueue.addFirst(emergencyPatient);
				System.out.println(" Emergency Patient added to first.");
				break;
			case 3:
				if (!patientQueue.isEmpty()) {
					String removePatient = patientQueue.removeFirst();
					System.out.println("Removed patient: " + removePatient);
				} else {
					System.out.println("No patient in queue.");
				}
				break;
			case 4:
				System.out.println("List of patients:");
				System.out.println(patientQueue);
				break;
			case 5:
				if (!patientQueue.isEmpty()) {
					System.out.println("First patient: " + patientQueue.getFirst());
					System.out.println("Last patient: " + patientQueue.getLast());

				} else {
					System.out.println("No one in queue");
				}
				break;
			case 6:
			    System.out.print("Enter patient name to search: ");
			    String searchName = sc.next();
			    if (patientQueue.contains(searchName)) {
			        System.out.println("Patient " + searchName+" at "+ (patientQueue.indexOf(searchName)+1) + " in the queue.");
			    } else {
			        System.out.println("Patient not found.");
			    }
			    break;
			case 7:
			    System.out.println("Total patients in queue: " + patientQueue.size());
			    break;

			case 8:
				System.out.println("Exiting....");
				break;

			default:
				System.out.println("Invalid choice");
			}
		} while (choice != 8);
		sc.close();
	}

}
