
/**
 * 19. Calculate  series : 12+22+32+42+.........+n2
*/
import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {

            sum = sum + (i * 10) + 2;
            if (i == n)
                System.out.print((i * 10) + 2 + " = ");
            else
                System.out.print((i * 10) + 2 + "+");

        }
        System.out.println(sum);
    }

}
