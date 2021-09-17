package music;

public class MusicTest {
    public static void detuneRetune(Tuneable tuneableObj){
        tuneableObj.detuneInstrument();
        tuneableObj.tuneInstrument();
    }
    public static void makeTwoStaccatoSounds(VolumeAdjustable va){
        va.volumeUp();
        va.volumeDown();
        va.volumeUp();
        va.volumeDown();
    }
    public static void main(String[] args) {
        Sax tenorSax = new Sax("Woodwind", "Tenor");
        System.out.println("You might think that this " + tenorSax.getSaxType() + " saxophone is a Brass instrument since it has a lot of brass parts,\nbut actually it is a " + tenorSax.getInstrumentClassification() + ".");

        tenorSax.detuneInstrument();
        tenorSax.tuneInstrument();
        tenorSax.startMusic();
        tenorSax.stopMusic();

        //I'll be honest im not sure how many keys a full size piano has, okay.
        Piano steinway = new Piano("String",82);
        System.out.println("This piano is a " + steinway.getInstrumentClassification() + " instrument. Theres some debate, and people who call it a percussion instrument\nbut we don't listen to those people. That way lies madness.");
        System.out.println("This piano has " + steinway.getNumberOfKeys() + " keys. Wow.");

        detuneRetune(steinway);
        makeTwoStaccatoSounds(steinway);


    }
}
