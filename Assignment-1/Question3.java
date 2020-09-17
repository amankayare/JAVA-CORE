/**
 * 
 * 
 * 3. Find the result of following expressions. You need to determine the
 * primitive data type of the variable by looking carefully the given expression
 * and initialize variables by any random value. A. y = x2 + 3x - 7 (print value
 * of y) B. y = x++ + ++x (print value of x and y) C. z = x++ - --y - --x + x++
 * (print value of x ,y and z) D. z = x && y || !(x || y) (print value of z) [
 * x, y, z are boolean variables ]
 * 
 * 
 * 
 */

class Question3 {

    public static void main(String[] args) {

        int x = 10;
        int y;
        int z;

        y = x * 2 + 3 * x - 7;
        /*
         * y= 10*2 + 3*10 - 7 = 43 x=10
         */
        System.out.println("Y: " + y);
        System.out.println("X: " + x);

        y = x++ + ++x;
        /*
         * y = 10 + 12 x=12
         */
        System.out.println("Y: " + y);
        System.out.println("X: " + x);

        z = x++ - --y - --x + x++;
        /*
         * z = 12 - 21 - 12 + 12
         */
        System.out.println("Y: " + y);
        System.out.println("X: " + x);
        System.out.println("Z: " + z);

        boolean a = true;
        boolean b = false;
        boolean c = false;
        c = a && b || !(a || b);
        /*
         * c = t && f || !(t || f) c = 0 || !(1) c = 0 || 0 c = 0
         * 
         */
        System.out.println("C: " + c);

    }

}