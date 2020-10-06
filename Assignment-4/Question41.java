/**
 * 
 * 41. Write a program to demonstrate this() construct functionality.
 * 
 */

class Demo {

    Demo() {
        System.out.println("DEMO() CONSTRUCTOR");
    }

    Demo(int a) {
        this();
        System.out.println("DEMO(int a) CONSTRUCTOR");
    }

    void show() {
    }

}

public class Question41 {
    public static void main(String[] args) {
        Demo d = new Demo(10);

    }
}
