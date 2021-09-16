package birds;

public class Penguin extends Bird{
    public Penguin(String name){
        super(name);
    }

    public void makeNoise(){
        System.out.println("Honk honk");
    }
}
