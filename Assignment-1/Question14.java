
/*
14. Program to check that entered year is a leap year or not.
*/
import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        System.out.println("Enter a year");

        int year = new Scanner(System.in).nextInt();

        if(year%4==0){


            if( year%100!=0 || year%400==0 ){
                System.out.println("IS A LEAP YEAR");
            }
            else{
                System.out.println("NOT A LEAP YEAR");

            }
           
    
        } else{
            System.out.println("NOT A LEAP YEAR");

        }


    }
}
