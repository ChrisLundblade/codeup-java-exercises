import java.sql.SQLOutput;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1
//        int i = 5;
//        while (i <= 15){
//            System.out.print(i++ +" ");
//        }
//        System.out.println();

        //1b
//        i = 0;
//        do{
//            System.out.println(i+=2);
//        } while(i < 100);
//
//        i = 100;
//        do{
//            System.out.println(i-=5);
//        } while(i > -10);
//
//        i = 2;
//        do{
//            System.out.println(i);
//            i = (int) Math.pow(i,2);
//        } while(i < 1000000);
//
//        //1c
//        for (i= 5; i <= 15; i++){
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        for (i = 0; i <= 100; i +=2){
//            System.out.println(i);
//        }
//        for (i = 100; i >= -10; i-=5){
//            System.out.println(i);
//        }
//        for (i = 2; i < 1000000; i = (int) Math.pow(i,2)){
//            System.out.println(i);
//        }
        //2
//        for (int i = 1; i <= 100; i++){
//            if (i%3==0 && i%5==0){
//                System.out.println("FizzBuzz");
//            } else if(i%3==0){
//                System.out.println("Fizz");
//            } else if(i%5==0){
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }
        //3    Okay so this will output just like the original if you input an integer less than 10
//        System.out.println("What number would you like to go up to?");
//        int userInputNumber = Integer.parseInt(scanner.nextLine());
//        System.out.println("\nHere is your table! \n");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//        for (int i =1; i <= userInputNumber; i++){
//
//            if((i*i)< 10){
//                System.out.print(i + "      | ");
//                System.out.print((i*i) + "       | " + (i*i*i) + "\n");
//            } else {
//                System.out.print(i + "      | ");
//                System.out.print((i * i) + "      | " + (i*i*i) + "\n");
//            }
//        }

       //4
        while (true) {
            System.out.println("Give us a numerical integer grade 0 to 100 in the console");
            int userGrade = Integer.parseInt(scanner.nextLine());
            if(userGrade > 98){
                System.out.println("That's an A+");
            } else if (userGrade > 92) {
                System.out.println("That's an A");
            } else if (userGrade > 89){
                System.out.println("That's an A-");
            } else if(userGrade > 87){
                System.out.println("That's a B+");
            } else if(userGrade > 82){
                System.out.println("That's a B");
            } else if(userGrade > 79){
                System.out.println("That's a B-");
            } else if(userGrade > 77){
                System.out.println("That's a C+");
            } else if(userGrade > 72){
                System.out.println("That's a C");
            } else if(userGrade > 69){
                System.out.println("That's a C-");
            } else if(userGrade > 67){
                System.out.println("That's a D+");
            } else if(userGrade > 62){
                System.out.println("That's a D");
            } else if(userGrade > 59){
                System.out.println("That's a D-");
            } else {
                System.out.println("That's an F");
            }

            System.out.println("Continue getting grades? (Y/N)");
            String userDecision = scanner.nextLine();
            System.out.println(userDecision);
            if(userDecision.equals("N")){
                break;
            }
        }
    }
}
