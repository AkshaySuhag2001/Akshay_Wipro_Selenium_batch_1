package wipro_train;

import java.util.Scanner;

public class VotingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Voter voter = new Voter();

        System.out.print("Enter your name: ");
        voter.setName(scanner.nextLine());

        System.out.print("Enter your age: ");
        voter.setAge(scanner.nextInt());

        System.out.println("\n--- VOTING STATUS ---");
        System.out.println("Name: " + voter.getName());
        System.out.println("Age: " + voter.getAge());

        if (voter.isEligible()) {
            System.out.println("You are eligible to vote.");
            System.out.print("Do you want to vote now? (yes/no): ");
            scanner.nextLine();
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("yes")) {
                voter.castVote();
            } else {
                System.out.println("Vote not cast.");
            }
        } else {
            System.out.println("You are NOT eligible to vote.");
        }

        scanner.close();
    }
}

class Voter {
    private String name;
    private int age;
    private boolean hasVoted = false;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isEligible() {
        return age >= 18;
    }

    public void castVote() {
        if (isEligible() && !hasVoted) {
            hasVoted = true;
            System.out.println("Vote cast successfully!");
        } else if (hasVoted) {
            System.out.println("You have already voted.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}
