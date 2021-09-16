package media;

public class AudioMedia extends Media{
    public AudioMedia(String name){
        this.name = name;
    }
    public void consume(){
        System.out.println("Listening to " + this.name + "...");
    }
}
