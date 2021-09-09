import java.util.Scanner;
public class HighLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int theNumber = (int) (1 + Math.floor(Math.random() * (100)));
//        System.out.println(theNumber);
        int userGuess;
        int totalUserGuesses = 0;
        System.out.println("Welcome to the guessing game. The  number has been set.");
        while (true){
            System.out.println("Guess a number from 1 to 100.");
            userGuess = Integer.parseInt(sc.nextLine());
            if(userGuess == theNumber){
                totalUserGuesses++;
                System.out.println("That's it!");
                System.out.println("It took you " + totalUserGuesses + " guess(es) to get it!");
                System.out.println("Would you like to play again? (Enter \"N\" to stop playing)");
                String playAgain = sc.nextLine();
                if(playAgain.contains("N") || playAgain.contains("n")){
                    System.out.println("Thanks for playing!");
                    break;
                } else {
                    totalUserGuesses = 0;
                }
            } else if(userGuess > theNumber){
                totalUserGuesses++;
                System.out.println("LOWER.");
            } else {
                totalUserGuesses++;
                System.out.println("HIGHER.");
            }
        }
    }
}
