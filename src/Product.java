public class Product {
    /* TODO: create a class called Product with two private properties of name and priceInCents.
    Add a public static method called, findAveragePrice, that takes in an array of products
    and finds the average price of all products. Add a main method to the class to test some
    values.
 */
    private String name;
    private double priceInCents;

    public double GetPrice(){
        return this.priceInCents;
    }

    public String GetName(){
        return this.name;
    }

    public static double findAveragePrice(Product[] productsArray){
        double priceTotal= 0.0;
        for(Product product : productsArray){
            priceTotal += product.GetPrice();
        }
        return priceTotal/productsArray.length;
    }


    public Product(String name, double price){
        this.name = name;
        this.priceInCents = price;
    }


    public static void main(String[] args) {
        Product drill = new Product("Drill", 49.99);
        Product chainsaw = new Product("Chainsaw", 139.99);
        Product boltcutters = new Product("Bolt-cutters", 39.99);
        Product hedgetrimmer = new Product("Hedge-Trimmer", 29.99);
        Product hammer = new Product("Hammer", 16.99);
        Product screwdriverSet = new Product("Screwdriver Set", 19.99);

        //Product[] arrayOfProducts = {drill, chainsaw, boltcutters, hedgetrimmer, hammer, screwdriverSet};
        //Product[] arrayOfProducts = {drill, boltcutters, hedgetrimmer, hammer, screwdriverSet};
        Product[] arrayOfProducts = {drill, chainsaw, boltcutters, hedgetrimmer, };

        System.out.printf("The average price of all the products in the array is %.2f",Product.findAveragePrice(arrayOfProducts));
    }
}
