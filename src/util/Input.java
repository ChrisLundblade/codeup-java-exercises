package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public String getString(){
        System.out.println("Gib skring: ");
        String input = scanner.nextLine();
        return input;
    }

    public boolean yesNo(){
        System.out.println("Input yes or no");
        switch (scanner.nextLine()){
            case("yes"):
                return true;
            case("Yes"):
                return true;
            case("Y"):
                return true;
            case("y"):
                return true;
            case("No"):
                return false;
            case("no"):
                return false;
            case("N"):
                return false;
            case("n"):
                return false;
            default:
                System.out.println("That's not a valid input so we're defaulting to false");
                return false;
        }
    }
    public boolean yesNo(String userInput){
        System.out.println("Input yes or no");
        switch (userInput){
            case("yes"):
                return true;
            case("Yes"):
                return true;
            case("Y"):
                return true;
            case("y"):
                return true;
            case("No"):
                return false;
            case("no"):
                return false;
            case("N"):
                return false;
            case("n"):
                return false;
            default:
                System.out.println("That's not a valid input so we're defaulting to false");
                return false;
        }
    }

    public int getInt(int min, int max){
        System.out.println("Enter an integer between " + min + " and " + max + ".");
        int userInput = Integer.parseInt(scanner.nextLine());
        if (userInput > min && userInput < max){
            return userInput;
        } else {
            return this.getInt(min, max);
        }
    }

    public int getInt(){
        System.out.println("Enter an integer.");
        int userInput = Integer.parseInt(scanner.nextLine());
        return userInput;
    }

    public double getDouble(double min, double max){
        System.out.println("Enter a double between " + min + " and " + max + ".");
        double userInput = Double.parseDouble(scanner.nextLine());
        if (userInput >= min && userInput <= max){
            return userInput;
        } else {
            return this.getDouble(min, max);
        }
    }

    public double getDouble(){
        System.out.println("Enter a double.");
        double userInput = Double.parseDouble(scanner.nextLine());
        return userInput;
    }

    public Input(){
        this.scanner = new Scanner(System.in);
    }
}
