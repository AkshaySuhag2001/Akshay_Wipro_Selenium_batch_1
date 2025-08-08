package wipro_train;
import java.util.Scanner;

public class employee {
	
	String empName;
	int empID;
	String empDept;
	long mobile;
	
	void empDetails() {
		System.out.println("Name: "+empName);
		System.out.println("Employee ID: "+empID);
		System.out.println("Department: "+empDept);
		System.out.println("Mobile No: "+mobile);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		employee emp = new employee();
		 System.out.println("Enter Employee Name:");
	     emp.empName = sc.nextLine();

	     System.out.println("Enter Employee ID:");
	     emp.empID = sc.nextInt();
         sc.nextLine();

	     System.out.println("Enter Department:");
	     emp.empDept = sc.nextLine();

	     System.out.println("Enter Mobile Number:");
	     emp.mobile = sc.nextLong();

	     emp.empDetails();
		
	}

}
