package shapes;

public class Circle {
    private double radius;

    public double getArea(){
        return (this.radius * this.radius * Math.PI);
    }

    public double getCircumference(){
        return (this.radius * 2 * Math.PI);
    }

    public Circle(double radius){
        this.radius = radius;
    }
}
