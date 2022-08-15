import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner inString = new Scanner(System.in);
        System.out.println("Enter the string you want to revers: ");
        StringBuffer inStr = new StringBuffer(inString.nextLine());
        Reverse reverse = new Reverse();
        System.out.println(reverse.reverse(inStr));

    }
    public StringBuffer reverse(StringBuffer instr){
        return instr.reverse();
    }
}
