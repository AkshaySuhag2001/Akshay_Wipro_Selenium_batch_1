package collection_Practice;

import java.util.HashSet;
import java.util.Scanner;

class PatientData {
	String id;
	String name;

	public PatientData(String id, String name) {
		this.id = id;
		this.name = name;
	}

	//Override equals and hashCode for uniqueness based on ID
	@Override
	public boolean equals(Object obj) {
		if (this == obj) // check if it is the same object reference
			return true;
		if (!(obj instanceof PatientData))//ensure the object is of correct type
			return false;
		PatientData other = (PatientData) obj; //safely cast to access patient specific fields
		return this.id.equals(other.id); // compare unique ids to decide equality
	}

	@Override
	public int hashCode() {
		return id.hashCode(); //Unique based on ID
	}

	@Override
	public String toString() {
		return "[ID: " + id + ", Name: " + name + "]";
	}
}

public class HospitalHashset {

	public static void main(String[] args) {
		HashSet<PatientData> patientSet = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\n--- Unique Patient Registration System ---");
			System.out.println("1. Register New Patient");
			System.out.println("2. View All Registered Patients");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter Patient ID: ");
				String id = sc.nextLine();
				System.out.print("Enter Patient Name: ");
				String name = sc.nextLine();

				PatientData newPatient = new PatientData(id, name);

				if (patientSet.add(newPatient)) {
					System.out.println("Patient registered successfully.");
				} else {
					System.out.println("Patient with this ID is already registered.");
				}
				break;

			case 2:
				if (patientSet.isEmpty()) {
					System.out.println("No patients registered yet.");
				} else {
					System.out.println("Registered Patients:");
					for (PatientData p : patientSet) {
						System.out.println(p);
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
