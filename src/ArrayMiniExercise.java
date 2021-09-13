public class ArrayMiniExercise {
    public static void main(String[] args) {
        //TODO: create an array of doubles called numbers and assign five different values (try with and without an initializer).
        //            Find the sum of all five double values using an enhanced for loop.
        double[] myDoubleArray = {20.2, 41.05, 68.00, 71.86, 63.73};
        double accumulator = 0;
        for(double element : myDoubleArray){
            accumulator += element;
            System.out.printf("%.2f\n", accumulator);
        }
    }
}