package music;

public class Sax extends MusicalInstrument implements VolumeAdjustable, Tuneable{
    private String saxType;
    public Sax(String classification, String saxType){
        super(classification);
        this.saxType = saxType;
    }

    public String getSaxType(){
        return this.saxType;
    }
    public void setSaxType(String newSaxType){
        this.saxType = newSaxType;
    }

    public void startMusic(){
        System.out.println("*bwaaaaa na bweeee na ma na other sax sounds*");
    }
    public void stopMusic(){
        System.out.println("*sax sounds stop*");
    }

    public void tuneInstrument(){
        System.out.println("*adjusts mouthpiece and embrouchure, correcting the pitch*");
    }
    public void detuneInstrument(){
        System.out.println("*sax sounds begin to get \"microtonal\"*");
    }

    public void volumeUp(){
        System.out.println("*Saxophone intensifies*");
    }
    public void volumeDown(){
        System.out.println("*Sax gets softer*");
    }
}
