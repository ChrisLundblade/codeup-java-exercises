import java.util.Scanner;

public class ComparisonMiniExercise {
    public static void main(String[] args) {
        // write a Java program that asks the user for their age and then tells them if they are a teenager or not.
        // bonus: if not, tell them whether they are younger or older than a teenager.
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age in years?");
        int userAge = Integer.parseInt(scanner.nextLine());

        if (userAge > 12 && userAge < 20){
            System.out.println("You are a teenager");
        } else if(userAge <13){
            System.out.println("You're not old enough yet to be a teen.");
        } else {
            System.out.println("Those teenage years are behind you.");
        }
    }
}
