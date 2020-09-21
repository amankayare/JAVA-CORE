/**
 * 
 * 17. Write a program to reverse a given number.
 */
import java.util.Scanner;


public class Question17 {
    
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        int rem ;
        while(num != 0){
            
            rev = rev * 10 + (num % 10);
            num = num / 10;
        }
        System.out.println("REVERSED NUMBER: " +rev);
        sc.close();
    }
}
