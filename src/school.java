import java.util.Scanner;

public class school {
    static int passMark = 88;

    public static void main(String[] args) {
        String name;
        int physics;
        int maths;
        int chemistry;
        Scanner getInfo = new Scanner(System.in);

        System.out.println("Enter student's name");
        name = getInfo.nextLine();
        System.out.println("Enter student's marks\nphysics: ");
        physics = getInfo.nextInt();
        System.out.println("maths: ");
        maths = getInfo.nextInt();
        System.out.println("chemistry: ");
        chemistry = getInfo.nextInt();

        Student newStudent = new Student(name,physics,maths,chemistry);
        newStudent.CheckOpinion(passMark);
        System.out.println("pass mark is "+ " "+passMark);
        System.out.println(newStudent.name + " got " + Math.round(newStudent.avgMark) + " average mark");


    }

}
class Student{
    String name;
    int physics;
    int maths;
    int chemistry;
    double avgMark;

    Student(String sName,int sPhysics,int sMaths,int sChemistry){
        this.name = sName;
        this.physics = sPhysics;
        this.maths = sMaths;
        this.chemistry = sChemistry;
    }

    public void CheckOpinion(int passMark){
        avgMark = (physics+maths+chemistry)/3.0;
        if (avgMark >= passMark){
            System.out.println( name +" "+ "has passed");
        }
        else {
            System.out.println(name +" " + "should work hard to pass");
        }
    }

}

