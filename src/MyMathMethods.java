public class MyMathMethods {
    public static int multiply(int num1, int num2){
        return num1 * num2;
    }
    public static double multiply (double dbl1, double dbl2){
        return dbl1 * dbl2;
    }

    public static int quotient (int numberToDivide, int divisor){return numberToDivide/divisor;}
    public static double quotient (double numberToDivide, double divisor){return numberToDivide/divisor;}

    public static double sum (double[] inputArray){
        double sum = 0;
        for(double element : inputArray){
            sum += element;
        }
        return sum;
    }
    public static int sum(int[] inputArray){
        int sum = 0;
        for(int element : inputArray){
            sum += element;
        }
        return sum;
    }
}
