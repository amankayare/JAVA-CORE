/**
 * 
 * 37. Create a class Person with properties (name and age) with following features. 
a. Default age of person should be 18.
b. A person object can be initialized with name and age.
c. Method to display name and age of person
Create another class PersonDemo ( main class ) that demonstrates the functionalities of Person class by creating Person object and calling methods.
 * 
 */

class Person{

    String name;
    int age ;

    Person(){
        this.age = 18;
    }
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("NAME: "+this.name);
        System.out.println("AGE: "+this.age);
    }
}


public class Question37 {// class PersonDemo

    public static void main(String[] args) {
   
        Person person = new Person("AMAN",16);
        person.display();

        Person person2 = new Person();
        person2.display();
       
       
    }
    
}
