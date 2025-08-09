package emplyeeManager;

//Manager Class
class Manager extends Employee{
	private String projectName;
	public Manager(String name, int id, double salary, String dept, String projectName) {
		super(name, id, salary, dept);
		System.out.println("Project name: ");
		projectName = sc.nextLine();
		this.projectName = projectName;		
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Project Name: " + projectName);
	}
}