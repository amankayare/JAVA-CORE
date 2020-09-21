
/**
 * 31. Create a class Student with 2 data members rno and name. Create one method
 * setData() that takes roll number and student name as parameter and stores them 
 * in data members rno and name. Create one more method showData() to print the
 * data member values. Create another class ( main class) StudentDemo that creates
 * Student class object and calls setData() and showData() methods.
 * 
 * 
 */
import java.util.Scanner;

class Student {
    int rno;
    String name;

    public void setData(String name, int rno) {

        this.name = name;
        this.rno = rno;
    }

    public void showData() {
        System.out.println("NAME: " + this.name);
        System.out.println("RNO: " + this.rno);
    }
}

class StudentDemo {

    public static void main(String[] args) {

        Student student = new Student();
        student.setData("Aman", 16);

        student.showData();
    }
}

public class Question31 {

}
