package shapes;

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5.00,4.00);
        System.out.println(box1.getArea());
        System.out.println(box1.getPerimeter());

        Square box2 = new Square(5.00);
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());


        Measurable myShape = new Square(15);
        System.out.println("Myshape has an area of " + myShape.getArea() + " square units and a perimeter of " + myShape.getPerimeter());

        Square mySquare = new Square(4);
        System.out.println("MySquare has an area of " + mySquare.getArea() + " square units and a perimeter of " + mySquare.getPerimeter());

        Rectangle myRectangle = new Rectangle(4,5);
        System.out.println("MyRectangle has an area of " + myRectangle.getArea() + " square units and a perimeter of " + myRectangle.getPerimeter());

        Quadrilateral rectangle2 = new Rectangle(4,5);
        System.out.println("rectangle2 has an area of " + rectangle2.getArea() + " square units and a perimeter of " + rectangle2.getPerimeter());
    }
}
