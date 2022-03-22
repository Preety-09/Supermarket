public enum Supermarket1 {
    BREAD_UNIT_PRICE(15),
    RICE_UNIT_PRICE(60),
    SUGAR_UNIT_PRICE(40);

    private final double unitPrice;

    Supermarket1(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
}
