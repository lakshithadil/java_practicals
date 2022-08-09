import java.util.Arrays;
import java.util.Scanner;

public class GapInIntArrays {
    public static void main(String[] args) {
        GapInIntArrays gapInIntArray = new GapInIntArrays();
        int [] Array  = gapInIntArray.get();
        gapInIntArray.display(Array);
        System.out.println("\nMinimum gap is " +gapInIntArray.miniGap(Array));
    }
    public int [] get(){
        int size;
        Scanner arrayObject = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        size = arrayObject.nextInt();
        int [] inArray = new int[size];
        for (int i = 0;i<inArray.length;i++) {
            System.out.println("Enter the value: "+(i+1));
            inArray[i] = arrayObject.nextInt();
        }
        return inArray;
    }
    public void display(int [] arrayIn){
        System.out.println("Number of elements in the array: "+arrayIn.length);
        System.out.println("your values in the array");
        for (int val2:arrayIn) {
            System.out.print(val2+" ");
        }
    }
    public int miniGap(int [] arrayIn){
        if(arrayIn.length>=2) {
            int[] gap = new int[arrayIn.length - 1];
            for (int i = 0; i < arrayIn.length - 1; i++) {
                gap[i] = Math.abs(arrayIn[i + 1] - arrayIn[i]);
            }
            return Arrays.stream(gap).min().getAsInt();
        }
        else
            return 0;
    }
}
