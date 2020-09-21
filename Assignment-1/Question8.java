/*
 * 8. Write a program to find the simple interest. Take the 
 *  principle amount, rate of interest and time from user using Scanner class.
 * 
 * 
 */
import java.util.Scanner;

public class Question8 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle amount: ");
        float principle = sc.nextFloat();
        System.out.println("Enter rate of interest: ");
        float rate = sc.nextFloat();
        System.out.println("Enter time: ");
        float time = sc.nextFloat();

        System.out.println("SIMPLE INTEREST: "+principle*(1 + rate*time));
        sc.close();
    }
}
