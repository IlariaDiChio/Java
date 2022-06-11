import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number: ");
        int inputNum = sc.nextInt();

        int n=0;

        while (n<=inputNum){

            if (n%3==0 && n%5==0){
                System.out.println(n +" FizzBuzz");
            }else if (n%3==0) {
                System.out.println(n + " Fizz");
            } else if (n%5==0){
                System.out.println(n +"17" +
                        " Buzz");
            }else{
                System.out.println(n);
            }
            n++;


        }


    }
}
