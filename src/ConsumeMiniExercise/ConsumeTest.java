package ConsumeMiniExercise;

public class ConsumeTest {
    public static void main(String[] args) {
        Pill antibiotic = new Pill("penicillin","take one orally every day until ALL are consumed");

        System.out.println("this pill is " + antibiotic.getMedicationName());
        antibiotic.checkIfExpired();
        antibiotic.consume();


        System.out.println("\nNow we're dealing with a carrot.");
        Carrot carrot = new Carrot(false);
        carrot.checkIfExpired();
        if(carrot.getPeeled() == false){
            System.out.println("Ugh... it's not peeled");
            carrot.setPeeled(true);
            System.out.println("Now it's peeled");
        }
        carrot.consume();
    }
}