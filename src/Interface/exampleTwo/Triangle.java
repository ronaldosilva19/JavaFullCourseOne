package Interface.exampleTwo;

public class Triangle implements GeometricFigure{
    private double base;
    private double height;
    private double sideA;
    private double sideB;
    private double sideC;

    Triangle(double base, double height, double sideA, double sideB, double sideC){
        this.setBase(base);
        this.setHeight(height);
        this.setSideA(sideA);
        this.setSideB(sideB);
        this.setSideC(sideC);
    }
    @Override
    public String getFigureName() {
        return "Triangle";
    }

    @Override
    public double getArea() {
        return (this.base * this.height) / 2;
    }

    @Override
    public double getPerimeter() {
        return (this.sideA + this.sideB + this.sideC);
    }

    public void setBase(double base){
        this.base = base;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setSideA(double sideA){
        this.sideA = sideA;
    }
    public void setSideB(double sideB){
        this.sideB = sideB;
    }
    public void setSideC(double sideC){
        this.sideC = sideC;
    }
    @Override
    public String toString(){
        return "Geometric Figure: " + this.getFigureName() + "\n" +
                "Area: " + this.getArea() + "\n" +
                "Perimeter: " + this.getPerimeter();
    }
}
