package healthCare;

public class Cardiologist extends Doctor {

    public Cardiologist(String name) {
        this.name = name;
        this.specialization = "Cardiologist";
    }

    @Override
    public void diagnose(PatientRegistration patient) {
        System.out.println(name + " (" + specialization + ") is diagnosing patient with: " + patient.getIllness());
    }
}
