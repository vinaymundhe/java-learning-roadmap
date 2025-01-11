package intermediate.collections;

import java.util.HashMap;
import java.util.Map;

/*Use HashMap to store student names as keys and their grades as values.
Features:
Add a student and grade.
Update a grade.
Delete a student.
Display all students and their grades.*/
public class StudentGradesManager {
    public static void main(String[] args) {

        Map<String,Integer> studentGrades = new HashMap<>();
//        adding student and grades
        studentGrades.put("Vinay Mundhe", 99);
        studentGrades.put("Tom Cruise", 74);
        studentGrades.put("Shah Rukh Khan", 83);
        studentGrades.put("Roberto Carlos", 25);
        System.out.println("All student data: \n"+studentGrades);

//        deleting a student
        studentGrades.remove("Roberto Carlos");
        studentGrades.remove("Vinay Mundhe");
        System.out.println("After deleting: \n"+studentGrades);

//        updating a student grade
        studentGrades.replace("Tom Cruise",74,91);
        studentGrades.replace("Shah Rukh Khan",83,89);
        System.out.println("Updated a student data: \n"+studentGrades);
    }
}
