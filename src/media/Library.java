package media;

public class Library {
    public static void main(String[] args) {
        Video hotRod = new Video("Hot Rod");
        hotRod.checkOut();
        hotRod.consume();

        AudioMedia clarity = new AudioMedia("Clarity by Jimmy Eat World on cassette tape (because it's 1999)");
        clarity.checkOut();
        clarity.consume();

    }
}
