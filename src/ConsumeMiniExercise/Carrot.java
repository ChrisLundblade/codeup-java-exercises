package ConsumeMiniExercise;

public class Carrot implements Consumable{
    public Carrot(Boolean isPeeled){
        this.isPeeled = isPeeled;
    }
    private boolean isPeeled;

    // getters setters constructors...
    public void setPeeled(Boolean isPeeled){
        this.isPeeled = isPeeled;
    }
    public Boolean getPeeled(){
        return this.isPeeled;
    }



    public void consume() {
        System.out.println("Eat, bite by bite");
    }

    public void checkIfExpired() {
        System.out.println("Observe color and smell");
    }

    public void throwAway() {
        System.out.println("Throw into compost pile");
    }

}