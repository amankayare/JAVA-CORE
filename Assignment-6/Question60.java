/*60.	Create Interface StudentFee and declare following method. 
getFee() throws InvalidFeeException. This method ask fees from user 
and throws exception if user enters invalid or negative fees Create
class Student with members (name, fees) and implement the StudentFee Interface.

*/
import java.util.Scanner;

interface StudentFee{
	int getFee();
}

public class Question60 implements StudentFee {
	
	static String name;
	int fee;
	
	public static void main(String[] args) {
		System.out.println("Enter name : ");
		Scanner sc = new Scanner(System.in);
		Question60 q = new Question60();
		q.name = sc.next();
		q.fee = q.getFee();
		System.out.println("Name : "+q.name+" Fee : "+q.fee);
	}

	@Override
	public int getFee() {
		System.out.println("Enter the Fee : ");
		Scanner sc = new Scanner(System.in);
		fee = sc.nextInt();
		if(fee<0) {
			try {
				throw new Exception("InvalidFeeException");
			} catch (Exception e) {
				System.out.println(e);
			}
		}else {
		return fee;
		}
		return 0;
	}

}
