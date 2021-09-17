package music;

public class Piano extends  MusicalInstrument implements Tuneable, VolumeAdjustable{
    private int numberOfKeys;
    public Piano(String classification, int numberOfKeys){
        super(classification);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }
    public void setNumberOfKeys(int newKeyNum){
        this.numberOfKeys = newKeyNum;
    }

    public void startMusic(){
        System.out.println("*nice piano sounds*");
    }
    public void stopMusic(){
        System.out.println("*nice piano sounds stop*");
    }

    public void tuneInstrument(){
        System.out.println("*tinkers around with the strings for several hours and hundreds of dollars and when it's all said and done, the thing still isn't perfectly in tune*");
    }
    public void detuneInstrument(){
        System.out.println("*this just happens gradually over time but if you want to tinker with the string tension that will probably do it*");
    }

    public void volumeUp(){
        System.out.println("Play the keys harder/faster.");
    }
    public void volumeDown(){
        System.out.println("Play the keys more softly.");
    }
}
