
/******
 * 
 * 44. Create three classes Faculty with two data members facultyId and salary and two methods, one intput() method for accepting facultyId 
 * as input and another printSalary() to print salary.FullTimeFaculty that inherits class Faculty with two data members’ basicSalary and
 * allowance. Override input() method in this class that calls super class inut() method and accepts basicSalary and allowance as input. 
 * Salary should not be accepted as input but should be calculated using formula (basicSalary + allowance)
PartTimeFaculty that inherits class Faculty with two data members’ workingHours, ratePerHour. Override input() method in this class
that calls super class inut() method and accepts workingHours and ratePerHour as input. Salary should not be accepted as input but 
should be calculated using formula ( workingHour * ratePerHour )
 * 
 */

import java.util.Scanner;

class Faculty {
    private int facultyId;
    private double salary;

    Faculty() {
        salary = 0;
    }

    protected double getSalary() {
        return salary;
    }

    protected void setSalary(double salary) {
        this.salary = salary;
    }

    void input(int facultyId) {
        this.facultyId = facultyId;
    }

    void printSalary() {
        System.out.println("Salary of facultyID: " + facultyId + " is " + salary);
    }

}

class FullTimeFaculty extends Faculty {
    private double basicSalary;
    private double allowance;

    FullTimeFaculty() {
        super();
        basicSalary = 0;
        allowance = 0;

    }

    void input(int facultyId, double basicSalary, double allowance) {
        input(facultyId);
        this.basicSalary = basicSalary;
        this.allowance = allowance;
        setSalary(basicSalary + allowance);
    }

}

class PartTimeFaculty extends Faculty {
    private double workingHour;
    private double ratePerHour;

    PartTimeFaculty() {
        super();
        workingHour = 0;
        ratePerHour = 0;

    }

    void input(int facultyId, double workingHour, double ratePerHour) {
        input(facultyId);
        this.workingHour = workingHour;
        this.ratePerHour = ratePerHour;
        setSalary(workingHour * ratePerHour);
    }

}

public class Question44 {

    public static void main(String[] args) {

        FullTimeFaculty faculty = new FullTimeFaculty();
        PartTimeFaculty pFaculty = new PartTimeFaculty();

        faculty.input(10, 600, 4000);
        pFaculty.input(20, 10, 2000);

        faculty.printSalary();
        pFaculty.printSalary();

    }

}
