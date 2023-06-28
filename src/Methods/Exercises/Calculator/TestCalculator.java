package Methods.Exercises.Calculator;

/**
 * @author Jose Ronaldo da Silva
 */
public class TestCalculator {
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        System.out.println(calculator.Operation(100.0, 50.0));
        System.out.println(calculator.Operation(100, 50.0));
        System.out.println(calculator.Operation(100.0, 2));
        System.out.println(calculator.Operation(10, 0));
        System.out.println(calculator.Operation(100, 351.0, 45));
    }
}
