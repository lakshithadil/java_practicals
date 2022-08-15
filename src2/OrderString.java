import java.lang.reflect.Array;
import java.util.*;

public class OrderString {
    public static void main(String[] args) {
        String [] stringsArray = new String[2];
        Scanner inString = new Scanner(System.in);
        System.out.print("Enter the 1st string: ");
        stringsArray[0] = inString.nextLine();
        System.out.print("Enter the 2nd string: ");
        stringsArray[1] = inString.nextLine();
        Arrays.sort(stringsArray);
        System.out.println(stringsArray[0]+","+stringsArray[1]);
        //Using ArrayList
       /* ArrayList <String> stringsList = new ArrayList<>();
        stringsList.add("banana");
        stringsList.add("apple");
        Collections.sort(stringsList);

        Iterator itr = stringsList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }*/
    }
}
