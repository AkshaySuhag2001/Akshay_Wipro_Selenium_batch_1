package wipro_train;

public class Employe {

    String name;
    int age;

    //Constructor1:No arguments
    public Employe() {
        name = "Unknown";
        age = 0;
    }

    //Constructor2:One argument
    public Employe(String name) {
        this.name = name;
        age = 0;
    }

    //Constructor3:Two arguments
    public Employe(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Employe s1 = new Employe();
        Employe s2 = new Employe("Akshay");
        Employe s3 = new Employe("Akshay", 22);

        s1.display();
        s2.display();
        s3.display();
    }
}
