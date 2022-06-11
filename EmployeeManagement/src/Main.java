import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Employee emp1 = new Employee("Ciccio (emp1)", "Bello","IT", 214, 67);
//        emp1.name = "Ciccio";
//        emp1.lastName = "Bello";
//        emp1.iD = 214;
//        emp1.department = "IT";

//
//
//        Scanner employee = new Scanner(System.in);
//
//        System.out.println("Waht's your name?");
//        String nameEmpl = employee.next();
//
//        System.out.println("Waht's your Lastname?");
//        String lNameEmpl = employee.next();
//
//        System.out.println("How old are you");
//        int ageEmpl = employee.nextInt();
//
//        System.out.println("Waht's your ID?");
//        int iDEmpl = employee.nextInt();
//
//        System.out.println("Waht's your department?");
//        String depEmpl = employee.next();
//
//        Employee emp2 = new Employee(nameEmpl,lNameEmpl,depEmpl,iDEmpl,ageEmpl);

        Employee emp2 = new Employee("Ilaria(emp2)","Di Chio","IT",1888,65);

        Manager man1 = new Manager("Martina (man1)", "ciao", 36);
        System.out.println(man1.fullName());
        System.out.println(man1.introduction());
        man1.fullname2();

        System.out.println(emp1.fullName());
        System.out.println(emp1.introduction());

        System.out.println(emp2.fullName());
        System.out.println(emp2.introduction());

//        System.out.println("Emp 1 Age + 1 " + emp1.incAge());
//        System.out.println("Emp 2 Age + 1 " + emp2.incAge());

        int age1 = emp1.incAge();
        if (age1<=65){
            System.out.println("perfect " + age1);
        }else {
            System.out.println("Sorry, this person is on retirement" + age1);
        }

        int age2 = emp2.incAge();
        if (age2<=65){
            System.out.println("perfect " + age2);
        }else {
            System.out.println("Sorry, this person is on retirement" + age2);
        }

        for (int i=0; i<10; i++){
            System.out.println(emp1.incAge());
            System.out.println(emp2.incAge());
        }

        Employee[] company = {emp1,emp2,man1};
        for (int i=0; i<company.length; i++){

            System.out.println(company[i]);

        }

        man1.addEmployee(emp1);
        man1.addEmployee(emp2);
        man1.addEmployee(new Employee("Giulia","Blu",60));
        man1.addEmployee(new Employee("Elena","Marrone",32));
        man1.addEmployee(new Employee("Carlo","Cobalto",38));
        for (int i = 0; i< company.length; i++){
            man1.getEmployeeNames();
            System.out.println(company[i]);
        }


        System.out.println(man1.getTracker());





    }



}
