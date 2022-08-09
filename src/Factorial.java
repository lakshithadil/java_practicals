import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner inNum = new Scanner(System.in);
        System.out.print("Enter the number you want to get factorial: ");
        try {
            int num = inNum.nextInt();
            Factorial factorial = new Factorial();
            System.out.println("Factorial of "+num+" is "+ factorial.factorial(num));
        }
        catch (InputMismatchException e){
            System.out.println("Please enter an integer number");
        }

    }
    public double factorial(int n){
        if(n == 1){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
}
