public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(add(1.3,3.6));

        System.out.println(subtract(6.8,3.1));

        System.out.println(multiply(2.1, 4.3));

        System.out.println(divide(4.2,2.1));
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
}
