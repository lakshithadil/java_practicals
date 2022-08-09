import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int min = 100;
        int max = 0;
        int min2,max2;
        int [] num = {80,54,62,32,87,20,98,74,45,21};
        for(int i =0;i<num.length;i++){
            System.out.println(num[i]);
        }
        System.out.println("using advanced for loop");
        //advanced for loop
        for(int i:num){
            System.out.println(i);
        }

        min2 = Arrays.stream(num).min().getAsInt();
        max2 = Arrays.stream(num).max().getAsInt();
        System.out.println("Minimum value in the array is " + min2);
        System.out.println("Maximum value in the array is " + max2);

        System.out.println("using for loops");
        //using for loops
        for (int i = 0; i <num.length ; i++) {
            if(num[i]>max){
                max = num[i];
            }
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("Minimum value in the array is " + min);
        System.out.println("Maximum value in the array is " + max);

        int [][] a = {{1,1,1},{2,2,2},{3,3,3}};
        int [][] b = {{1,2,3},{2,3,4},{3,4,3}};
        int [][] c = new int[3][3];
        //subtract two matrices (a-b)
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j]-b[i][j];
            }
        }
        //print the output matrix c
        System.out.println("values in c array:");
        for (int [] val:c) {
            for (int val2:val) {
                System.out.print(val2 +" ");
            }
        }
        //clone the c array
        int [][] cloneC = c.clone();
        System.out.println("\nAre both equal? "+(Arrays.deepEquals(c, cloneC)));
        //print the cloneC array
        System.out.println("values in cloneC array:");
        for (int [] val:cloneC) {
            for (int val2:val) {
                System.out.print(val2 +" ");
            }
        }
       //System.out.println(a.length);
    }
}
