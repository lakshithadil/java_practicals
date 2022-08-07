import java.util.Scanner;
public class secretMessageReader {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Secret message reader");
        System.out.println("---------------------");
        System.out.println("Enter the secret message:");

        // String input
        String originalMessage = myObj.nextLine();

        //split the originalMessage by underscore
        String[] Message = originalMessage.split("_");
        String secretMessage = Message[0];
        String key = Message[1];

        //split key by two characters
        String[] key_array = key.split("(?<=\\G.{2})");

        //decrypt and print the message
        System.out.println("Secret message says:");
        for (int i=0;i< key_array.length-1;i=i+2) {
            System.out.print(secretMessage.substring(Integer.parseInt(key_array[i]), Integer.parseInt(key_array[i+1]) + 1));
            System.out.print(" ");
        }

    }
}
