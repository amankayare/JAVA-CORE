/**
 * 29. Write a program to print the total number of one-D arrays in a two-D
 * array and the number of elements in every one-D array present in the two-D
 * arrays.
 * 
 * 
 */

public class Question29 {

    public static void main(String[] args) {

        int arr[][] = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 },
                { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 },
                { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 },
                { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 },
                { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 } };

        int oneD = 0;
        int twoD = 0;

        for (int[] arr1 : arr) {

            oneD++;
            for (int ar : arr1) {

                System.out.print(ar);
                twoD++;
            }
            System.out.println("");

        }
        System.out.println("Total number of one-D arrays in a two-D: " + oneD);
        System.out.println("the number of elements in every one-D array present in the two-Darrays: " + twoD / (oneD));

    }
}
