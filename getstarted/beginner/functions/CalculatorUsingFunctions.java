package beginner.functions;

// Calculator Using Functions: Create methods for addition, subtraction, multiplication, and division.
public class CalculatorUsingFunctions {

    private int addition(int a, int b){
        return a+b;
    }
    private int subtraction(int a, int b){
        return a-b;
    }
    private int multiplication(int a, int b){
        return a*b;
    }
    private int division(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {
        CalculatorUsingFunctions ob = new CalculatorUsingFunctions();

        System.out.println("Addition: "+ob.addition(15,5));
        System.out.println("Subtraction: "+ob.subtraction(15,5));
        System.out.println("Division: "+ob.division(15,5));
        System.out.println("Multiplication: "+ob.multiplication(15,5));
    }
}