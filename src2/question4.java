import java.util.Scanner;

public class question4 {
    int n1;
    int n2;
    int[] array1;
    int[] array2;

    public static void main(String[] args) {
        question4 obj=new question4();
        obj.get();
        System.out.println("Are all values less in the first array: "+obj.allLes());


    }
    public void get(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the first array:");
        this.n1=sc.nextInt();
        array1 = new int[n1];
        //get the elements by user for first array
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n1;i++)
        {
            System.out.print("array["+i+"]:");
            this.array1[i]=sc.nextInt();
        }
        //get the elements for the second array
        System.out.print("Enter the length of the Second array:");
        this.n2=sc.nextInt();
        array2 = new int[n2];
        //get the elements by user for first array

        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n2;i++)
        {
            System.out.print("array["+i+"]:");
            this.array2[i]=sc.nextInt();
        }

    }
    public boolean allLes()
    { if(this.array1.length<this.array2.length){
        return false;
    }
        for(int i=0;i<this.array1.length;i++)
        {
            if(this.array1[i]>this.array2[i]){
                return false;
            }
        }
        return true;
    }

}
