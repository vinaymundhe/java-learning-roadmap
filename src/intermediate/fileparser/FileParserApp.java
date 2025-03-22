package intermediate.fileparser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
File Parser App
Description: Read in a CSV file of employees (ID, name, salary), parse it, and allow lookups by ID or name.
Key Skills: File I/O, exception handling, CSV parsing, data storage in data structures.
*/

public class FileParserApp {
    public static void main(String[] args) {

        if (args.length == 0){
            System.out.println("Run command: java intermediate.fileparser.FileParserApp <path_to_csv_file>");
            System.exit(1);
        }

        String filePath = args[0];
        List<Employee> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            boolean skipHeader = true;

            while ((line = br.readLine()) != null){
                if (skipHeader){
                    skipHeader = false;
                    continue;
                }
                String[] columns = line.split(",");

                if (columns.length < 3){
                    System.out.println("Skipping malformed line: " + line);
                    continue;
                }

                String idStr = columns[0].trim();
                String name = columns[1].trim();
                String salaryStr = columns[2].trim();

                try{
                    int id = Integer.parseInt(idStr);
                    double salary = Double.parseDouble(salaryStr);

                    Employee emp = new Employee(id, name, salary);
                    employees.add(emp);
                } catch (NumberFormatException e){
                    System.out.println("Skipping line with invalid number: "+ line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + filePath);
            e.printStackTrace();
            System.exit(1);
        }
        System.out.println("Parsed employees from file: "+ filePath);
        for (Employee empData : employees){
            System.out.println(empData);
        }
    }
}
