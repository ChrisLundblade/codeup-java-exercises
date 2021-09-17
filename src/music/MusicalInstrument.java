package music;

public abstract class MusicalInstrument implements Playable{
    private String instrumentClassification;

    public MusicalInstrument(String instrumentClassification){
        this.instrumentClassification = instrumentClassification;
    }

    public String getInstrumentClassification() {
        return instrumentClassification;
    }
    public void setInstrumentClassification(String newClassification){
        this.instrumentClassification = newClassification;
    }


}
