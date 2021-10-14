import java.util.Locale;

public class JavaDrills {
//    Work in progress
    public static String flipOuterCase(String input){
        String flippedStr = "";
        System.out.println(input.substring(0,1));
        if(input.substring(0,1).equals(input.substring(0,1).toUpperCase(Locale.ROOT))){
            flippedStr += input.substring(0,1).toLowerCase(Locale.ROOT);
        } else {
            flippedStr += input.substring(0,1).toUpperCase(Locale.ROOT);
        }

        flippedStr = input.substring(1,input.length()-1);
        if(input.substring(input.length()-1,input.length()).equals(input.substring(input.length()-1,input.length()).toUpperCase(Locale.ROOT))){
            flippedStr += input.substring(input.length()-1,input.length()).toLowerCase(Locale.ROOT);
        } else {
            flippedStr += input.substring(input.length()-1,input.length()).toUpperCase(Locale.ROOT);
        }
        return flippedStr;
    }

    public static void main(String[] args) {
        System.out.println(flipOuterCase("cat")); // CaT
        System.out.println(flipOuterCase("CaT")); // cat
        System.out.println(flipOuterCase("caT")); // Cat
        System.out.println(flipOuterCase("cAt")); // CAT
    }
}
