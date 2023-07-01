package Acess.Modifiers.PackageThree.Two;

import Acess.Modifiers.PackageThree.One.ClassPackageOne;

/**
 * @author Jose Ronaldo da Silva
 */
public class ClassPackageTwo extends ClassPackageOne{
    public void Test(){
        super.setPrivateAttribute(10);
        System.out.println(super.getPrivateAttribute());
        super.setPrivateAttribute(-20);
        System.out.println(super.getPrivateAttribute());
    }

    public static void main(String[] args) {
         new ClassPackageTwo().Test();
    }
}
