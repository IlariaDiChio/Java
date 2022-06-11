import java.util.Scanner;

public class Method {
    public static int askNum(){
        Scanner cal = new Scanner(System.in);
        System.out.println("Type a number: ");
        int num = cal.nextInt();
        return num;
    }
    public static String askOp(){
        Scanner cal = new Scanner(System.in);
        System.out.println("Give me an operator (+ - * /): ");
        String ope = cal.next();
        return ope;
    }

    public static int control (int num1, int num2, String operator){
        int num3 = 0;

        Scanner cal = new Scanner(System.in);

        switch (operator) {
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
        return num3;

    }



    public static void main(String[] args) {
        String moreMath;

        do {
            int num1 = askNum();
            int num2 = askNum();
            String operator = askOp();
            int num3 = control(num1,num2,operator);
            System.out.println(num3);

            Scanner cal = new Scanner(System.in);
            System.out.println("Would you like to do more math? (Y/N)");
            moreMath = cal.next();

        } while (moreMath.equals("y"));

        System.out.println("Calculator is closing");

    }
}
