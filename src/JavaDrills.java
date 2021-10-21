import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;
import java.util.List;

public class JavaDrills {
//    Work in progress
    public static String flipOuterCase(String input){
        String flippedStr = "";

        if(Character.isUpperCase(input.charAt(0))){
            flippedStr += input.substring(0,1).toLowerCase();
        } else {
            flippedStr += input.substring(0,1).toUpperCase();
        }

        flippedStr += input.substring(1,input.length()-1);
        if(Character.isUpperCase(input.charAt(input.length()-1))){
            flippedStr += input.substring(input.length()-1,input.length()).toLowerCase(Locale.ROOT);
        } else {
            flippedStr += input.substring(input.length()-1,input.length()).toUpperCase(Locale.ROOT);
        }
        return flippedStr;
    }
    public static int returnTotalDifference(List<Integer> numList1, List<Integer> numList2){
        int sum1=0;
        int sum2=0;
        for (int num : numList1) {
            sum1 += num;
        }
        for (int num : numList2) {
            sum2 += num;
        }
        return sum1-sum2;
    }
    public static String flipInnerCase(String str){
        String flippedCaseString = str.substring(0,1);
        for(int i =1; i < str.length()-1; i++){
            if(str.substring(i,i+1).toUpperCase().equals(str.substring(i,i+1))){
                flippedCaseString += str.substring(i,i+1).toLowerCase();
            }else{
                flippedCaseString += str.substring(i,i+1).toUpperCase();
            }
        }
        flippedCaseString += str.substring(str.length()-1,str.length());
        return flippedCaseString;
    }


    public static void main(String[] args) {
//        System.out.println(flipOuterCase("cat")); // CaT
//        System.out.println(flipOuterCase("CaT")); // cat
//        System.out.println(flipOuterCase("caT")); // Cat
//        System.out.println(flipOuterCase("cAt")); // CAT
//
//        System.out.println(returnTotalDifference(Arrays.asList(10, 2, 3), Arrays.asList(1, 2, 3)));
//        System.out.println(returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7)));
//        System.out.println(returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7, 1)));

        System.out.println(flipInnerCase("cat")); // cAt
        System.out.println(flipInnerCase("CaT")); // CAT
        System.out.println(flipInnerCase("caT")); // cAT
        System.out.println(flipInnerCase("codeup")); // cODEUp
        System.out.println(flipInnerCase("CoDeup")); // COdEUp
    }
}
