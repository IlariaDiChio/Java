public class Manager extends Employee {

    private Employee[] manages;
    private int tracker = 0;

    public Manager(String name, String lastName, int age){
        super(name,lastName, age);
        manages = new Employee[100];

        }
    public void addEmployee(Employee empl1) {
        manages[tracker] = empl1;
        tracker++;

    }
    public int getTracker(){
        return tracker;
    }

    public String getEmployeeNames(){
//        int i;
//        for (i=0; i <tracker; i++);
//        System.out.println(manages[i]);
//        return introduction();
        StringBuilder names = new StringBuilder();
        for (int i=0; i<tracker; i++){
            names.append(" "+ manages[i].fullName());
        }
        return  names.toString();
    }



//    public String getEmployeeNames(){
//        String a = "" ;
//        for (int i=0; i<manages.length; i++){
//            if (Instantof manages[i])
//            a = a.concat(manages[i].fullName() + " ,");
//        }
//        return a;
//    }
}
