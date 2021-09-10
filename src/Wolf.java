public class Wolf {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String sound;
    public  String getSound(){
        return this.sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void makeNoise(){
        System.out.print(name + " goes " + Quote.randomQuote() + "!\n");
    }
    public Wolf(String name, String sound){
        this.name = name;
        this.sound = sound;
    }
}
