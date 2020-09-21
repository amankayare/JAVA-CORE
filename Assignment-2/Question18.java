import java.util.Scanner;

/**
 * 
 * 18. Program to check whether number is prime or not.
 * 
 */
import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int flag = 0;
        while (num != 0) {
            if (temp % num == 0) {
                flag++;
            }
            num--;
        }

        if (flag == 2)
            System.out.println("PRIME NO");
        else
            System.out.println("NOT A PRIME NO");

    
            sc.close();
        }

}
