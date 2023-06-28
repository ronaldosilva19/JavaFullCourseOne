package Inheritance.ExampleTwo;

/**
 * @author Jose Ronaldo da Silva
 */
public class Wheel extends Bicycle{
    private boolean inProgress;

    public void setsInProgress(String value) {
        if(value.equals("Moving")){
            this.inProgress = true;
        }else if(value.equals("Stopped")) {
            this.inProgress = false;
        }
    }

    public boolean getInProgress(){
        return this.inProgress;
    }
    public void toSpin(){
        System.out.println("The wheel is turning...");
    }
    public void Stop(){
        System.out.println("The wheel is stopping...");
    }
}
