/* Class for customer */
package com.version1;

public class Customer {

    // Instance variables to hold customer's name and account number
    private String name;
    private int accountNumber;

    //
    // ToDo:
    //
    // Provide another instance variable to hold customer's status



    //
    // ToDo:
    //
    // Provide a class variable for last-used account number


    //
    // Constructor that takes a String to initialise the instance variable for the customer's
    // name, and sets the status automatically to 'A' as a default value
    //
    public Customer(String name)
    {
        this.name = name;

        //
        // ToDo:
        //
        //
        // Initialise status to  'A'


    }

    // ToDo: set the account number automatically, by incrementing the class variable
    // holding the last used account number. BOTH constructors must do this. Remember one
    // constructor can invoke the other using "this"...For an elegant solution, feel free
    // to change the contents of the first constructor that's been provided here...
    //







    //
    // ToDo:
    //
    //
    // Provide a second constructor that takes a String and a char, the customer's name and status
    //


    //
    // The getName method returns the name
    //
    public String getName()
    {
        return name;
    }


    //
    // The getAccountNumber method returns the accountNumber
    //
    public int getAccountNumber()
    {
        return accountNumber;
    }


    //
    // ToDo:
    //
    // Provide a getStatus method to return the status
    //



    //
    // ToDo:
    //
    // Provide a isHeld method that returns a boolean: true if the customer is status 'H' for on-hold,
    // otherwise it returns false
    //




    //
    // This changeDetails method changes the name
    //
    public void changeDetails(String name)
    {
        this.name = name;
    }


    //
    // ToDo:
    //
    // Provide a second changeDetails method that changes the name and status
    //



    //
    // ToDo:
    //
    // Provide a class method, setLastUsedAccountNumber(), to reset the class variable
    //




}