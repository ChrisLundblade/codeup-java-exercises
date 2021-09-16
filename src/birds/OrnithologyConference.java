package birds;

public class OrnithologyConference {
    public static void main(String[] args) {
        Ornithologist jeff = new Ornithologist();
        Penguin testPenguin = new Penguin("Gentoo");
        jeff.changeBirdName("Emperor", testPenguin);
    }
}
