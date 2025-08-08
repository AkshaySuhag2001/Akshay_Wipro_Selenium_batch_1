package healthCare;

public abstract class Doctor {
    String name;
    String specialization;

    public abstract void diagnose(PatientRegistration patient);
}
