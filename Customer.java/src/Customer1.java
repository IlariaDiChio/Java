import java.lang.constant.Constable;

/* Class for customer */
public class Customer1 {

    // Instance variables to hold customer's name and account number
    private String name;
    private int accountNumber = 0; //Task 1.2/
    // ToDo:
    // Provide another instance variable to hold customer's status
    //****************IT WORKS!!*********************
    private char cStatus;
    //
    // ToDo:
    //
    // Provide a class variable for last-used account number
    private static int lastUsedAccountnumber = 1000;



    //
    // Constructor that takes a String to initialise the instance variable for the customer's
    // name, and sets the status automatically to 'A' as a default value
    //
    public Customer1(String name, int accountNumber)
    {
        this.name = name;
        this.accountNumber = accountNumber;
        // ToDo:
        // Initialise status to  'A'
        //****************IT WORKS!!*********************
        this.cStatus = 'A'; //Task 1.5 Modify the first constructor to set the status to ‘A’./
        this.accountNumber = lastUsedAccountnumber;
        lastUsedAccountnumber++;
    }

    // ToDo: set the account number automatically, by incrementing the class variable
    // holding the last used account number. BOTH constructors must do this. Remember one
    // constructor can invoke the other using "this"...For an elegant solution, feel free
    // to change the contents of the first constructor that's been provided here...
    //




    // ToDo:
    // Provide a second constructor that takes a String and a char, the customer's name and status
    //****************IT WORKS!!*********************
    public Customer1(String name, char cStatus) {
        this.name = name;
        this.cStatus = cStatus;

        if (cStatus != 'A' && cStatus != 'I' && cStatus != 'H') {
            this.cStatus = 'H';
        }
    }

    //
    // The getName method returns the name
    //
    public String getName()
    {
        return this.name;
    }


    //
    // The getAccountNumber method returns the accountNumber
    //****************IT WORKS!!*********************
    public Customer1(String name){
        this.name =name;
    }
    //I created this constructor to prove that customer's account are set to 0.
    public Constable getAccountNumber(){
        return this.name + "'s account number is " + this.accountNumber;
    }

    // ToDo:
    // Provide a getStatus method to return the status
    //****************IT WORKS!!*********************
    //Task 1.4 Also provide getStatus() method that returns the char.
    public String getcStatus(){
        return this.name + "'s Bank account Status is " + this.cStatus;
    }

    // ToDo:
    // Provide a isHeld method that returns a boolean: true if the customer is status 'H' for on-hold,
    // otherwise it returns false
    //****************IT WORKS!!*********************
    //Task 1.4 returns true if the status is equal to 'H', otherwise false. Also provide getStatus() method that returns the char.
    public boolean isHeld(){

        return cStatus == 'H';

//        if(cStatus == 'H'){
//            return true;
//        }else{
//            return false;
//        }
    }




    //
    // This changeDetails method changes the name
    //Task 2.1 DONE (verify that the method changes the customer's name)
    public void changeDetails(String name)
    {
        this.name = name;
    }

    // ToDo:
    // Provide a second changeDetails method that changes the name and status
    //Task 2.2 method that changes the customer's name and status
    public void changeDetails(String name, char cStatus){
        this.name = name;
        this.cStatus = cStatus;
    }



    //
    // ToDo:
    //
    // Provide a class method, setLastUsedAccountNumber(), to reset the class variable
    //




}