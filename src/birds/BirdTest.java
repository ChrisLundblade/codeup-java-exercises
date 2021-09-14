package birds;

public class BirdTest {
    public static void main(String[] args) {
        Bird cardinal = new Bird();
        cardinal.setName("cardinal");

        System.out.println(cardinal.getName() + " says:");
        cardinal.makeNoise();
        cardinal.move();

        Duck mallard = new Duck();
        mallard.setName("Mallard");
        mallard.makeNoise();
    }
}
