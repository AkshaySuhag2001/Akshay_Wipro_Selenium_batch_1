package wipro_train;

import java.util.Scanner;


public class encap_employee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr name: ");
		String name = sc.next();
		System.out.println("Name: "+name);
		empsalry eSalary = new empsalry();
		eSalary.setSalary(300000);
		System.out.println("Salary: "+eSalary.getSalary());
	}
}
