package wipro_train;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/*int[] ar = {1, 2, 3, 4};
		for(int i=0;i<ar.length;i++) {
			System.out.println("Roll no: "+ar[i]);
		}*/
		
		/*int[][] matrix = {
				{1, 2, 3},
				{7, 8, 9}
		};*/
		
		//2d array
		/*System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nThe 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }*/
		
		/*//attendence tracker
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        System.out.print("Enter number of students: ");
        int Students = scanner.nextInt();
        scanner.nextLine();

        String[][] attendance = new String[Students][7];

        String[] studentNames = new String[Students];
        for (int i = 0; i < Students; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();
        }

        for (int i = 0; i < Students; i++) {
            System.out.println("Enter attendance for " + studentNames[i] + " (P/A):");
            for (int j = 0; j < 7; j++) {
                System.out.print(days[j] + ": ");
                attendance[i][j] = scanner.next().toUpperCase();
            }
        }

        System.out.println("\nAttendance Sheet:");
        System.out.print("Name\t\t");
        for (String day : days) {
            System.out.print(day + "\t");
        }
        System.out.println();

        for (int i = 0; i < Students; i++) {
            System.out.print(studentNames[i] + "\t\t");
            for (int j = 0; j < 7; j++) {
                System.out.print(attendance[i][j] + "\t");
            }
            System.out.println();
        }*/
		
        //ATM cash tracker
		/*// Define denominations
        int[] notes = {2000, 500, 200, 100};

        System.out.print("Enter number of ATMs: ");
        int numATMs = scanner.nextInt();

        int[][] atmNotes = new int[numATMs][notes.length];

        for (int i = 0; i < numATMs; i++) {
            System.out.println("\nEnter note count for ATM #" + (i + 1));
            for (int j = 0; j < notes.length; j++) {
                System.out.print("Number of ₹" + notes[j] + " notes: ");
                atmNotes[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nATM Cash Tracker:");
        System.out.print("ATM\t");
        for (int den : notes) {
            System.out.print("₹" + den + "\t");
        }
        System.out.println("Total Cash");

        for (int i = 0; i < numATMs; i++) {
            System.out.print((i + 1) + "\t");
            int total = 0;
            for (int j = 0; j < notes.length; j++) {
                System.out.print(atmNotes[i][j] + "\t");
                total += atmNotes[i][j] * notes[j];
            }
            System.out.println("₹" + total);
        }*/

	}
}
