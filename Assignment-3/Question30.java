
/**
 * 30. Create an integer type 2-D array of size [3X3]. Take the elements from 
 * the user and  then calculate the sum of the elements present in the diagonal.
 * 
 */
import java.util.Scanner;

class Question30 {

    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.println("Enter arr[" + i + "][" + j + "]");
                arr[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(arr[i][j] + " ");

            }
            System.out.println(" ");
        }

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (j == i) {

                    sum += arr[i][j];
                }

            }
        }
        System.out.println("SUM OF DIAGONAL: " + sum);
    }
}