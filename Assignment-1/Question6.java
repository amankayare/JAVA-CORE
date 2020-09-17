/**
 * 
 * 6. Write a program that takes radius of a circle as input.
 *    Read the entered radius using Scanner class.
 *    Then calculate and print the area and circumference of the circle
 * 
 * 
 **/

import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of a circle: ");
        int radius = sc.nextInt();
        
        System.out.println("CIRCLE AREA: "+ 3.14*(radius*radius));
        System.out.println("CIRCLE PARAMETER: "+ 2*3.14*radius);

    }
}
