package shapes;

public class Square extends Rectangle{
    public Square(double side){
        super(side, side);
    }

    public double getArea(double side) {
        System.out.println("running square area");
        return side*side;
    }

    public double getPerimeter(double side){
        System.out.println("running square perimeter");
        return 4*side;
    }

}
