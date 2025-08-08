package wipro_train;
import java.util.Scanner;

public class sttring {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*String name = "AKshay suhag";
		String str = "ha";
		int len = name.length();
		System.out.println("length: "+len);
		int ch = name.charAt(1);
		System.out.println(ch);
		String sub = name.substring(2);
		System.out.println(sub);
		String sub2 = name.substring(2, 4);
		System.out.println(sub2);
		String concat = name.concat(" Welcome");
		System.out.println(concat);
		
		System.out.println(name.equals(str));
		System.out.println(name.equalsIgnoreCase(str));
		//System.out.println(name.compareTo(str));
		//System.out.println(name.compareToIgnoreCase(str));
		
		System.out.println(name.indexOf("s"));
		System.out.println(name.indexOf("sh"));
		System.out.println(name.lastIndexOf(name));
		System.out.println(name.contains(str));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(str.trim());
		System.out.println(str.isEmpty());
		
		System.out.println(name.split(","));*/
		
		//stringbuffer
		//cafe receipt
		/*StringBuffer rc = new StringBuffer();
		rc.insert(0,"--------------Thank you-------------\n");
		rc.append("Name: Akshay\n");
		rc.append("Bill no: 14528\n");
		rc.append("      ---------Items-----------\n");
		rc.append("Cold coffee: Rs 60\n");
		rc.append("Sandwich   : Rs 80\n");
		rc.append("Total      : Rs 140\n");
		rc.append("Mode: Online\n");
		System.out.println(rc.toString());
		StringBuffer r = rc.reverse();
		System.out.println(r.toString());*/
		
		//employee progress
		System.out.println("Enter Name: ");
		String name = sc.next();
		System.out.println("Enter ID: ");
		int id = sc.nextInt();
		System.out.println("Enter Department: ");
		String dept = sc.next();
		System.out.println("Enter Top project: ");
		String project = sc.next();
		System.out.println("Enter ratings: ");
		String rate = sc.next();
		System.out.println("Enter No of Projects: ");
		int prg = sc.nextInt();
		System.out.println("Enter No of courses: ");
		int crc = sc.nextInt();
		
		StringBuffer rc = new StringBuffer();
		
		rc.insert(0,"Employee Report\n");
		rc.append("Name: "+name);
		rc.append("\nEmp no: A"+id);
		rc.append("\nDepartment: "+dept);
		rc.append("\nTop Rated Project: "+project);
		rc.append("\nComapny Rating: "+rate);
		rc.append("\nProjects Done: "+prg);
		rc.append("\nCoureses Done: "+crc);
		System.out.println(rc.toString());
		System.out.println("-----------REVERSE----------");
		StringBuffer r = rc.reverse();
		System.out.println(r.toString());
	}
}
