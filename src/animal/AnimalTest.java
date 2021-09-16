package animal;

public class AnimalTest {
    public static void main(String[] args) {
        Dog spot = new Dog("spot", "Dalmatian", 10, 45);
        spot.responseToCommand("sit");

        Cat felix = new Cat("Felix", "idk, some kind of feline", 7, 20);
        felix.responseToCommand("sit");


    }

}
