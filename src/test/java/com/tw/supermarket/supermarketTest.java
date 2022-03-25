import com.tw.supermarket.Product;
import com.tw.supermarket.Supermarket;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class supermarketTest {
    @Test
    void returnSupermarketThatProvidesCheapestPriceForEachProduct() {
        Product bread = Product.createBread(2);
        Product rice = Product.createRice(10);
        Product sugar = Product.createSugar(5);
        Supermarket supermarket = new Supermarket(bread, rice, sugar);

        List<String> listOfSupermarketWithCheapestPrice = supermarket.findSupermarketWithCheapestPriceForEachProduct();
        List<String> expectedListOfSupermarketWithCheapestPrice = Arrays.asList("com.tw.supermarket.Supermarket2", "com.tw.supermarket.Supermarket1", "com.tw.supermarket.Supermarket1");

        assertEquals(expectedListOfSupermarketWithCheapestPrice, listOfSupermarketWithCheapestPrice);

    }

    @Test
    void returnSupermarketThatProvidesCheapestPriceForAllProducts() {
        Product bread = Product.createBread(2);
        Product rice = Product.createRice(10);
        Product sugar = Product.createSugar(5);
        Supermarket supermarket = new Supermarket(bread, rice, sugar);

        String supermarketWithCheapestPriceForAllProducts = supermarket.findSupermarketWithCheapestPriceForAllProducts();

        assertThat(supermarketWithCheapestPriceForAllProducts, is("com.tw.supermarket.Supermarket1"));

    }

    @Test
    void returnSuperMarketThatProvidesCheapestPriceForAllProductsIncludingServiceCharges() {
        Product bread = Product.createBread(2);
        Product rice = Product.createRice(10);
        Product sugar = Product.createSugar(5);
        Supermarket supermarket = new Supermarket(bread, rice, sugar);

        double cheapestPrice = supermarket.calculateCheapestPriceOfProductsIncludingServiceCharge();

        assertEquals(913, cheapestPrice);

    }
}
