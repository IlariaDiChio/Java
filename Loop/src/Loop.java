import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number: ");
        int inputNumber = sc.nextInt();

        int num=0;

        while (num<=inputNumber){
            if (num%2==1) {
                System.out.println(num);
            }
            num++;
        }




    }
}
