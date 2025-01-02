package intermediate.oop.empmanagementsystem;
/* Employee Management System

Practice all OOP principles.
Create a system to manage different types of employees (e.g., permanent, contract-based).
*/
public class Employee {
    int id;
    String name;
    double salary;

    private void displayDetails(){
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Id: "+id);
        System.out.println("Salary: "+name);
    }

    void calculateSalary(){}
}
