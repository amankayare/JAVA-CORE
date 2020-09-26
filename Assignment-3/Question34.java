/**
 * 34. Create a class Circle that has two data members, one to store the 
 * radius and another to store area and three methods first init() method 
 * to input radius from user, second calculateArea() method to calculate area 
 * of circle and third display() method to display values of radius and area.
 * Create class CircleDemo ( main class) that creates the Circle object 
 * and calls init(), calculateArea() and display() methods.
 * 
 * 
 */
import java.util.Scanner;
class Circle{

    private float radius;
    private float area;

    public void init(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        this.radius = sc.nextFloat();

    }
    public void calculateArea(){

        this.area = 2f*3.14f*this.radius;

    }
    public void display(){

        System.out.println("RADIUS: "+this.radius);
        System.out.println("AREA: "+this.area);
    }



}




public class Question34 {// circle Demo class 
    
    public static void main(String[] args) {
        
        Circle c = new Circle();
        c.init();
        c.calculateArea();
        c.display();
    }
}
