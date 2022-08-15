import java.util.ArrayList;
import java.util.Collections;

public class BankAccount implements Comparable<BankAccount> {
    private String name;
    private double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if(amount<balance) {
            balance += amount;
        }
        else {
            System.out.println("Exceeded amount");
        }
    }
    public String toString(){
        return name+","+"Rs."+balance;
    }

    @Override public int compareTo(BankAccount compareacc) {
        int comparebal
                = (int) ((BankAccount)compareacc).getBalance();

        // For Ascending order
        return (int) (this.balance - comparebal);

        // For Descending order do like this
        // return compareage-this.studentage;
    }

}

class BankAccountClient{
    public static void main(String[] args) {
        BankAccount B1 = new BankAccount("Peter",10000);
        BankAccount B2 = new BankAccount("Ann",5000);
        BankAccount B3 = new BankAccount("Perera",50000);
        BankAccount B4 = new BankAccount("Silva",100000);
        BankAccount B5 = new BankAccount("Jane",8000);

        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.add(B1);
        accounts.add(B2);
        accounts.add(B3);
        accounts.add(B4);
        accounts.add(B5);

        System.out.println("ALL ACCOUNT DETAILS");
        System.out.println("-------------------");
        for (BankAccount account : accounts) {
            System.out.println(account);
        }
        System.out.println("\n"+"Bank accounts with the balance more than 50000");
        for (BankAccount account : accounts) {
            if(account.getBalance() >50000)
            System.out.println(account);
        }
        System.out.println("\n"+"Names of the owners of the bank accounts with the balance less than 10000");
        for (BankAccount account : accounts) {
            if(account.getBalance() <10000)
                System.out.println(account.getName());
        }
        Collections.sort(accounts);
        System.out.println("\n"+"ALL ACCOUNT DETAILS SORTED BY BALANCE");
        System.out.println("-------------------------------------");
        for (BankAccount account : accounts) {
            System.out.println(account);
        }

    }
}