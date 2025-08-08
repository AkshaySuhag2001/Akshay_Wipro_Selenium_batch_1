package wipro_train;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Scoreboard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> scores = new HashMap<>();

        scores.put("Alice", 50);
        scores.put("Bob", 30);
        scores.put("Charlie", 40);

        System.out.println("----- Scoreboard -----");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.print("\nEnter player name to update score: ");
        String name = sc.nextLine();

        System.out.print("Enter points to add: ");
        String input = sc.nextLine();

        try {
            int addScore = Integer.parseInt(input);

            if (scores.containsKey(name)) {
                int current = scores.get(name);
                scores.put(name, current + addScore);
            } else {
                scores.put(name, addScore);
            }

            System.out.println("\n----- Updated Scoreboard -----");
            for (Map.Entry<String, Integer> entry : scores.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid score entered.");
        }

        sc.close();
    }
}
