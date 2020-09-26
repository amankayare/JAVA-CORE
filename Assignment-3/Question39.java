/**
 * 39. Create class Product with three data members (pid, price, quantity) and parameterized constructor that takes values for all 
 * three data members. Create a main method in different class (say ProductDemo) and perform following task:
a. Accept information for five Product objects from user and store objects in an array
b. Find pid of product with highest price. 
c. Create a static method (with array of product’s object as argument) in Product class to calculate and return total amount spent 
   on all products. ( amount spent on single product = price of product * quantity of product )
 * 
 * 
 */
import java.util.Scanner;
class Product{
    int pid;
    int price;
    int quantity;

    Product(int pid , int price, int quantity){
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;

    }
    static int calculate(Product arr[]){
        int sum = 0;

        for(Product i : arr){

            sum += ( ( i.price ) * ( i.quantity) );
        }

        return sum;
    }

}
public class Question39 {// class PersonDemo
 
    public static void main(String[] args) {
    
          
            Scanner sc = new Scanner(System.in);
            Product arr[] = new Product[5];
            for (int i = 0; i < 5; i++){
                    System.out.println("Enter PID of Product "+ (i+1));
                    int pid = sc.nextInt();
                   
                    System.out.println("Enter Price of Product "+(i+1));
                    int price = sc.nextInt();
                   
                    System.out.println("Enter Quantity of Product "+(i+1));
                    int quantity = sc.nextInt();
                    
                    Product product = new Product(pid,price,quantity);

                    arr[i] = product;

            }
            int temp = arr[0].price;
            for(int i = 1; i < arr.length ; i++){

                if(arr[i].price > temp){
                    temp = arr[i].price;
                }
            }
            System.out.println("TEMP: "+temp);

            for(int i = 0; i < arr.length ; i++){

                if(arr[i].price == temp){
                    System.out.println("Pid with highest price is " + arr[i].pid);
                    break;
                }
            }

            System.out.println("Total amount spent on all products is: "+Product.calculate(arr));

            
    }

    
}
