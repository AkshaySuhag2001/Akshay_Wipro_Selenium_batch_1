package lambdaPack;

import java.util.Arrays;

public class EmployeeSort {

    // Simple Employee class with public fields
    static class Employee {
        String name;
        double salary;

        Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public String toString() {
            return name + " - ₹" + salary;
        }
    }

    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Akshay", 45000),
            new Employee("Nikita", 52000),
            new Employee("Rohan", 38000),
            new Employee("Sneha", 61000)
        };

        System.out.println("Before Sorting:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // Sort by salary using lambda
        Arrays.sort(employees, (a, b) -> Double.compare(a.salary, b.salary));

        System.out.println("\nAfter Sorting by Salary:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
