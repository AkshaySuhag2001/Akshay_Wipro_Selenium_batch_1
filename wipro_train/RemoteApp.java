//Abstraction
package wipro_train;
import java.util.Scanner;

abstract class Remote {
    public abstract void turnOn();
    public abstract void turnOff();
}

class TVRemote extends Remote {
    public void turnOn() {
        System.out.println("TV is now ON.");
    }

    public void turnOff() {
        System.out.println("TV is now OFF.");
    }
}

class ACRemote extends Remote {
    public void turnOn() {
        System.out.println("Air Conditioner is now ON.");
    }

    public void turnOff() {
        System.out.println("Air Conditioner is now OFF.");
    }
}

public class RemoteApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose device to control:");
        System.out.println("1. TV");
        System.out.println("2. Air Conditioner");
        int choice = sc.nextInt();

        Remote remote;

        if (choice == 1) {
            remote = new TVRemote();
        } else if (choice == 2) {
            remote = new ACRemote();
        } else {
            System.out.println("Invalid choice.");
            return;
        }

        remote.turnOn();
        remote.turnOff();
    }
}
