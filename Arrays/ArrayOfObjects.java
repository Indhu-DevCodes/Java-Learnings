package Arrays;

import java.util.Arrays;

class Student {

    private long rollno;
    private String name;
    private int marks;

    public Student(long rollno, String name, int marks){
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

}

public class ArrayOfObjects {
    public static void main(String[] args) {
        // when we we create array of object it means we create an array which can hold the reference of object.

        Student s1=new Student(01, "Ravi", 95);        
        Student s2=new Student(02, "Raj", 99);
        Student s3=new Student(03, "Indu", 100);


        Student sts[]=new Student[3];   // it means we can create an array of Student reference type which can hold 5 different reference of Student object.
        sts[0]=s1;
        sts[1]=s2;
        sts[2]=s3;

        for (int i = 0; i < sts.length; i++) {
            System.out.println();
        }
    }
}
