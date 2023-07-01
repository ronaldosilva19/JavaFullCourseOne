package Acess.Modifiers.PackageThree.One;

/**
 * @author Jose Ronaldo da Silva
 */
public class ClassPackageOne {
    private int privateAttribute;
    int attributePackage;
    protected int attributeProtected;
    public int attributePublic;

    public void setPrivateAttribute(int privateAttribute) {
        if(privateAttribute > 0){
            this.privateAttribute = privateAttribute;
        }else{
            System.out.println("Negative value not allowed.");
        }

    }

    public int getPrivateAttribute() {
        return this.privateAttribute;
    }

    public void setAttributePackage(int attributePackage) {
        this.attributePackage = attributePackage;
    }

    public int getAttributePackage() {
        return this.attributePackage;
    }
    public void setAttributeProtected(int attributeProtected){
        this.attributeProtected = attributeProtected;
    }

    public int getAttributeProtected() {
        return this.attributeProtected;
    }

    public void setAttributePublic(int attributePublic) {
        this.attributePublic = attributePublic;
    }

    public int getAttributePublic() {
        return this.attributePublic;
    }
}
