package birds;

public class Ornithologist {
    public void changeBirdName(String newBirdName, Bird birdToRename){
        String oldBirdName = birdToRename.getName();
        birdToRename.setName(newBirdName);
        System.out.println("The " + oldBirdName + " has been renamed to " + birdToRename.getName());
    }
}
