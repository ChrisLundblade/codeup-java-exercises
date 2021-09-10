public class WolfTest {
    public static void main(String[] args) {
        Wolf fenrir = new Wolf("Fenrir", "Awwooooooooo (this is howling, okay? I will not be taking questions Re: this.)");
//        fenrir.name = "Fenrir";
//        fenrir.sound = "Awwooooooooo (this is howling, okay? I will not be taking questions Re: this.)";
        fenrir.makeNoise();
        fenrir.setName("Jeff");
        System.out.println(fenrir.getName());
        fenrir.setSound("i guess this makes me a talking wolf");
        System.out.println(fenrir.getSound());
    }
}
