package emplyeeManager;
import java.util.Scanner;

class repeat{
	public static int rep = -1;
}
class Employee extends repeat{
	Scanner sc = new Scanner(System.in);
	private String name;
	private int id;
	private double salary;
	private String dept;
	
	
	public Employee(String name, int id, double salary, String dept) {
		repeat.rep++;
		if(repeat.rep == 0) {
		System.out.println("\n-----Employee Details-----");		
		}else if(repeat.rep == 1) {
			System.out.println("\n-----Manager Details-----");
		}else if(repeat.rep == 2){
			System.out.println("\n-----Developer Details-----");
			repeat.rep = -1;
		}
		System.out.println("Name: ");
		name = sc.nextLine();
		System.out.println("ID: ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Salary: ");
		salary = sc.nextDouble();
		sc.nextLine();
		System.out.println("Department: ");
		dept = sc.nextLine();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.dept = dept;
	}
	public void displayDetails() {
		System.out.println("\nName: " + name + ", ID: " + id + ", Salary: " + salary + ", Department: " + dept);
	}
}