package intermediate.oop.empmanagementsystem;

public class ContractEmployee extends Employee {
    private String contractDuration;

    public ContractEmployee(int id, String name, double salary, String contractDuration) {
        super(id, name, salary);
        this.contractDuration = contractDuration;
    }

    @Override
    void calculateSalary() {
        Employee employee = new Employee();
        double totalSalary = employee.getSalary() - (double) 10 /100;
        System.out.println("Salary for Contract Employee: "+totalSalary);
    }
}
