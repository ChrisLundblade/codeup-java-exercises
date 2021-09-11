package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("What is the radius of the circle in meters?");
        double radius = input.getDouble(0, (double) Integer.MAX_VALUE);
        Circle myCircle = new Circle(radius);
        System.out.println("My circle has an area of " + myCircle.getArea() + " square meters.");
        System.out.println("My circle has a circumference of " + myCircle.getCircumference() + " meters.");

//        System.out.println("Keep making circles?");
//        boolean keepMakingCircles = input.yesNo();
//        while (keepMakingCircles){
//
//
//            System.out.println("Keep making circles?");
//            keepMakingCircles= input.yesNo();
//        }
    }
}
