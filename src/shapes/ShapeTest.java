package shapes;

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5.00,4.00);
        System.out.println(box1.getArea());
        System.out.println(box1.getPerimeter());

        Square box2 = new Square(5.00);
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());
    }
}
