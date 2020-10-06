/**
 * 25 -- 47 
35 -- 67 
 * 
 */
import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1;true; i++){

            if(i > num)
            break;

            sum = sum+( num);
            num = num / 2 ;

        }
        System.out.println(sum);
    }

}