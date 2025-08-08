package healthCare;

public class HealthCareMain {
    public static void main(String[] args) {
    	
        PatientRegistration patient1 = new PatientRegistration(1, "Akshay", 23, "Fever");
        PatientRegistration patient2 = new PatientRegistration(2, "Rahul", 29, "chest pain");

        PatientService treatment = new PatientServiceImpl();
        treatment.registerPatient(patient1);
        treatment.registerPatient(patient2);

        treatment.showPatientDetails(1);
        treatment.showPatientDetails(2);

        Doctor gp = new GeneralPhysician("Dr. Kumar");
        Doctor cardio = new Cardiologist("Dr. Singh");

        System.out.println("\nDiagnosis:");
        gp.diagnose(patient1);
        cardio.diagnose(patient2);
    }
}
