package birds;

public class Finch extends Bird{
    public Finch(String name){
        super(name);
    }

    public void makeNoise(){
        System.out.println("chirp chirp");
    }
}
