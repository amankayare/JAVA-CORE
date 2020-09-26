/**
 * 33. Write a program to demonstrate functionalities of this keyword in java.
 * 
 */
public class Question33 {

    private String name;
    private int roll;

    public void setDataWithOutThis(String name, int roll) {

        name = name;
        roll = roll;

    }

    public void setDataWithThis(String name, int roll) {
        this.name = name;
        this.roll = roll;

    }

    public void displayWithOutThis() {
        System.out.println("name: "+name);
        System.out.println("roll: "+roll);
    }

    public void displayWithThis() {
        System.out.println("this.name: "+this.name);
        System.out.println("this.roll: "+this.roll);
    }

    public static void main(String[] args) {

        Question33 obj = new Question33();
    
        obj.setDataWithOutThis("Aman", 16);
        obj.displayWithOutThis();// null 0
        obj.displayWithThis();// null 0
    
        obj.setDataWithThis("Aman", 16);
        obj.displayWithOutThis();// aman 16

        obj.setDataWithThis("Arpit", 17);
        obj.displayWithOutThis();// arpit 17
    
    }
}
