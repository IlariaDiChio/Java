import java.util.Random;
import java.util.Scanner;

public class OddEven {
    public static String askEO(){
        int exit = 1;
        Scanner oE;
        do {
            exit = 1;
            oE = new Scanner(System.in);
            System.out.println("Odd or Even? (O/E)");
            String oddEven = oE.next();
            if (oddEven.equals("o")) {
                System.out.println("You chose Odd!");
            } else if (oddEven.equals("e")) {
                System.out.println("You chose Even!");
            } else {
                System.out.println("Error. You can only choose O or E. Do it again");
                exit = 0;
            }
            return oddEven;
        } while (exit == 0);

    }

    public static void main(String[] args) {

        String oddE = askEO();

        Scanner oE = new Scanner(System.in);
        System.out.println("Give me a number:");
        int num1 = oE.nextInt();

        Random random = new Random();

        int value = random.nextInt((10 - 1) + 1) + 1;
        System.out.println(value);

        int addUserNumber = num1 + value;
        System.out.println(addUserNumber);

        if (addUserNumber%2 == 0 && oddE.equals("e")) {
            System.out.println("Congratulation you were right! The number "+ addUserNumber + " is an EVEN NUMBER");
        }else if (addUserNumber%2!=0 && oddE.equals("e")) {
            System.out.println("Sorry you put" + oddE + "but the number "+ addUserNumber + " is an EVEN NUMBER");
        } else if (addUserNumber%2==0 && oddE.equals("O")) {
            System.out.println("Sorry you put" + oddE + "but the number "+ addUserNumber + " is an ODD NUMBER");
        }else if (addUserNumber%2!=0 && oddE.equals("o")){
            System.out.println("Congratulation you were right! The number "+ addUserNumber + " is an ODD NUMBER");
        }


    }
}
