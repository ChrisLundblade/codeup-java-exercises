public class MethodWarmup {
    public static void main(String[] args) {
        System.out.println(getDifference(-1,6));
        System.out.println(getDifference(-4,-6));

        System.out.println(getDifference(-6));

        System.out.println(getDifference(-4.16,27));
        System.out.println(getDifference(21,67));

        System.out.println(addNums(3));
    }

    // TODO: use recursion to add all numbers up, from 1 to the given number input

    /*
        addNums(5) would trigger a calculation of...
            5 + 4 + 3 + 3 + 1, evaluating to 15
     */
     public static int addNums(int num) {
         return addNums(num, 1, 0);
     }
     public static int addNums(int num, int i, int accumulator){
         if (i == num){
             return accumulator + i;
         }
         accumulator += i;
         return addNums(num, ++i,accumulator);
     }

    public static int getDifference(int num1, int num2){
        return Math.abs(num1 - num2);
    }

    public static int getDifference(int num){
        //we can get into the semantics of whether the difference btwn -6 and 0 is 6 or -6, but i'm saying it's 6. Fight me.
        return Math.abs(num);
    }

    public static double getDifference(double num1, double num2){
        return Math.abs(num1 - num2);
    }
}
