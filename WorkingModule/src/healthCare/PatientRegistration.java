package healthCare;

public class PatientRegistration {
	private int patientId;
	private String patientName;
	private int age;
	private String illness;
	
	public PatientRegistration(int patientId, String patientName, int age, String illness) {
		this.patientId = patientId;
		this.patientName = patientName;
		this.age = age;
		this.illness = illness;
	}
	public void setIllness(String illness) {
		this.illness = illness;
	}
	public int getId() {
		return patientId;
	}
	public String getName() {
		return patientName;
	}
	public int getAge() {
		return age;
	}
	public String getIllness() {
		return illness;
	}
	

}
