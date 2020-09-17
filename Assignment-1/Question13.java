/*

13. Program to find greatest in 3 numbers. [ once using if else statement 
and then using ternary operator ( logical operator) ]  

*/
public class Question13 {
    public static void main(String[] args) {
        
        int a = 1300;
        int b = 8000;
        int c = 1200;

        System.out.println("USING IF AND ELSE.....");
        if( a > b && a > c){
            System.out.println("GREATEST IS : "+"a");
        }
        else if (b > a && b > c){
            System.out.println("GREATEST IS : "+"b");

        }else if(c > a && c > b){

            System.out.println("GREATEST IS : "+"c");

        }
        System.out.println("USING TERNARY OPERATOR.....");

        char result = ( a > b && a > c)? 'a' :(b > a && b > c)? 'b' :(c > a && c > b) ? 'c':null;
        System.out.println("GREATEST IS : "+result);

    }
}
