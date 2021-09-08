import java.util.Scanner;

public class MyTherapist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Full disclosure: Therapist Bot is not certified to practice anything whatsoever. \n It is wise to take its advice with a fistful of grains of salt. \n");
        System.out.println("Hey, it's me, therapist bot. How are you today.");

        String userReply = scanner.nextLine();

        if (userReply.contains("not bad") || userReply.contains("Not bad")){
            System.out.println("That is good. Keep it up, champ.");
        } else if (userReply.contains("bad") || userReply.contains("Bad")){
            System.out.println("Oh no, what is wrong?");
            userReply = scanner.nextLine();
            if(userReply.contains("my job")){
                System.out.println("Mmm... you should get a new job. That's easy, right?");
            } else if(userReply.contains("my wife")){
                System.out.println("You should probably just do what she wants.");
            } else {
                System.out.println("Have you tried just running away? Just hit the road. Live in the woods. \n Or join the circus? Or join the clergy? Is any of this sounding good? ...join a... crime family?");
            }
        } else if (userReply.contains("not good")){
            System.out.println("Oh no. What seems to be the matter?");
            userReply = scanner.nextLine();
            if(userReply.contains("my job")){
                System.out.println("Mmm... you should get a new job. That's easy, right?");
            } else if(userReply.contains("my wife")){
                System.out.println("You should probably just do what she wants.");
            } else {
                System.out.println("Have you tried ignoring the problem and escaping into a vice? Try eating a whole tub of ice cream whenever you feel bad. \n And if that makes you feel bad, eat another. And also stop being lactose intolerant.");
            }
        } else if (userReply.contains("well")){
            System.out.println("That is good, keep it up, champ.");
        } else if (userReply.equals("good") || userReply.equals("Good")){
            System.out.println("My name's not 'grammar bot,' but I think you mean \"well.\"");
        } else {
            System.out.println("Mmm... how do you feel about that?");
            userReply = scanner.nextLine();

        }
    }
}
