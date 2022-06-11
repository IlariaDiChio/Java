public class Employee {
    protected String name;
    protected String lastName;
    protected String department;
    protected int iD;
    protected int age;

    public Employee(String name, String lastName, String department, int iD, int age) {
        this.name = name;
        this.lastName = lastName;
        this.department = department;
        this.iD = iD;
        this.age = age;
    }

    public Employee(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    String fullName(){
        return name + " " + lastName;
    }

    public void fullname2(){
        System.out.println(name + lastName);
    }

    String introduction(){
        return "Employee " + "ID: " + iD + " - the department: " + department + " - Full name: " + fullName() + " - Age: " + age;

    }

    public int incAge(){
        if (age<65){
            age++;
        }
        return age;
    }
    public String toString(){
        return name + " " + lastName ;
    }


}
