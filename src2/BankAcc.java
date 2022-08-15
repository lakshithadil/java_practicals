public class BankAcc {
    private String name;
    private float balance;

    public BankAcc(String name, float balance) {
        this.name = name;
        this.balance = balance;
    }

    void transfer (float amount) throws InsufficientBalanceException{
        if(balance<amount){
            throw new InsufficientBalanceException("Balance is less than the amount");
        }
        else {
            balance -= amount;
        }
    }

    public String getName() {
        return name;
    }

    public float getBalance() {
        return balance;
    }
}

class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class TestBank{
    public static void main(String[] args) {
        BankAcc b1 = new BankAcc("nimal",1000);
        try {
            b1.transfer(2000);
            System.out.println("Balance: "+b1.getBalance());
        }
        catch (Exception m){
            System.out.println("Exception occured: "+m);
        }

    }
}