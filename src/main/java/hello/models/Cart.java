package hello.models;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jayantakshirsagar on 12/05/15.
 */
public class Cart {

    private static Cart myCart;
    private Map<Product, Integer> productMap;

   private Cart()
   {
       productMap = new HashMap<Product, Integer>();
   }

    public static Cart initCart()
    {
        if(myCart==null)
        myCart = new Cart();

        return myCart;

    }

    public boolean checkIfProductIsPresent(Product product)
    {
        return productMap.containsKey(product);
    }

    public boolean addProductToCart(Product product)
    {

        if(checkIfProductIsPresent(product))
        {
            incrementProductCounter(product);

        }
        else
        {
            productMap.put(product,1);
        }

        return true;
    }


    private void incrementProductCounter(Product productToAdd)
    {
            int productCount = productMap.get(productToAdd);
            productCount = productCount + 1;
            productMap.put(productToAdd, productCount);

    }

    public double getCartTotal()
    {
        double totalPrice = 0.0;
        for(Product currentProduct : productMap.keySet())
        {
            totalPrice += (currentProduct.getPrice() * productMap.get(currentProduct));
        }

       return totalPrice;
    }


}


