package wipro_train;

public class StaticClass {

    // Static nested class
    static class Utility {
        // Static method inside the static class
        static void sayHello() {
            System.out.println("Hello from static method inside static class!");
        }
    }

    public static void main(String[] args) {
        // Directly call the static method without creating any object
        StaticClass.Utility.sayHello();
    }
}
