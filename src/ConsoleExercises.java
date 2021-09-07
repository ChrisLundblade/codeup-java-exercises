import java.sql.SQLOutput;
import java.util.Scanner;
import java.text.DecimalFormat;

public class ConsoleExercises {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //scanner.useDelimiter("\n"); //evidently this helps?
        //It makes the scanner .next() portion with 3 words not work on one line.
        double pi = 3.14159;
        System.out.format("%.2f%n", pi);

        System.out.println("Gimme a numbah!");
        int userInputInt = scanner.nextInt();
        System.out.println(userInputInt);

        System.out.println("Input 3 words");
        //scanner.next() evidently interprets a space as the end of the string
        //also this will keep waiting for a second and 3rd word. Hitting enter does not store nothing in there.
        //inputting more words separated by spaces has no effect. Only the first 3 are stored and printed
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
//        System.out.println(firstWord);
//        System.out.println(secondWord);
//        System.out.println(thirdWord);
        System.out.printf("Your three words were: %n%s%n%s%n%s.%n", firstWord, secondWord, thirdWord);

        System.out.println("Enter a sentence.");
        //String userSentence = scanner.next();
        //String userSentence = scanner.nextLine(); //This captures the carriage return from the last scanner.next()
        String userSentence = scanner.next() + scanner.nextLine();
        System.out.println("Your sentence said: " + userSentence + "\n");


        System.out.println("Enter the length of a room.");
        int roomLength = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the width of the same hypothetical room.");
        int roomWidth = Integer.parseInt(scanner.nextLine());
//        int area = roomWidth * roomLength;
//        int perimeter = (roomLength * 2) + (roomWidth *2);
//        System.out.printf("The area of the classroom is %d square units. %nThe perimeter of the classroom is %d units long.", area, perimeter);
        System.out.printf("The area of the classroom is %d square units. %nThe perimeter of the classroom is %d units long.%n", (roomLength*roomWidth), (2*(roomLength+roomWidth)));

//    BONUS STUFFFFFFFF
        System.out.println("What is your favorite quote?");
        String userFavQuote = scanner.nextLine();
        System.out.println("How many words are in that quote?");
        int userQuoteWords = Integer.parseInt(scanner.nextLine());
        String quoteArray [] = (userFavQuote.split(" "));
        System.out.println("You said it had " + userQuoteWords + ". Java says it has " + quoteArray.length + " words.");
        if (userQuoteWords == quoteArray.length){
            System.out.println("You were totally right. Look at you, being able to count and stuff. I bet you made it through elementary school.");
        } else {
            System.out.println("Liar! Or idiot... How do you not know how to count?");
        }

    }
}
