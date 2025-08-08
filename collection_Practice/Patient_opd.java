package collection_Practice;
import java.util.ArrayList;
import java.util.Scanner;

class Patient{
	private String name;
	private int age;
	private String disease;
	
	public Patient(String name, int age, String disease) {
		this.name = name;
		this.age = age;
		this.disease = disease;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getDisease() {
		return disease;
	}
	public void display() {
		System.out.println("Name: " + name + "\nAge: "+ age +"\ndisease: " + disease);
	}
	
}
public class Patient_opd {

	public static void main(String[] args) {
		ArrayList<Patient> patient = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		/*patient.add(new Patient("Akshay",23,"Cold"));
		patient.add(new Patient("Arun",28,"Infection"));
		patient.add(new Patient("Aakash",20,"Migraine"));*/
		while(true) {
			System.out.println("\n Hospital OPD Service");
			System.out.println("1. Add Patient: ");
			System.out.println("2. Display Patients: ");
			System.out.println("3. Search Ptient Details: ");
			System.out.println("4. Delete Patient Details: ");
			System.out.println("5. List Patients by disease: ");
			System.out.println("6. Count number of patients: ");
			System.out.println("7. Delete all the data: ");
			System.out.println("8. Update disease of patient:");
			System.out.println("9. Exit");
			System.out.println("Enter Your Choice (Digit only): ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				System.out.println("Enter patient name:");
				String name = sc.nextLine();
				System.out.println("Enter age: ");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter disease: ");
				String disease = sc.nextLine();
				patient.add(new Patient(name, age, disease));
				System.out.println("Patient Added");
				break;
			case 2:
				System.out.println("Patient Deatils:");
				for(Patient p:patient) {
					p.display();
				}
				break;
			case 3:
				System.out.println("Enter name to search: ");
				String nameSearch = sc.nextLine();
				boolean found = false;
				for(Patient p:patient) {
					if(p.getName().equalsIgnoreCase(nameSearch)) {
						p.display();
						found = true;
					}
				}
				if(!found) {
					System.out.println("No patient found with name: " + nameSearch);
					
				}
				break;
			case 4:
				System.out.println("Enter name to delete: ");
				String nameDel = sc.nextLine();
				boolean removed = false;

				for (int i = 0; i < patient.size(); i++) {
				    if (patient.get(i).getName().equalsIgnoreCase(nameDel)) {
				        patient.remove(i);
				        removed = true;
				        System.out.println("Patient removed.");
				        break;
				    }
				}
				if (!removed) System.out.println("Patient not found.");
				break;
			case 5:
				System.out.println("Enter disease to search:");
				String dis = sc.nextLine();
				for(Patient p : patient) {
				    if(p.getDisease().equalsIgnoreCase(dis)) {
				        p.display();
				    }
				}
				break;
			case 6:
				System.out.println("Total patients: " + patient.size());
				break;
			case 7:
			    System.out.print("Are you sure you want to delete all data? (yes/no): ");
			    String confirm = sc.nextLine();
			    if (confirm.equalsIgnoreCase("yes")) {
			        patient.clear();
			        System.out.println("All patient data deleted.");
			    } else {
			        System.out.println("Operation cancelled.");
			    }
			    break;
			case 8:
			    System.out.print("Enter patient name to update disease: ");
			    String updateName = sc.nextLine();
			    boolean updated = false;

			    for (Patient p : patient) {
			        if (p.getName().equalsIgnoreCase(updateName)) {
			            System.out.print("Enter new disease: ");
			            String newDisease = sc.nextLine();
			            patient.set(patient.indexOf(p), new Patient(p.getName(), p.getAge(), newDisease));

			            System.out.println("Disease updated.");
			            updated = true;
			            break;
			        }
			    }

			    if (!updated) {
			        System.out.println("Patient not found.");
			    }
			    break;


			case 9:
				System.out.println(".....Exiting.....");
				sc.close();
				return;
				default: System.out.println("Invalid choice!!!");
				
			}
			
			}
	}

}
