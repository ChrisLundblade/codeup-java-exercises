package birds;

public class Duck extends Bird{
    public Duck(String name){
        super(name);
    }

    public void makeNoise(){
        System.out.println("quack quack");
    }
}
