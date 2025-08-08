package healthCare;

public class GeneralPhysician extends Doctor {

    public GeneralPhysician(String name) {
        this.name = name;
        this.specialization = "General Physician";
    }

    @Override
    public void diagnose(PatientRegistration patient) {
        System.out.println(name + " (" + specialization + ") is diagnosing patient with: " + patient.getIllness());
    }
}
