import java.util.Scanner;

/**
 * 
 * 16. Write a program to print table of any entered number using loop.
 * 
 */

public class Question16 {

    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(no + " x " + i + " =" + (no * i));
        }
        sc.close();
    }

}
