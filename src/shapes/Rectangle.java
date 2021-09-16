package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return (this.length*2) + (this.width*2);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public void setLength(double newLength) {
        this.length = newLength;
    }
    public void setWidth(double newWidth){
        this.width = newWidth;
    }


    // All of this goes away now as we implement Interfaces and abstract classes
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }
//
//    private double length;
//    private double width;
//
//    public void setLength(double length) {
//        this.length = length;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }
//
//    public double getLength() {
//        return length;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public double getArea(){
//        System.out.println("running rectangle area");
//        return this.length * this.width;
//    }
//
//    public double getPerimeter(){
//        System.out.println("running rectangle perimeter");
//        return ((this.length*2) + (this.width*2));
//    }
}
