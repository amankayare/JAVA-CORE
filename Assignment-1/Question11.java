/*
11. Write a program to swap two numbers without using third variable.
*/
public class Question11 {
  
    public static void main(String[] args) {
        int a = 30;
        int b = 20;
    
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("A: "+a+" B: "+b);
    }
  

}
