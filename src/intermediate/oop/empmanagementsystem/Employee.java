package intermediate.oop.empmanagementsystem;
/* Employee Management System

Practice all OOP principles.
Create a system to manage different types of employees (e.g., permanent, contract-based).
*/
public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    void displayDetails(){
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Id: "+id);
        System.out.println("Salary: "+salary);
    }

    void calculateSalary(){}
}
