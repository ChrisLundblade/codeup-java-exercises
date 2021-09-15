package vehicle;

public class Minivan extends Vehicle{
    public void alarm(){
        System.out.println("HAAAAAAAAAAA... HAAAAAAAAAAAA");
    }

    public Minivan(String name){
        super(name);

    }
    public Minivan(){
        super("generic minivan");

    }

    public void setName(String minivanName){
        this.name = minivanName;
    }

}
