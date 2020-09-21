/**
 * 23. Write a program to reverse the array elements.
 * 
 * 1 2 3 4 5 6 7 8 temp = 1
 */
public class Question23 {
    public static void main(String[] args) {

        int arr[] = { 51, 23, 36, 41, 65, 16, 47, 38 };

        System.out.println("BEFORE: ");
        for (int i = 0; i < arr.length; i++)
        System.out.print(arr[i]+" ");


        for (int i = 0, j = arr.length - 1; j > i || i != j; i++, j--) {

            if (j < i || i == j)
                break;

            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
           

        }
        
        System.out.println("\nAFTER: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
    }
}
