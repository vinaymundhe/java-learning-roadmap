package intermediate.oop.empmanagementsystem;

public class ContractEmployee extends Employee {
    String contractDuration;

    @Override
    void calculateSalary() {
        Employee employee = new Employee();
        double totalSalary = employee.salary - (double) 10 /100;
        System.out.println("Salary for Contract Employee: "+totalSalary);
    }
}
