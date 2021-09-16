package birds;

public class Bird {
    //kind of bird
    private String name;

    public Bird(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise(){
        System.out.println("Tweet, tweet");
    }

    public void move(){
        System.out.println("Flap flap");
    }
}
