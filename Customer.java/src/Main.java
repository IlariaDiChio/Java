import java.beans.Customizer;

public class Main {
    public static void main(String[] args) {
        //Task 1.3 You cannot create directly new instances from the Customer class because the objects are private

        //Task 1.2 Proof that customer's account are set to 0.
        Customer1 cust4 = new Customer1("4Pablo");
        System.out.println(cust4.getAccountNumber());

        //Task 1.5 Proof that the first constructor status is set to ‘A’.
        Customer1 cust1 = new Customer1("1Ilaria", 1222333);
        Customer1 cust2 = new Customer1("2Giulia", 2222222);

        //Task 1.4 getStatus() returns the char.
        System.out.println(cust1.getcStatus());
        System.out.println(cust2.getcStatus());

        //Task 1.5 Proof that If the value received is not ‘A’ or ‘I’ or ‘H’ , it gets set it to ‘H’.
        Customer1 cust3 = new Customer1("3Pino", 'G');
        System.out.println(cust3.getcStatus());

        //Task 1.4 Proof that returns true if the status is equal to 'H', otherwise false.
        System.out.println(cust1.isHeld());
        System.out.println(cust3.isHeld());

        //Task 2.1 Yes, changeDetails() method changes the name
        cust1.changeDetails("1Maria");
        System.out.println(cust1.getName());

        //Task 2.3 Change the name and the status with the same method,overloading
        cust1.changeDetails("1Peppina", 'I');
        System.out.println(cust1.getcStatus());

        //Task 3.1














    }
}
