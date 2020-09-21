
/**
 * 
 * 20. Print all prime numbers between two given numbers. [ break continue ]
 * 
 */

import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower limit");
        int lower = sc.nextInt();
        System.out.println("Enter upper limit");
        int upper = sc.nextInt();

        for (int i = lower; i <= upper; i++) {

            int num = i;
            int temp = i;
            int flag = 0;

            while (num != 0) {
                if (temp % num == 0) {
                    flag++;
                }
                num--;
            }

            if (flag == 2)
                System.out.println("PRIME NO: " + i);
          
        }
        sc.close();

    }

}
