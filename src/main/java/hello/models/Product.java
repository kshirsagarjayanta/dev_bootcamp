package hello.models;

/**
 * Created by jayantakshirsagar on 12/05/15.
 */
public class Product {

    private static int productId = 0;
    private String productName;
    private double price;

    public double getPrice(){
        return this.price;
    }

    public Product(String productName, double price) throws Exception{
        if (price < 0){
            throw new Exception("Product price can not be negative.");
        }
        this.productName = productName;
        this.price = price;

    }
}
