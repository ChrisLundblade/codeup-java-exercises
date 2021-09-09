import java.util.Scanner;

public class MethodsExercises {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(add(1.3,3.6));

        System.out.println(subtract(6.8,3.1));

        System.out.println(multiply(2.1, 4.3));

        System.out.println(divide(4.2,2.1));

        System.out.println(modulus(10,4));


        int userInput = getInteger(1, 10);
        System.out.println(userInput);

        System.out.println(Long.MAX_VALUE);

        getFactorial(getInteger(1, 100));

        diceRoller();
    }
    public static double add(double num1, double num2){
        return (num1+num2);
    }
    public static double subtract(double num1, double num2){
        return num1-num2;
    }
    public static double multiply(double num1, double num2){
        return num1*num2;
    }
    public static double divide(double num1, double num2){
        return num1/num2;
    }
    public static int modulus(int num1, int num2){
        return Math.max(num1,num2) % Math.min(num1,num2);
    }

    //2
    public static int getInteger(int min, int max){
        System.out.print("Enter a number between" + min + " and " + max + " : ");
        int userInput = Integer.parseInt(sc.nextLine());
        if (userInput <= max && userInput >= min){
            return userInput;
        }
        System.out.println("Your input was not in range.");
        return getInteger(min, max);
    }
    //3
    public static void getFactorial(long num){
        System.out.printf("Do you want to continue? (Y/N)");
        String userResponse = sc.nextLine();
        if(userResponse.equals("N")){
            return;
        }

        System.out.print(num + "! = " + 1 + " x ");
        long factorial = 1;
        for (int i = 1; i <= num; i++){
            if(i == num){
                factorial *= i;
                System.out.print(" = " + factorial + "\n");
                return;
            }
            if (i == num -1){
                factorial *= i;
                System.out.printf("%d ", i+1);
            } else {
                factorial *= i;
                System.out.printf("%d x ", i + 1);
            }

        }

//        if (num ==2 ){
//            return num;
//        }
//
//        return getFactorial(num-1) * num;
        /*          writing this out for my understanding
                                    return * 4
                                return 3
                             return 2 then it goes back up
                             2*3 returns to the first call
                             6*4 returns
        */
    }

    //4
    public static void diceRoller(){
        System.out.println("How many sides shall the die we're rolling have?");
        int numberOfSides = Integer.parseInt(sc.nextLine());
        System.out.println("Die 1: " + (1 + Math.floor(Math.random() * (numberOfSides))) );
        System.out.println("Die 2: " + (1 + Math.floor(Math.random() * (numberOfSides))) );
        System.out.println("Would you like to roll again? (Y/N)");
        String userResponse = sc.nextLine();
        if(userResponse.contains("N") || userResponse.contains("n")){
            return;
        } else if(userResponse.contains("Y") || userResponse.contains("y")){
            diceRoller();
        }
    }
}
