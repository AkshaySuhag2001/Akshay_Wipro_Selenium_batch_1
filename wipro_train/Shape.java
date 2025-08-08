package wipro_train;

import java.util.Scanner;

abstract class Shape {
    public abstract void area();
}

class Square extends Shape {
    public void area() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of square: ");
        int side = sc.nextInt();
        int areaOfSquare = side * side;
        System.out.println("Area: " + areaOfSquare);
    }
}
