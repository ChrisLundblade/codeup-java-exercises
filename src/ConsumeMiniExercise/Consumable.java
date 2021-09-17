package ConsumeMiniExercise;

public interface Consumable{
    abstract void consume();
    abstract void checkIfExpired();
    abstract void throwAway();
}
