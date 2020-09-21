
/**
 * 
 * 24. Write a program to search an element in the array.
 */

import java.util.Scanner;

class Question24 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = { 71, 23, 53, 44, 50 };
        int no = sc.nextInt();
        int flag = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == no) {
                System.out.println("FOUND AT: arr[" + i + "]");
                flag++;
                break;
            }

        }
        if (flag == 0) {
            System.out.println("NOT FOUND: ");

        }

    }

}