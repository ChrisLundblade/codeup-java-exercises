import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class ErrorTest {
    public static void main(String[] args) {
//        Investigate the substring method for String objects in the Java API. Find out what kind of exception it throws. Create a test class with a main method. Set up a try-catch block that defines a string and finds its length. Once you have the length of your string, modify your program so it creates a substring from your original string, but give it an index that doesn't exist so you get the error message.


//        try{
//            String testString = "test skring";
//            System.out.println("\"" +testString.substring(testString.length()+1)+"\"");
//        }catch(IndexOutOfBoundsException iobe){
//            System.out.println("Exception: " + iobe);
//        }
        ErrorTest errorTest = new ErrorTest();
        errorTest.subListMaker("Try this sentence I guess");

    }
    //nextInt()
//    InputMismatchException - if the next token does not match the Integer regular expression, or is out of range
//    NoSuchElementException - if input is exhausted
//    IllegalStateException - if this scanner is closed
    //add
//    UnsupportedOperationException - if the add operation is not supported by this list
//    ClassCastException - if the class of the specified element prevents it from being added to this list
//    NullPointerException - if the specified element is null and this list does not permit null elements
//    IllegalArgumentException - if some property of this element prevents it from being added to this list

    //split
//    PatternSyntaxException - if the regular expression's syntax is invalid

    public void subListMaker(String sentence){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int firstInt = scanner.nextInt();
        System.out.println("Please enter another integer");
        int secondInt = scanner.nextInt();
        System.out.println(sentence);
        ArrayList<String> wordArrayList = new ArrayList<String>();
        try{
            String[] stringArray = sentence.split(" ");
            for (String word : stringArray){
                wordArrayList.add(word);
            }
            List<String> shorterList =  wordArrayList.subList(firstInt, secondInt);
            String newSentence = String.join(" ", shorterList);
            System.out.println(newSentence);
        }catch(IndexOutOfBoundsException ioobe){
            System.out.println(ioobe);
            System.out.println("Your integer inputs need to be less than or equal to the number of words in the sentence string");
        } catch(IllegalArgumentException iae){
            System.out.println(iae);
            System.out.println("Your first integer must be less than your second");
        } catch(NullPointerException npe){
            System.out.println("");
        }

    }
}
