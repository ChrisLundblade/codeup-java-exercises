package media;

public class Video extends Media{
    public Video(String name){
        this.name = name;
    }
    public void consume(){
        System.out.println("Watching " + this.name + "...");
    }
}
