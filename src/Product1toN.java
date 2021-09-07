public class Product1toN {
    public static void main(String[] args) {
        int product = 1;
        for(int i = 1; i <= 10; i++){
            product *= i;
            System.out.println(product);
        }
        System.out.println(product);
    }
}
