/**
 * 22. Sort a ten element array in descending order.
 */

public class Question22 {
    public static void main(String[] args) {

        int arr[] = { 11, 22, 31, 34, 55, 26, 17, 20, 9, 10 };

        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (arr[i] < arr[j]) {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                    
                }
            }
        }
        for (int i = 0; i < 10; i++)
            System.out.println(arr[i]);
    }
}
