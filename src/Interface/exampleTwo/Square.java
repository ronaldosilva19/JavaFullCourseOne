package Interface.exampleTwo;

public class Square implements GeometricFigure{
    private double side;

    Square(int side){
        this.setSide(side);
    }
    @Override
    public String getFigureName() {
        return "Square";
    }

    @Override
    public double getArea() {
        return (this.side * this.side);
    }

    @Override
    public double getPerimeter() {
        return (this.side) * 4 ;
    }

    public void setSide(int side) {
        this.side = side;
    }
    @Override
    public String toString(){
        return "Geometric Figure: " + this.getFigureName() + "\n"+
                "Area: " + this.getArea() + "\n" +
                "Perimeter: " + this.getPerimeter();
    }
}
