import java.util.Scanner;

public class MethodsMiniExercises {


    public static String getStrInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an input.");
        return sc.nextLine();
    }

    public static int getIntInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer.");
        return sc.nextInt();
    }

    public static void strLengthMatchesInt(String stringInput, int intInput){
        if (stringInput.length() == intInput) {
            System.out.println("That matches the length of the input!");
        } else {
            System.out.println("That doesn't match the length of the input!");
        }
    }

    // TODO: break the following code apart into a few methods
    public static void main(String[] args) {
        strLengthMatchesInt(getStrInput(),getIntInput());
    }

}