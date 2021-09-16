package vehicle;

public final class SUV extends Vehicle {
    public void makeNoise(){
        super.makeNoise();
        System.out.println("hhhrrooOOOOOM");
    }

    public SUV(){}

    public SUV(String name){
        this.name = name;
    }

    public void alarm(){
        System.out.println("sorry, i'm not coming up with a 4th alarm sound");
    }
}
