package wipro_train;
import java.util.Scanner;

public class Chatbot {
	public void startChat() {
        Scanner sc = new Scanner(System.in);
        String message;

        System.out.println("ChatBot: Note: Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            message = sc.nextLine().toLowerCase();

            if (message.equals("bye")) {
                sayGoodbye();
                break;
            }

            respond(message);
        }

        sc.close();
    }

    public void respond(String input) {
        switch (input) {
            case "hi":
            case "hello":
                System.out.println("ChatBot: Hello there!");
                break;
            case "how are you":
                System.out.println("ChatBot: I'm just a program, but I'm doing great! Thanks for asking.");
                break;
            case "what is your name":
                System.out.println("ChatBot: I'm ChatBot, your virtual assistant.");
                break;
            default:
                System.out.println("ChatBot: Sorry, I don't understand that.");
        }
    }

    public void sayGoodbye() {
        System.out.println("ChatBot: Goodbye! Have a great day.");
    }

    public static void main(String[] args) {
        Chatbot bot = new Chatbot();
        bot.startChat();
    }

}
