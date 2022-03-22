import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class supermarketTest {
    @Test
    void returnSupermarketThatProvidesCheapestPrice() {
        Bread bread = new Bread(2);
        Rice rice = new Rice(10);
        Sugar sugar = new Sugar(5);
        Supermarket supermarket = new Supermarket(bread, rice, sugar);

        List<String> listOfSupermarketWithCheapestPrice = supermarket.findSupermarketWithCheapestPrice();
        List<String> expectedListOfSupermarketWithCheapestPrice = Arrays.asList("Supermarket2", "Supermarket1", "Supermarket1");

        assertEquals(expectedListOfSupermarketWithCheapestPrice, listOfSupermarketWithCheapestPrice);

    }
}
