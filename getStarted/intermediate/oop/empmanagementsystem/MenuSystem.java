package intermediate.oop.empmanagementsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuSystem {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();
        boolean continueOperation = true;

        while (continueOperation) {
            System.out.println("Choose Any Option: \n" +
                    "1. Add a new permanent employee).\n" +
                    "2. Add a new contract employee).\n" +
                    "3. Display details of all employees.\n" +
                    "4. Exit.");
            int userInput = scn.nextInt();

            switch (userInput) {
                case 1:
                    System.out.println("Enter Emp ID: ");
                    int empId = scn.nextInt();
                    scn.nextLine(); // Consume newline
                    System.out.println("Enter Name: ");
                    String empName = scn.nextLine();
                    System.out.println("Enter Salary: ");
                    double empSalary = scn.nextDouble();
                    scn.nextLine(); // Consume newline
                    System.out.println("Enter Benefits: ");
                    String empBenefits = scn.nextLine();
                    System.out.println("Enter Bonus amount: ");
                    double empBonus = scn.nextDouble();

                    PermanentEmployee permanentEmployee = new PermanentEmployee(empId, empName, empSalary, empBenefits, empBonus);
                    employeeList.add(permanentEmployee);
                    System.out.println("Permanant Employee Added Successfully!");
                    break;

                case 2:
                    System.out.println("Enter Emp ID: ");
                    int empIdContract = scn.nextInt();
                    scn.nextLine(); // Consume newline
                    System.out.println("Enter Name: ");
                    String empNameContract = scn.nextLine();
                    System.out.println("Enter Salary: ");
                    double empSalaryContract = scn.nextDouble();
                    scn.nextLine(); // Consume newline
                    System.out.println("Enter contract duration: ");
                    String empContDuration = scn.nextLine();

                    ContractEmployee contractEmployee = new ContractEmployee(empIdContract, empNameContract, empSalaryContract, empContDuration);
                    employeeList.add(contractEmployee);
                    System.out.println("Contract Employee Added Successfully!");
                    break;

                case 3:
                    for (Employee empList : employeeList) {
                        System.out.println("-----All Employee Details:-----");
                                empList.displayDetails();
                    }
                    break;

                case 4:
                    continueOperation = false;
                    System.out.println("Thanks for using the app. Goodbye!");
                    break;
            }
        }
    }
}
