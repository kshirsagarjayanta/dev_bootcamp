package hello.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jayantakshirsagar on 12/05/15.
 */
public class CartTest {

    private Cart myCart;



    @Before
    public void setUp() throws Exception {
        myCart = Cart.initCart();

    }

    @Test
    public void testInitCartNotNull(){

        assertNotNull(myCart);
    }

    @Test
    public void testIfProductAddedToCart() throws Exception
    {

        Product book = new Product("Head First Java",600);
        boolean ifAdded =  myCart.addProductToCart(book);
        assertTrue(ifAdded);
    }

    @Test
    public void testCheckIfProductExistsInACart() throws Exception
    {
          Product javaBook = new Product("Head First Java new Edition : 2",900);
          myCart.addProductToCart(javaBook);
          boolean ifPresent = myCart.checkIfProductIsPresent(javaBook);
          assertTrue(ifPresent);
    }

    @Test
    public void testCartTotalCost() throws Exception
    {
        Product javaBook = new Product("Head First Java",600);
        Product javaBook1 = new Product("Head First Java new Edition : 2",900);
        myCart.addProductToCart(javaBook1);
        myCart.addProductToCart(javaBook);
        myCart.addProductToCart(javaBook);
        double totalCost = myCart.getCartTotal();
        assertEquals(2100.0,totalCost,0.5);
    }




}