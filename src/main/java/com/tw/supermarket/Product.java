public class Product {

    private final int quantity;

    private Product(int quantity) {
        this.quantity = quantity;
    }

    public static Product createBread(int quantity) {
        return new Product(quantity);
    }

    public static Product createRice(int quantity) {
        return new Product(quantity);
    }

    public static Product createSugar(int quantity) {
        return new Product(quantity);
    }

    public double selectQuantity() {
        return quantity;
    }
}
