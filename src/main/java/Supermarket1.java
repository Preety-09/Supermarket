public enum Supermarket1 {
    BREAD_UNIT_PRICE(15),
    RICE_UNIT_PRICE(60),
    SUGAR_UNIT_PRICE(40),
    SUPERMARKET1_SERVICE_CHARGE(0.1);

    private final double unitPrice;

    Supermarket1(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public static double calculateTotalPriceOfProductsFromSupermarket1(double bread_quantity, double rice_quantity, double sugar_quantity) {
        return (bread_quantity * BREAD_UNIT_PRICE.getUnitPrice() +
                rice_quantity * RICE_UNIT_PRICE.getUnitPrice() +
                sugar_quantity * SUGAR_UNIT_PRICE.getUnitPrice());
    }

    public static double calculateTotalPriceOfProductsIncludingServiceChargeFromSupermarket1(double bread_quantity, double rice_quantity, double sugar_quantity) {
        return (calculateTotalPriceOfProductsFromSupermarket1(bread_quantity, rice_quantity, sugar_quantity) +
                   (calculateTotalPriceOfProductsFromSupermarket1(bread_quantity, rice_quantity, sugar_quantity) * SUPERMARKET1_SERVICE_CHARGE.getUnitPrice()));
    }

    public double getUnitPrice() {
        return unitPrice;
    }
}
