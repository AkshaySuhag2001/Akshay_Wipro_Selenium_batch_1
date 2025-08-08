package wipro_train;

import java.util.Scanner;

public class StudentMarksSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks in Subject 1: ");
        Integer m1 = sc.nextInt();

        System.out.print("Enter marks in Subject 2: ");
        Integer m2 = sc.nextInt();

        System.out.print("Enter marks in Subject 3: ");
        Integer m3 = sc.nextInt();

        Integer total = m1 + m2 + m3;
        Double average = total / 3.0;

        String grade;
        if (average >= 90) grade = "A+";
        else if (average >= 80) grade = "A";
        else if (average >= 70) grade = "B";
        else if (average >= 60) grade = "C";
        else grade = "Fail";

        System.out.println("\n----- Student Report -----");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
