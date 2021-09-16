package shapes;

public class Square extends Quadrilateral{
    public Square(double side){
        super(side,side);
    }
    @Override
    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }
    public void setWidth(double side){
        this.width = side;
        this.length = side;
    }

    @Override
    public double getPerimeter() {
        return this.length*4;
    }
    public double getArea(){
        return this.length*this.width;
    }

    //    public Square(double side){
//        super(side, side);
//    }
//      wasn't running because I was calling without passing in a parameter
//    public double getArea(double side) {
//        System.out.println("running square area");
//        return side*side;
//    }
//      wasn't running because I was calling without passing in a parameter
//    public double getPerimeter(double side){
//        System.out.println("running square perimeter");
//        return 4*side;
//    }

}
