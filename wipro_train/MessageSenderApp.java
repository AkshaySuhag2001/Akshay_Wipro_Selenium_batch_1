package wipro_train;

class MessageSender {
    public void sendMessage() {
        System.out.println("Sending a generic message...");
    }
}

class EmailSender extends MessageSender {
    public void sendMessage() {
        System.out.println("Sending an Email message...");
    }
}

class SMSSender extends MessageSender {
    public void sendMessage() {
        System.out.println("Sending an SMS message...");
    }
}

public class MessageSenderApp {
    public static void main(String[] args) {
        MessageSender sender;

        sender = new EmailSender();
        sender.sendMessage();

        sender = new SMSSender();
        sender.sendMessage();
    }
}
