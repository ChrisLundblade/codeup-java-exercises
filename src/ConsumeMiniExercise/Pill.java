package ConsumeMiniExercise;

public class Pill implements Consumable {
    public Pill(String medicationName, String pharmacistInstructions){
        this.medicationName = medicationName;
        this.pharmacistInstructions = pharmacistInstructions;
    }

    private String medicationName;
    private String pharmacistInstructions;

    // getters setters constructors...
    public void setMedicationName(String newMedicationName){
        this.medicationName = newMedicationName;
    }
    public String getMedicationName(){
        return this.medicationName;
    }

    public void setPharmacistInstructions(String newPharmacistInstructions){
        this.pharmacistInstructions = newPharmacistInstructions;
    }

    public String getPharmacistInstructions(){
        return this.pharmacistInstructions;
    }

    //implementations
    public void consume() {
        //makes more sense to me that consumption would follow pharmacist instructions
        System.out.println(this.pharmacistInstructions);
        //System.out.println("Drink down with fluid");
    }

    public void checkIfExpired() {
        System.out.println("Check expiration date on pill bottle");
    }

    public void throwAway() {
        System.out.println("Store in tub of coffee grounds for a few weeks before dumping out.");
    }

}