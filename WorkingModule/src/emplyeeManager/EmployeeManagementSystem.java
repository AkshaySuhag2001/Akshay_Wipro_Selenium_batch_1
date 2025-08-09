package emplyeeManager;


public class EmployeeManagementSystem {

	public static void main(String[] args) {
		Employee e1 = new Employee(null, 0, 0, null);
		Manager m1 = new Manager(null, 0, 0, null, null);
		Developer d1 = new Developer(null, 0, 0, null, null);
		System.out.println("\n-----Employee Details----");
		e1.displayDetails();
		System.out.println("\n-----Manager Details-----");
		m1.displayDetails();
		System.out.println("\n-----Developer Details-----");
		d1.displayDetails();
		e1.sc.close();
	}

}
