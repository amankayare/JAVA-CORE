public class PrintfAndFormat {

    public static void main(String[] args) {

        int x = 10;
        float y = 20.34f;
        char z = 'A';

        System.out.printf("Hello");// Hello , cursor is at same line

        System.out.printf("Hello\n");// Hello , cursor is at next line

        System.out.printf("Hello  %d %f %c \n", x, y, z);// Hello 10 20.34 A , cursor is at same line

        System.out.printf("Hello  %e \n", y);// Hello 2.034000e+01 , Scientific notation i.e. in power of 10

        /*
         * using % we can provide the index and using $ we can give the specifier to the
         * corresponding index so we can pass the argument in any order and using this
         * we can set which specifier is for which argument. NOTE: format specifier is
         * independent of the order of arguments
         */

        System.out.printf("%1$d %1$d %1$d \n", x);// 10 10 10 , as all specifier is for 1 index

        System.out.printf("%1$d %2$f %1$d \n", x, y);// 10 2.340000 10 , as first specifier is for index 1 and second
                                                     // is for index 2 and third is for index 1

        System.out.printf("%1$d %2$f %3$c \n", x, y, z);// 10 2.340000 A , as first specifier is for index 1 and second
                                                        // is for index 2 and third is for index 3

        /*
         * System.out.printf(" %1$d %2$f %3$c \n", y, x, z);// ERROR as for index 1 the
         * specifier is %d and the variable at // index 1 is a float variable
         */

        /* WE can give width */
        System.out.printf("%d \n", 5); // 5
        System.out.printf("%d \n", x); // 10
        System.out.printf("%5d \n", x);// _ _ _ 10

        System.out.printf("%-5d \n", x); // 10 _ _ _

        /**
         * Width with flag => if we want to replace spaces with some characters then we
         * can use flag - Flag should be mentioned before width
         */
        System.out.printf("%05d \n", x); // 00010
        /*
         * System.out.printf("%0-5d", x); //NOT Allowed negative width
         *
         */
        int a = -10;
        int b = 20;
        System.out.printf("%(5d", a);// if number is negative then it will enclose in () OUTPUT: _ _ _ _ _(10)
        System.out.printf("%5d", a); // _ _ _ -10
        System.out.printf("%+5d %+5d \n", a, b); // _ _ _ _ _-10_ _ _ _ _+20 ; + flag will give the positive or negative
                                                 // sign
        /*
         * 
         * System.out.printf("%@5d",a) not all characters are allowed flag list : ( 0 ,
         * "" , + , - ) only this flags are allowed
         * 
         */

        // For float values
        float c = 123.45f;
        System.out.printf("%6f \n", c);// 123.450001 NOTE: float values never stored as it is but nearly
        System.out.printf("%6.2f \n", c);// 123.45 : after decimal we want only 2 and whole width should be 6 including
                                         // decimal point and after decimal values
        System.out.printf("%7.2f \n", c);// _123.45
        System.out.printf("%2.2f \n", c);// if actual value is having more values and we are giving width less then then
                                         // actual no then nothing will happen it will give the same number

        String str = "Aman";

        System.out.printf("%s \n", str);// Aman
        System.out.printf("%5s", str);// _Aman
        System.out.printf("%-10s", str);// Aman_ _ _ _ _ _

        System.out.format("%5s", str);// mormat method can also be used instead of printf
    }

}
