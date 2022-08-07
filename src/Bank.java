import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        String name;
        String address;
        int tpNumber;
        int loyaltyYears;
        float depositAmount;
        int timePeriod;

        Scanner getInfo = new Scanner(System.in);
        System.out.println("WELCOME TO ABC BANK ACCOUNT PORTAL");
        System.out.println("Enter your name :");
        name = getInfo.nextLine();
        System.out.println("Enter your address :");
        address = getInfo.nextLine();
        System.out.println("Enter your telephone number :");
        tpNumber = getInfo.nextInt();
        System.out.println("Enter your loyalty years :");
        loyaltyYears = getInfo.nextInt();
        System.out.println("Enter your deposit amount :");
        depositAmount = getInfo.nextFloat();
        System.out.println("Input the number of years you keep the fixed deposit :");
        timePeriod = getInfo.nextInt();

        Customer newCustomer = new Customer(name,address,tpNumber,loyaltyYears,depositAmount);
        FixedDeposit newFixedDeposit = new FixedDeposit(loyaltyYears,depositAmount);
        newFixedDeposit.setDepositType();
        newFixedDeposit.calAccountBalance(timePeriod);
        newCustomer.timePeriod = timePeriod;
        newCustomer.interestRate = newFixedDeposit.getInterestRate();
        newCustomer.depositType = newFixedDeposit.getDepositType();
        newCustomer.accountBalance = newFixedDeposit.getAccountBalance();
        newCustomer.displayInfo();

    }

}

class Customer{
    String name;
    String address;
    int tpNumber;
    int loyaltyYears;
    float depositAmount;
    float interestRate;
    String depositType;
    float accountBalance;
    int timePeriod;
    Customer(String sName, String sAddress, int sTpNumber, int sLoyaltyYears, float sDepositAmount){
        this.name = sName;
        this.address = sAddress;
        this.tpNumber = sTpNumber;
        this.loyaltyYears = sLoyaltyYears;
        this.depositAmount = sDepositAmount;
    }
    public void displayInfo(){
        System.out.println("Account details");
        System.out.print("Name: " +name +"\nDeposit Amount :"+depositAmount+"\nDeposit type :"+depositType+"\ninterest Rate :"+interestRate*100 +"%"+"\nAccount Balance after "+timePeriod+" years :"+String.format("%.2f" ,accountBalance));
    }

}

class FixedDeposit{
    private final int loyaltyYears;
    private final float depositAmount;
    private float interestRate;
    private String depositType;
    private float accountBalance;

    public void setDepositType(){

        if(0 < loyaltyYears && 20 > loyaltyYears ){
            this.depositType = "Standard";
            this.interestRate = 0.04f;
        }
        else if(20 <= loyaltyYears && 39 >= loyaltyYears){
            this.depositType = "Silver";
            this.interestRate = 0.05f;
        }
        else if(40 <= loyaltyYears && 60 >= loyaltyYears){
            this.depositType = "Gold";
            this.interestRate = 0.07f;
        }
        else{
            this.depositType = "Platinum ";
            this.interestRate = 0.10f;
        }
    }
    public void calAccountBalance(int timePeriod){
        float balance = depositAmount;
        for(int i = 0;i<timePeriod;i++){
            balance = balance + balance*interestRate;
        }
        accountBalance = balance;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public String getDepositType() {
        return depositType;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public FixedDeposit(int loyaltyYears, float depositAmount) {
        this.loyaltyYears = loyaltyYears;
        this.depositAmount = depositAmount;
    }
}