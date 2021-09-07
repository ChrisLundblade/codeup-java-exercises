import java.util.Scanner;
public class myIOExperiment {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your name?");
//        String userInput = scanner.nextLine();
//
//        //System.out.println("Hello, " + userInput);
//        System.out.printf("Hello, %s.", userInput);

        System.out.println("Enter an integer.");
        //Using nextLine lets us avoid the 'return' input being taken as the value for a subsequent input scan
        int userInput = Integer.parseInt(scanner.nextLine());

        //System.out.printf("You entered %d%n", userInput);

        System.out.println("Enter a string.");
        String firstString = scanner.nextLine();
        System.out.println("Enter another string. Or else...");
        String secondString = scanner.nextLine();

        System.out.println("First sentence");
    }
}
