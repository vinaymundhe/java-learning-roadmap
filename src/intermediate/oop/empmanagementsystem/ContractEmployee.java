package intermediate.oop.empmanagementsystem;

public class ContractEmployee extends Employee {
    private String contractDuration;

    @Override
    void calculateSalary() {
        Employee employee = new Employee();
        double totalSalary = employee.getSalary() - (double) 10 /100;
        System.out.println("Salary for Contract Employee: "+totalSalary);
    }
}
