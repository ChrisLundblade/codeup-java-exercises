package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public String getString(){
        System.out.println("Gib skring: ");
        String input = scanner.nextLine();
        return input;
    }
    public String getString(String prompt){
        System.out.println(prompt);
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
        //System.out.println("Enter an integer between " + min + " and " + max + ".");
        try{
            //works okay but invoking getString souts my prompt for a string which
            //I would consider to be not very user friendly and quite confusing
            int userInput = Integer.valueOf(getString("Enter an integer between " + min + " and " + max + "."));
            if (userInput > min && userInput < max){
                return userInput;
            } else {
                return this.getInt(min, max);
            }
        } catch (NumberFormatException nfe){
            System.out.println("That wasn't even a number.");
            System.out.println(nfe);
            System.out.println("Try again");
            return this.getInt(min, max);
        }

    }

//    public int getInt(){
//        System.out.println("Enter an integer.");
//        int userInput = Integer.parseInt(scanner.nextLine());
//        return userInput;
//    }
    public int getInt(){
        //System.out.println("Enter an integer.");
        try{
            int userInput = Integer.valueOf(getString("Enter an integer."));
                return userInput;
        } catch (NumberFormatException nfe){
            System.out.println("That wasn't even a number.");
            System.out.println(nfe);
            System.out.println("Try again");
            return this.getInt();
        }
    }

//    public double getDouble(double min, double max){
//        System.out.println("Enter a double between " + min + " and " + max + ".");
//        double userInput = Double.parseDouble(scanner.nextLine());
//        if (userInput >= min && userInput <= max){
//            return userInput;
//        } else {
//            return this.getDouble(min, max);
//        }
//    }
    public double getDouble(double min, double max){
        //System.out.println("Enter a double between " + min + " and " + max + ".");
        try{
            double userInput = Double.valueOf(getString("Enter a double between " + min + " and " + max + "."));
            if (userInput >= min && userInput <= max){
                return userInput;
            } else {
                return this.getDouble(min, max);
            }
        }catch(NumberFormatException nfe){
            System.out.println("That wasn't even a number.");
            System.out.println(nfe);
            System.out.println("Try again");
            return(getDouble(min,max));
        }
    }

    public double getDouble(){
        try{
            double userInput = Double.valueOf(getString("Enter a double."));
            return userInput;
        }catch(NumberFormatException nfe){
            System.out.println("That wasn't even a number.");
            System.out.println(nfe);
            System.out.println("Try again");
            return(getDouble());
        }
    }

    public Input(){
        this.scanner = new Scanner(System.in);
    }
}
