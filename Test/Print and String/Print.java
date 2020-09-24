public class Print {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        System.out.println("SUM: " + a + b);// 2010

        System.out.println("SUM: " + (a + b));// 30 and cursor is next same line

        System.out.println(a + b + " :SUM");// 30 and cursor is next same line

        System.out.println((a + b) + " :SUM");// 30 and cursor is next same line

        System.out.print("SUM: " + (a + b));// 30 and cursor is at same line

    }
}
