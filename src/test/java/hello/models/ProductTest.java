package hello.models;

import org.junit.*;

/**
 * Created by jayantakshirsagar on 12/05/15.
 */
public class ProductTest {

    @Test
    public void testProductCreation() throws Exception
    {
        Product book = new Product("Clean Code Book",500);
        Assert.assertNotNull(book);
    }

    @Test(expected = Exception.class)
    public void testProductPriceNotNegative() throws Exception
    {
        Product book = new Product("Clean Code Book",-40);
    }

}