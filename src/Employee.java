public abstract class Employee
{
    String name;
    int age;
    private double hourRate;
    public Employee(String name, int age, double hourRate){
        this.name = name;
        this.age = age;
        this.hourRate = hourRate;
    }
    public abstract double salary(double hours); //calculate salary

    public double getHourRate() {
        return hourRate;
    }

    public String toString()
    {
        return "name=" + name + "age=" + age + "hourRate=" + hourRate;
    }
}
class Manager extends Employee{

    public Manager(String name, int age, double hourRate) {
        super(name, age, hourRate);
    }

    @Override
    public double salary(double hours) {
        return getHourRate()*hours*1.10;
    }

}

class Clerk extends Employee{

    public Clerk(String name, int age, double hourRate) {
        super(name, age, hourRate);
    }

    @Override
    public double salary(double hours) {
         return getHourRate()*hours*1.05;
    }

}

 class Test2 {
     public static void main(String[] args) {
         Manager perera = new Manager("Perera",54,1000);
         Clerk saman = new Clerk("Saman",32,600);
         Clerk nimal = new Clerk("Nimal",41,700);
         Clerk kalani = new Clerk("Kalani",28,800);
         double totalSalary = perera.salary(8*7)+ saman.salary(8*7)+ nimal.salary(8*7)+ kalani.salary(8*7);
         System.out.println(totalSalary);
     }
}