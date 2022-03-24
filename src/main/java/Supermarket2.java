public enum Supermarket2 {
    BREAD_UNIT_PRICE(10),
    RICE_UNIT_PRICE(62),
    SUGAR_UNIT_PRICE(41);

    private final double unitPrice;

    Supermarket2(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public static double calculateTotalPriceOfProductsFromSupermarket2(double bread_quantity, double rice_quantity, double sugar_quantity) {
        return (bread_quantity * BREAD_UNIT_PRICE.getUnitPrice() +
                rice_quantity * RICE_UNIT_PRICE.getUnitPrice() +
                sugar_quantity * SUGAR_UNIT_PRICE.getUnitPrice());
    }

    public double getUnitPrice() {
        return unitPrice;
    }
}
