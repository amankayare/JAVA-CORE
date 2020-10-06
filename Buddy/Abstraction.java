abstract class Animal {

    int legs;
    String name;

    public abstract void awaaz();

    public Animal(int legs, String name) {
        this.legs = legs;
        this.name = name;
    }

    public void display() {

        System.out.println("Legs: " + legs);
        System.out.println("Name: " + name);

    }

}

class Dog extends Animal {

    String rang;
    String bread;

    Dog(int legs, String name, String rang, String bread) {
        super(legs, name);
        this.rang = rang;
        this.bread = bread;
    }

    public void awaaz() {
        System.out.println("BHOOW BHOOW BHOWWWWWWW");
    }

    public void display() {

        super.display();
        System.out.println("Rang: " + rang);
        System.out.println("Bread: " + bread);
    }

}

public class Abstraction {
    public static void main(String[] args) {

        Animal d = new Dog(3, "Bruno", "black", "GermanShepher");
        d.awaaz();
        d.display();
    }
}
