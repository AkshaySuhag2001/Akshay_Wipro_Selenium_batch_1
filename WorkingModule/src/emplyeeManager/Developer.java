package emplyeeManager;

//Developer Class
class Developer extends Employee{
	private String skill;
	public Developer(String name, int id, double salary, String dept, String skill) {
		super(name, id, salary, dept);
		System.out.println("Skill: ");
		skill = sc.nextLine();
		this.skill = skill;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Skill: " + skill);
	}
}
