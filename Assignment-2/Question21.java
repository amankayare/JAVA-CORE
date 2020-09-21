
/**
 *
 * 21. Program to show sum and average of 10 element array. 
 * Accept array elements from user. 
 * 
 * 
 */
import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {

        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements");

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter arr[" + i + "]");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("SUM OF ARRAY ELEMENTS: " + sum);
        System.out.println("AVG OF ARRAY ELEMENTS: " + (float) (sum / 10));

    }

}
