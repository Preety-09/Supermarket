public enum Supermarket1 {
    BREAD_UNIT_PRICE(15),
    RICE_UNIT_PRICE(60),
    SUGAR_UNIT_PRICE(40);

    private final double unitPrice;

    Supermarket1(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public static double calculateTotalPriceOfProductsFromSupermarket1(double bread_quantity, double rice_quantity, double sugar_quantity) {
        return (bread_quantity * BREAD_UNIT_PRICE.getUnitPrice() +
                rice_quantity * RICE_UNIT_PRICE.getUnitPrice() +
                sugar_quantity * SUGAR_UNIT_PRICE.getUnitPrice());
    }

    public double getUnitPrice() {
        return unitPrice;
    }
}
