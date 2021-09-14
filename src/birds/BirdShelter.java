package birds;

public class BirdShelter {

    public void visitShelterAndHearBirds(Bird[] allTheBirdsArray){
        for(Bird bird : allTheBirdsArray){
            System.out.println(bird.getName() + " goes ");
            bird.makeNoise();
        }
    }

    public void takeCareOfTheBird(Bird birdPatient){
        birdPatient.makeNoise();
    }
}
