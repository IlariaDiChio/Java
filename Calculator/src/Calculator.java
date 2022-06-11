import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner cal = new Scanner(System.in);

        System.out.println("Type first number: ");
        int num1 = cal.nextInt();

        System.out.println("Type second number: ");
        int num2 = cal.nextInt();

        System.out.println("Give me an operator (+ - * /): ");
        String operator = cal.next();

        int num3 = 0;

        switch (operator){
            case "+":
                num3 = num1 + num2;
                break;
            case "-":
                num3 = num1 - num2;
                break;
            case "*":
                num3 = num1 * num2;
                break;
            case "/":
                num3 = num1 / num2;
                break;
            default:
                System.out.println("The operator is not valid");
        }
        System.out.println(num3);

    }
}
