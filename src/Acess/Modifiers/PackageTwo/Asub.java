package Acess.Modifiers.PackageTwo;
import Acess.Modifiers.PackageOne.*;
public class Asub extends One{
    public static void main(String[] args){
        Asub asub = new Asub();
        System.out.println(asub.protectedMessage);
    }
}
