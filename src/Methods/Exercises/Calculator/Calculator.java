package Methods.Exercises.Calculator;

/**
 * @author Jose Ronaldo da Silva
 */
public class Calculator {
    public double Operation(double numberOne, double numberTwo){
        return numberOne + numberTwo;
    }

    public double Operation(int numberOne, double numberTwo){
        return numberTwo - numberOne;
    }
    public double Operation(double numberOne, int numberTwo){
        return numberOne * numberTwo;
    }
    public double Operation(int numberOne, int numberTwo){
        if(numberTwo == 0) {
            System.out.println("Is not possible divide by zero.");
            return -1;
        }
            return (double) numberOne / (numberTwo);
    }
    public double Operation(int numberOne, double numberTwo, int numberThree){
        return (numberTwo % numberOne) * numberThree;
    }
}
