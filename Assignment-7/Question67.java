//67.	Write a program to read data from shopping.dat file created in above problem and find total money spent on all shopping items. . (Use ObjectInputStream to read Item class object).


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Question67 {

	public static void main(String[] args) {
		try {
			FileInputStream is = new FileInputStream("//home//aman//work-place//Git-Repositories//java-core_git//JAVA-CORE//Assignment-7//shopping.dat");
			ObjectInputStream ois = new ObjectInputStream(is);
			Question67 emp = (Question67) ois.readObject();
			ois.close();
			is.close();
			System.out.println(emp.toString());
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}

}
