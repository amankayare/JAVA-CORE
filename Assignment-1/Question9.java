
/**
 * 9. Write a program to read the days (eg. 670 days) as integer value using 
 * Scanner class. Now convert the entered days into complete years, months
 * and days and print them.
 * 
*/
import java.util.Scanner;

public class Question9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter days: ");
        int input = sc.nextInt();

        int year = 0;
        int month = 0;
        int day = 0;

        year = input / 365;

        input = input - (365 * year);

        month = input / 30;

        day = input - (month * 30);

        System.out.println("YEAR: " + year + " MONTH: " + month + " DAYS: " + day);

    }
}
