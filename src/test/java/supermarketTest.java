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
        List<String> expectedListOfSupermarketWithCheapestPrice = Arrays.asList("Supermarket2", "Supermarket1", "Supermarket1");

        assertEquals(expectedListOfSupermarketWithCheapestPrice, listOfSupermarketWithCheapestPrice);

    }

    @Test
    void returnSupermarketThatProvidesCheapestPriceForAllProducts() {
        Bread bread = new Bread(2);
        Rice rice = new Rice(10);
        Sugar sugar = new Sugar(5);
        Supermarket supermarket = new Supermarket(bread, rice, sugar);

        String supermarketWithCheapestPriceForAllProducts = supermarket.findSupermarketWithCheapestPriceForAllProducts();

        assertThat(supermarketWithCheapestPriceForAllProducts, is("Supermarket1"));

    }

    @Test
    void returnSuperMarketThatProvidesCheapestPriceForAllProductsIncludingServiceCharges() {
        Bread bread = new Bread(2);
        Rice rice = new Rice(10);
        Sugar sugar = new Sugar(5);
        Supermarket supermarket = new Supermarket(bread, rice, sugar);

        double cheapestPrice = supermarket.calculateCheapestPriceOfProductsIncludingServiceCharge();

        assertEquals(913, cheapestPrice);

    }
}
