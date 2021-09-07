import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1
        int i = 5;
        while (i <= 15){
            System.out.print(i++ +" ");
        }
        System.out.println();

        //1b
        i = 0;
        do{
            System.out.println(i+=2);
        } while(i < 100);

        i = 100;
        do{
            System.out.println(i-=5);
        } while(i > -10);

        i = 2;
        do{
            System.out.println(i);
            i = (int) Math.pow(i,2);
        } while(i < 1000000);

        //1c
        for (i= 5; i <= 15; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        for (i = 0; i <= 100; i +=2){
            System.out.println(i);
        }
        for (i = 100; i >= -10; i-=5){
            System.out.println(i);
        }
        for (i = 2; i < 1000000; i = (int) Math.pow(i,2)){
            System.out.println(i);
        }
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
        //3
//        System.out.println("What number would you like to go up to?");
//        int userInputNumber = Integer.parseInt(scanner.nextLine());
//        System.out.println("\nHere is your table! \n");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//        for (int i =1; i <= userInputNumber; i++){
//
//            if(Math.pow(i,2)%10 == i){
//                System.out.print(i + "      | ");
//                System.out.print(Math.pow(i,2) + "      | " + Math.pow(i,3) + "\n");
//            } else {
//                System.out.print(i + "      | ");
//                System.out.print(Math.pow(i,2) + "     | " + Math.pow(i,3) + "\n");
//            }
//        }
    }
}
