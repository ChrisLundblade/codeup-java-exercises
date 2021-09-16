package media;

public abstract class PrintMedia extends Media{
    public PrintMedia(String name){
        this.name = name;
    }
    public void consume() {
        System.out.println("Reading " + this.name +"...");
    }
}
