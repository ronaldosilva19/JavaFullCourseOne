package Acess.Modifiers.PackageOne;
import Acess.Modifiers.PackageTwo.*;
public class One {
    protected String protectedMessage = "This is protected.";
    public static void main(String[] args){
        Three three = new Three();
        System.out.println(three.publicMessage);

        Two two = new Two();
       // System.out.println(two.privateMessage); compilation error.
    }
}
