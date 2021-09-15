package vehicle;

public class SportySedan extends Vehicle{
    public SportySedan(String name){
        super(name);
    }

    public SportySedan(){
        super("generic sporty sedan");
    }

    public void alarm(){
        System.out.println("OUUUWWWWW OUUWWWWW OUUUWWWWW OUUUWWWWW");
    }

    public void setName(String newSedanName){
        super.setName(newSedanName);
    }
}
