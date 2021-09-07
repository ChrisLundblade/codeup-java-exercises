import java.util.Scanner;

public class DecisionPractice {
    public static void main(String [] args){
//        write a short Java program that tests if a number is positive or negative. Define a few numeric variables and run them through a decision. If the number is positive, output that it is positive, and if it is negative, output that it is negative.

    Scanner sc = new Scanner(System.in);
//    int testNum = 133152355;
//    int testNum = 14364;
//    float testNum = 1.1834573943745288f;
//    float testNum = -3.1459f;
    int testNum = 0;
    if(testNum > 0){
        System.out.println(testNum + " is a positive number.");
    } else if (testNum < 0){
        System.out.println(testNum + " is a negative number.");
    } else if(testNum == 0){
        System.out.println(testNum + " is zero");
    }

    }
}
