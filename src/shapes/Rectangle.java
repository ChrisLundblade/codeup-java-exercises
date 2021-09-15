package shapes;

public class Rectangle {
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    private double length;
    private double width;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea(){
        System.out.println("running rectangle area");
        return this.length * this.width;
    }

    public double getPerimeter(){
        System.out.println("running rectangle perimeter");
        return ((this.length*2) + (this.width*2));
    }
}
