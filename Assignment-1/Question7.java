/*
7. Write a program to calculate sum of 5 subject’s marks & find percentage.
   Take the obtained marks from user using Scanner class.Output should be in
   this format [ percentage marks = 99 % ]. Use concatenation operator here.

*/

import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float sum = 0;
        for (int i = 0; i < 5; i++){

            float temp = sc.nextFloat();
            sum += temp;
            
        }
        /*
         * x = (sum*100)/500
         *  
         */
        System.out.println("SUM: "+sum);
        System.out.println("percentage marks = "+(sum*100)/500+" %");

    }
}
