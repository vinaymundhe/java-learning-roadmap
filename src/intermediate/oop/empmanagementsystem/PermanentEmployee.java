package intermediate.oop.empmanagementsystem;

public class PermanentEmployee extends Employee {
    private String benefits;
    private double bonus;

    @Override
    void calculateSalary(){
        Employee employee = new Employee();
        double totalSalary = employee.getSalary() + bonus;
        System.out.println("Salary with bonus: "+totalSalary);
    }
}
