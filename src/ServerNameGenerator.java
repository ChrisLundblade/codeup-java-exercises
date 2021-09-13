public class ServerNameGenerator {
//    Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
//    Create a method that will return a random element from an array of strings.
//    Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.
//    public String[] nouns = {"shoestring", "lampshade", "tax document", "injunction", "humbucker", "tri-tip", "beverage", "wizard", "tetsubo", "walrus"};
//    public String[] adjectives = {"hostile", "exuberant", "obsequious", "obnoxious", "absurd","byzantine","kafka-esque", "opaque", "keen", "misanthropic"};
    public static String randomStringFromArrayReturner(String[] inputStringArray){
        return inputStringArray[(int)(Math.floor(Math.random() * inputStringArray.length))];
    }

    public static void main(String[] args) {
        String[] nouns = {"shoestring", "fishmonger", "lampshade", "smorgåsbord", "tax document", "injunction", "humbucker", "tri-tip", "beverage", "wizard", "tetsubo", "walrus", "atlas beetle", "reverberation", "nail clipper"};
        String[] adjectives = {"hostile", "exuberant", "obsequious", "obnoxious", "absurd","byzantine","kafka-esque", "opaque", "keen", "misanthropic", "jaunty", "lugubrious"};

        System.out.println("Here is your server name: \n" + randomStringFromArrayReturner(adjectives) + " " + randomStringFromArrayReturner(nouns));
        System.out.println("Here is your server name: \n" + randomStringFromArrayReturner(adjectives) + " " + randomStringFromArrayReturner(nouns));
        System.out.println("Here is your server name: \n" + randomStringFromArrayReturner(adjectives) + " " + randomStringFromArrayReturner(nouns));
        System.out.println("Here is your server name: \n" + randomStringFromArrayReturner(adjectives) + " " + randomStringFromArrayReturner(nouns));
        System.out.println("Here is your server name: \n" + randomStringFromArrayReturner(adjectives) + " " + randomStringFromArrayReturner(nouns));
        System.out.println("Here is your server name: \n" + randomStringFromArrayReturner(adjectives) + " " + randomStringFromArrayReturner(nouns));
        System.out.println("Here is your server name: \n" + randomStringFromArrayReturner(adjectives) + " " + randomStringFromArrayReturner(nouns));
        System.out.println("Here is your server name: \n" + randomStringFromArrayReturner(adjectives) + " " + randomStringFromArrayReturner(nouns));
        System.out.println("Here is your server name: \n" + randomStringFromArrayReturner(adjectives) + " " + randomStringFromArrayReturner(nouns));
        System.out.println("Here is your server name: \n" + randomStringFromArrayReturner(adjectives) + " " + randomStringFromArrayReturner(nouns));
    }
}
