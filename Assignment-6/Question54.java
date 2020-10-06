//54.	Write a program to reverse the given String.


import java.util.Scanner;

public class Question54
 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		String s=sc.next();
		StringBuilder str = new StringBuilder(s);
		str.reverse();
		System.out.println(str);
	}
}
