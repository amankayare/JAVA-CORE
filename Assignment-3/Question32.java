/**
 * 
 * 32. Modify the above program (no. 30) to count the no of Student objects created. 
 * [ In this program static variable is required ]
 * 
 */
    
import java.util.Scanner;

public class Question32 {
    
    private int rno;
    private String name;
    public static int count = 0;

    public void setData(String name, int rno) {

        this.name = name;
        this.rno = rno;
        Question32.count++;
    }

    public void showData() {
        System.out.println("NAME: " + this.name);
        System.out.println("RNO: " + this.rno);
    }
    public static void main(String[] args) {

        Question32 student = new Question32();
        student.setData("Aman", 16);
        student.showData();

        Question32 student2 = new Question32();
        student.setData("Arpit", 17);
        student.showData();

        System.out.println(Question32.count);
    }
}

class StudentDemo {

   
}


