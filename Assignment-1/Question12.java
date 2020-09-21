
/*

12. In a company an employee is paid as under: If his basic salary is less
than Rs. 10000, then HRA = 10% of basic salary and DA = 90% of basic salary.
If his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000 and
DA = 98% of basic salary. If the employee's salary is input by the user 
write a program to find his gross salary. [ formula : GS= Basic + DA + HRA ]

*/
import java.util.Scanner;

public class Question12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic salary: ");
        float basic = sc.nextFloat();

        float hra;
        float da;

        if (basic < 10000) {
            hra = 0.10F * basic;
            da = 0.90F * basic;
            System.out.println("HRA: " + hra);
            System.out.println("DA: " + da);
            System.out.println("GROSS SALARY: "+ (basic + da + hra));

        } else if (basic >= 10000) {
            hra = 2000;
            da = 0.98F * basic;
            System.out.println("HRA: " + hra);
            System.out.println("DA: " + da);
            System.out.println("GROSS SALARY: "+ (basic + da + hra));

        }
        sc.close();
    }
}
