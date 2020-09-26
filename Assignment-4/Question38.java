/**
 * 
38. Create a class Employee with three data members (empNo, salary and totalSalary) and following features.
a. Only parameterized constructor. [Do not overload the constructor]
b. totalSalary always represents salary total of all the employees created.
c. empNo should be auto incremented.
d. display total employees and totalSalary using a method.
Create another class EmployeeDemo (main class) that creates some Employee objects and calls Employee method to display no. of employees and total of their salaries.
 * 
 * 
 */
class Employee {

        private static int empNo = 0;
        private float salary;
        static float totalSalary = 0.0f;

        Employee(float salary){
            Employee.empNo += 1;
            this.salary = salary;
            Employee.totalSalary += salary;
        }
        static void display(){

            System.out.println("Total salary: " + Employee.totalSalary);
            System.out.println("Total Employees: "+Employee.empNo);
        }



}
 public class Question38 {// class EmployeeDemo
    
    public static void main(String[] args) {
        
        Employee e1 = new Employee(1000.0f);
        Employee e2 = new Employee(1000.0f);
        Employee e3 = new Employee(1000.0f);
        Employee e4 = new Employee(1000.0f);

        Employee.display();

    }
}
