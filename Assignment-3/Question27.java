
/**
 * 27. Write a program to fine the smallest 
 * and greatest number present in the array of integer type.
 * 
 * 
 */

import java.util.Scanner;

public class Question27 {
    public static void main(String[] args) {

        int arr[] = { 22, 23, 44, 12, 11, 16, 47, 33, 29 };

        int max = arr[0];
        int min = arr[0];

        for (int i = 0, j = 0; j < arr.length - 1 || i < arr.length - 1; i++, j++) {

            if (arr[i] > max) {

                max = arr[i];

            }

            if (arr[j] < min) {

                min = arr[j];

            }
        }
        System.out.println("MAX: " + max);
        System.out.println("MIN: " + min);
    }
}
