package healthCare;

public class PatientServiceImpl implements PatientService {
    private PatientRegistration[] patients = new PatientRegistration[10];
    private int count = 0;

    @Override
    public void registerPatient(PatientRegistration patient) {
        if (count < patients.length) {
            patients[count] = patient;
            count++;
        } else {
            System.out.println("Patient limit reached. Cannot register more.");
        }
    }

    @Override
    public void showPatientDetails(int patientId) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (patients[i].getId() == patientId) {
                System.out.println("Patient ID: " + patients[i].getId());
                System.out.println("Name: " + patients[i].getName());
                System.out.println("Age: " + patients[i].getAge());
                System.out.println("Illness: " + patients[i].getIllness());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No patient found with ID " + patientId);
        }
    }
}
