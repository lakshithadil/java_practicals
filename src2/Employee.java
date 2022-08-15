public class Employee {
    String name;
    int idNumber;
    float payRate;
    static int employeeCounter = 0;

    public Employee(String name, float payRate,boolean setId) {
        this.name = name;
        this.payRate = payRate;
        employeeCounter++;
        if(setId) {
            this.idNumber = employeeCounter + 1000;
        }
    }

    public Employee(String name, float payRate) {
        this.name = name;
        this.payRate = payRate;
        employeeCounter++;
    }
    public double calcPay(double hours){
        return hours*payRate;
    }
    public static int numberOfEmployee(){
        return employeeCounter;
    }
}

class Technician extends  Employee{
    public Technician(String name, float payRate, boolean setId) {
        super(name, payRate);
        if(setId) {
            super.idNumber = employeeCounter + 4000;
        }
    }
    public double calcPay(double hours){
        double payAmount;
        if(hours>40){
            payAmount = 40*payRate + payRate*(hours-40)*1.5;
        }
        else {
            payAmount = hours*payRate;
        }
        return payAmount;
    }
}

class ProjectLeader extends Employee{
    public ProjectLeader(String name, float payRate, boolean setId) {
        super(name, payRate);
        if(setId) {
            super.idNumber = employeeCounter + 9000;
        }
    }
    public double calcPay(double hours){
        double payAmount;
         if(hours>45){
             payAmount = (hours-45)*payRate + payRate*40;
         }
         else {
             payAmount = hours*payRate;
         }
         return payAmount;
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee employee1 = new Employee("kamal", 3.0F,true);
        Employee employee2 = new Employee("nimal", 2.8F,true);
        ProjectLeader projectLeader = new ProjectLeader("amal",3.0f,true);
        Technician technician = new Technician("sarath",3.0f,true);
        System.out.println("Number of employees: "+Employee.numberOfEmployee());
        System.out.println(employee1.name+" "+employee1.idNumber+" "+employee1.calcPay(40));
        System.out.println(employee2.name+" "+employee2.idNumber+" "+employee2.calcPay(30));
        System.out.println(projectLeader.name+" "+projectLeader.idNumber+" "+projectLeader.calcPay(50));
        System.out.println(technician.name+" "+technician.idNumber+" "+technician.calcPay(50));
    }
}