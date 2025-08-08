//Inheritance
package wipro_train;
import java.util.Scanner;

class HospitalMain {
    public void welcomeMessage() {
        System.out.println("Welcome to Golden Hospital.");
    }
}

class Doctor extends HospitalMain {
    String name;
    int id;

    public void inputDetails(Scanner sc) {
        System.out.print("Enter Doctor's Name: ");
        sc.nextLine();
        name = sc.nextLine();
        System.out.print("Enter Doctor's ID: ");
        id = sc.nextInt();
    }

    public void displayDetails() {
        System.out.println("Doctor Name: " + name);
        System.out.println("Doctor ID: " + id);
    }
}

class Nurse extends HospitalMain {
    String name;
    int id;

    public void inputDetails(Scanner sc) {
        System.out.print("Enter Nurse's Name: ");
        sc.nextLine();
        name = sc.nextLine();
        System.out.print("Enter Nurse's ID: ");
        id = sc.nextInt();
    }

    public void displayDetails() {
        System.out.println("Nurse Name: " + name);
        System.out.println("Nurse ID: " + id);
    }
}

class Patient extends HospitalMain {
    String name;
    int id;

    public void inputDetails(Scanner sc) {
        System.out.print("Enter Patient's Name: ");
        sc.nextLine();
        name = sc.nextLine();
        System.out.print("Enter Patient's ID: ");
        id = sc.nextInt();
    }

    public void displayDetails() {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient ID: " + id);
    }
}

public class HospitalApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Doctor doctor = new Doctor();
        Nurse nurse = new Nurse();
        Patient patient = new Patient();

        doctor.inputDetails(sc);
        nurse.inputDetails(sc);
        patient.inputDetails(sc);

        System.out.println("\n--- Hospital Info ---");
        doctor.welcomeMessage();
        nurse.welcomeMessage();
        patient.welcomeMessage();

        System.out.println("\n--- Doctor Info ---");
        doctor.displayDetails();

        System.out.println("\n--- Nurse Info ---");
        nurse.displayDetails();

        System.out.println("\n--- Patient Info ---");
        patient.displayDetails();

        sc.close();
    }
}
