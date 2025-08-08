package wipro_train;
import java.util.Scanner;

public class hello {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//sum of array for each
		int a[] = {1, 2, 3, 4};
		int sum = 0;
		for(int i:a) {
			sum += i;
		}
		System.out.println(sum);
		
		//for each loop
		/*String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String car : cars) {
		    System.out.println(car);
		}*/
		
		//if else loop
		/*int a = 2;
		int b = 3;
		if(a>b) {
			System.out.println("if executed");
		}else {
			System.out.println("else executed");
		}
		for(int i=0;i<5;i++) {
			System.out.println("for"+i);
		}*/
		
		//Switch
		/*int month = 12;
		switch(month) {
        case 1:
            System.out.println("January");
            break;
        case 2:
            System.out.println("February");
            break;
        case 3:
            System.out.println("March");
            break;
        case 4:
            System.out.println("April");
            break;
        case 5:
            System.out.println("May");
            break;
        case 6:
            System.out.println("June");
            break;
        case 7:
            System.out.println("July");
            break;
        case 8:
            System.out.println("August");
            break;
        case 9:
            System.out.println("September");
            break;
        case 10:
            System.out.println("October");
            break;
        case 11:
            System.out.println("November");
            break;
        case 12:
            System.out.println("December");
            break;
        default:
            System.out.println("Invalid month number!");
		}*/
		
		/*int age;
        do {
            System.out.print("Please enter your age: ");
            age = sc.nextInt();
            if (age <= 18) {
                System.out.println("Invalid input. Age must be a greater than 18.");
            }
        } while (age <= 18); // Loop continues as long as age is not positive
        System.out.println("You entered a valid age: " + age);
        System.out.println("Congrats");*/
		
		/*System.out.println("Break Statement");
		for(int j=0;j<6;j++) {
			if(j==5) {
				break;
			}
			System.out.println("j = " + j);
		}
		System.out.println("continue Statement");
		for(int j=0;j<6;j++) {
			if(j==3) {
				continue;
			}
			System.out.println("j = " + j);
		}*/
	}
}