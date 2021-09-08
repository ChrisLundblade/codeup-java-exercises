import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

//        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//        He answers 'Whatever.' to anything else.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bob, the teen nonverbally acknowledges your existence and 'presence' \n in a way which communicates the sort of performative disinterest teens often think of as \"cool.\" \nYou may attempt to communicate with the teen if you for some inexplicable reason wish to subject yourself to \n what passes for a conversation with him.");

        String userResponse;
        int teenAnnoyanceLevel = 0;
        while(true){
            if(teenAnnoyanceLevel >=15){
                System.out.println("Bob gets annoyed or bored (or both??) and storms off. You are now blessedly liberated from this \"conversation.\"");
                break;
            } else if(teenAnnoyanceLevel >= 10){
                System.out.println("Bob appears to be growing increasingly annoyed at this conversation.");
            }

            System.out.println("You may address the teen.");
            userResponse = scanner.nextLine();



            if(userResponse.endsWith("?")){
                teenAnnoyanceLevel++;
                System.out.println("Bob: Sure.");
            } else if (userResponse.endsWith("!")){
                System.out.println("Bob: Whoa, chill out!");
                teenAnnoyanceLevel+=3;
            } else if (userResponse.equals("")){
                System.out.println("Bob: Fine, be that way.");
                teenAnnoyanceLevel++;
            } else if (userResponse.contains("robert") || userResponse.contains("Robert")){
                System.out.println("Bob: Don't call me my full name, dude. You're not my dad!");
                teenAnnoyanceLevel+=3;
            }
            else {
                System.out.println("Bob: Whatever.");
                teenAnnoyanceLevel++;
            }
        }
    }
}
