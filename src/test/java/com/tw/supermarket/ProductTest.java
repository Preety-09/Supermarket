import com.tw.supermarket.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProductTest {
    @Test
    void returnsNegativeQuantityNotAllowedExceptiion() {
        assertThrows(NegativeQunatityNotAllowedException, () -> {
            Product bread = Product.createBread(-2);
        });
    }
}
