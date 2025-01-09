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

    public PermanentEmployee(int id, String name, double salary, String benefits, double bonus) {
        super(id, name, salary);
        this.benefits = benefits;
        this.bonus = bonus;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


}
