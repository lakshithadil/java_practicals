/*public class Test {
    public static void main(String[] args) {
        System.out.println("helo");
    }
}*/

// Java program to sort ArrayList of Custom Object
// Using Comparable class

// Importing required classes
import java.util.*;

// Class 1
// Main class
// ArrayListSorting
class GFG {

    // Main driver method
    public static void main(String args[]) {

        // Creating an empty ArrayList of Student type
        ArrayList<Student> arraylist
                = new ArrayList<Student>();

        // Adding elements to above List
        arraylist.add(new Student(12, "Riya", 15));
        arraylist.add(new Student(14, "Mahima", 16));
        arraylist.add(new Student(13, "Shubhi", 15));

        // Sorting above list using sort() method
        // of Collections class
        Collections.sort(arraylist);

        // Iterating over list via for each loop and
        // printing all elements inside the List
        for (Student str : arraylist) {
            System.out.println(str);
        }
    }
}

// Class 2
// Implementing Comparable interface
 class Student implements Comparable<Student> {

    // Class data members
    private String studentname;
    private int rollno;
    private int studentage;

    // Constructor of Student class
    public Student(int rollno, String studentname,
                   int studentage) {

        // this keyword refers to current instance itself
        this.rollno = rollno;
        this.studentname = studentname;
        this.studentage = studentage;
    }


    // Getter and Setter methods

    public String getStudentname() { return studentname; }
    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public int getRollno() { return rollno; }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getStudentage() { return studentage; }
    public void setStudentage(int studentage) {
        this.studentage = studentage;
    }


    // overriding the compareTo method of Comparable class
    @Override public int compareTo(Student comparestu) {
        int compareage
                = ((Student)comparestu).getStudentage();

        // For Ascending order
        return this.studentage - compareage;

        // For Descending order do like this
        // return compareage-this.studentage;
    }

    @Override public String toString() {
        return "[ rollno=" + rollno + ", name="
                + studentname + ", age=" + studentage + "]";
    }
}

