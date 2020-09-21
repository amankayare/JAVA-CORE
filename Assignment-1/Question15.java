
/*

15. Accept person’s gender (character m for male and f for female), age (integer)
as input and then check whether person is eligible for marriage or not.


*/
import java.util.Scanner;

public class Question15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter gender f=female/m=male: ");
        String gender = sc.next();
        System.out.println("Enter age: ");
        int age = sc.nextInt();

        if (gender.equals("f") && age >= 18) {
            System.out.println("ELIGIBLE");
        } else if (gender.equals("m") && age >= 21) {
            System.out.println("ELIGIBLE");

        } else {
            System.out.println("NOT ELIGIBLE");

        }
        sc.close();
    }

}
