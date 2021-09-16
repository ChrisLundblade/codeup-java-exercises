package birds;

public class BirdShelterTest {
    public static void main(String[] args) {
        Bird[] birds = new Bird[3];
        birds[0] = new Finch("Lesser Goldfinch");
        //birds[0].setName("Lesser Goldfinch");
        birds[1] = new Duck("Mallard");
        //birds[1].setName("Mallard");
        birds[2] = new Penguin("Gentoo Penguin");
        //birds[2].setName("Gentoo Penguin");

        BirdShelter healingWings = new BirdShelter();
        healingWings.visitShelterAndHearBirds(birds);

        healingWings.takeCareOfTheBird(birds[2]);
    }


}
