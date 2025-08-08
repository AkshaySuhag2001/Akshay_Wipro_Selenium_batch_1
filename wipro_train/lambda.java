package wipro_train;

import lambdaPack.LambdaInter;

public class lambda {
    public static void main(String[] args) {
        LambdaInter add = (a, b) -> a + b;
        LambdaInter sub = (a, b) -> a - b;
        LambdaInter mul = (a, b) -> a * b;
        LambdaInter div = (a, b) -> b != 0 ? a / b : 0;

        System.out.println("Add: " + add.operate(10, 5));
        System.out.println("Sub: " + sub.operate(10, 5));
        System.out.println("Mul: " + mul.operate(10, 5));
        System.out.println("Div: " + div.operate(10, 5));
    }
}
