package intermediate.oop.empmanagementsystem;

public class PermanentEmployee extends Employee {
    String benefits;
    double bonus;

    @Override
    void calculateSalary(){
        Employee employee = new Employee();
        double totalSalary = employee.salary + bonus;
        System.out.println("Salary with bonus: "+totalSalary);
    }
}
