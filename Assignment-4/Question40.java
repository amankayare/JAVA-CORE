
/**
 * 40. Create a class Student having data members name, roll no., age and score. Write a program to accept 10 records of student and
 *   store them in an array. And then arrange the student records based on the score group [0-50], [50-65], [65-80], [80-100].
 * 
 * 
 */
import java.util.Scanner;
import java.io.File; // Import the File class

class Student {

    String name;
    int rollNo;
    int age;
    int score;

    Student(String name, int rollNo, int age, int score) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.score = score;
    }

}

public class Question40 {

    static int getArraySize(Student arr[]){
        int size = 0;
        for(Student st : arr){
            if(st.score == 0)
            break;

            size+=1;
        }

        return size;
    }
    public static void main(String[] args) {

        Student arr[] = new Student[10];
        // Scanner sc = new Scanner(System.in);

        
          for (int i = 0; i < 10; i++) {
          
          System.out.println("Enter Name: "); String name = sc.next();
          
          System.out.println("Enter rollNo: "); int roll = sc.nextInt();
          
          System.out.println("Enter age: "); int age = sc.nextInt();
          
          System.out.println("Enter score: "); int score = sc.nextInt();
          
          Student student = new Student(name, roll, age, score); arr[i] = student;
          
          }
         

     /*   try {
            File myObj = new File("input.txt");
            Scanner myReader = new Scanner(myObj);
            int i = 0;
            while (myReader.hasNext()) {
                System.out.println("Enter Name: ");
                String name = myReader.next();

                System.out.println("Enter rollNo: ");
                int roll = myReader.nextInt();

                System.out.println("Enter age: ");
                int age = myReader.nextInt();

                System.out.println("Enter score: ");
                int score = myReader.nextInt();

                Student student = new Student(name, roll, age, score);
                arr[i] = student;
                i++;

            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
*/
        for (int i = 0; i < arr.length; i++) {

            System.out.println("NAME: " + arr[i].name);
            System.out.println("SCORE: " + arr[i].score);
            System.out.println("========================");

        }
        Student arrange[] = new Student[10];

        System.out.println("ARR SIZE: " + arr.length);
        System.out.println("BEFORE ARRANGE SIZE: " + getArraySize(arrange));



        for (int i = 0; i < 10; i++) {

            if (arr[i].score > 0 && arr[i].score <= 50) {
                arrange[i] = arr[i];

            }
        }
        System.out.println("1 ARRANGE SIZE: " + getArraySize(arrange));

        for (int i =getArraySize(arrange); i < 10; i++) {

            if (arr[i].score > 50 && arr[i].score <= 65) {
                arrange[i] = arr[i];
            }
        }
        System.out.println("2 ARRANGE SIZE: " + getArraySize(arrange));

        for (int i = getArraySize(arrange); i < 10; i++) {
            if (arr[i].score > 65 && arr[i].score <= 80) {
                arrange[i] = arr[i];
            }
        }
        System.out.println("3 ARRANGE SIZE: " + getArraySize(arrange));

        for (int i = getArraySize(arrange); i < 10; i++) {
            if (arr[i].score > 80 && arr[i].score <= 100) {
                arrange[i] = arr[i];
            }
        }
        System.out.println("4 ARRANGE SIZE: " + getArraySize(arrange));

        System.out.println("AFTER ARRANGE SIZE: " + getArraySize(arrange));

        System.out.println("*****************");

        for (int i = 0; i < 10; i++) {

            System.out.println("NAME: " + arrange[i]);
            //System.out.println("SCORE: " + arrange[i].score);
            System.out.println("*****************");

        }

    }
}