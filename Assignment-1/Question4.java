/*
 *4. Write a program that initializes 2 byte type of variables. 
     Add the values of these variables and store in a byte type of variable
     [Note: primitive down casting is required in this program ] . 
 * 
 * 
 */
public class Question4 {
    public static void main(String[] args) {
     
        byte one = 2;
        byte two = 3;

        byte three = Byte.valueOf( one+two);

    }
}
