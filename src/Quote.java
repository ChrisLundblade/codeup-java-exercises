public class Quote {
    public static String randomQuote() {
        switch ((int) (1 + Math.random() * 4)) {
            case (1):
                return ("\"Tis not the size of the dog in the fight that matters, tis the size of the fight in the dog\"");
            case (2):
                return ("\"The lion may be the king of the jungle, but the wolf does not perform in the circus\"");
            case (3):
                return ("\"At the end of the game, the pawn and the King go back in the same box\"");
            case (4):
                return ("\"...but i do not love the bright sword for its sharpness, nor the arrow for its swiftness, nor the warrior for his glory.\nI love only that which they defend...\"");
            default:
                return ("\"This should never happen.\"");
        }

    }
}
