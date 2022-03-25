package com.tw.supermarket;

import com.tw.supermarket.exceptions.NegativeQuantityNotAllowedException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProductTest {
    @Test
    void returnsNegativeQuantityNotAllowedExceptiion() {
        assertThrows(NegativeQuantityNotAllowedException.class, () -> {
            Product bread = Product.createBread(-2);
        });
    }
}
