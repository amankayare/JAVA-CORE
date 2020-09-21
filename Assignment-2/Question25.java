
/**
 * 
 * 25. Write the program to find the sum of even elements and 
 * sum of odd elements present in the array of integer type.
 * 
 */

import java.util.Scanner;

public class Question25 {
    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40, 50 ,60, 70};
        int odd = 0;
        int even = 0;

        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0) {
                odd += arr[i];
            } else {
                even += arr[i];
            }
        }

        System.out.println("EVEN: " + even);
        System.out.println("ODD: " + odd);
    }
}
