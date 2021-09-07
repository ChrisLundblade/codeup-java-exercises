import java.util.Scanner;

public class ControlFlowBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        You have to design the code such that the user has only three tries to guess the correct pin of the account. You set the pin as a constant with a final attribute. When correct display "Correct, welcome back." When incorrect display "Incorrect, try again.". When ran out of tries display "Sorry but you have been locked out."
//        program Starts:
//```
//        Please enter pin:
//        22132
//        Output:
//        Incorrect, try again.
//                Please enter pin:
//        23412
//        Output:
//        Incorrect, try again.
//                Please enter pin:
//        12345
//        Output:
//        Correct, welcome back.
        int loginAttempts = 0;
        System.out.println("...");
        while (true){
            System.out.println("Please enter your 5-digit pin:");
            int userPinInput = Integer.parseInt(scanner.nextLine());
            if(userPinInput == 12345){
                System.out.println("Correct, welcome back.");
                break;
            } else{
                loginAttempts++;
                if(loginAttempts > 3){
                    System.out.println("Sorry, but you have been locked out.");
                    break;
                } else{
                    System.out.println("Incorrect, try again.");
                }
            }

        }
    }
}
