public enum Supermarket2 {
    BREAD_UNIT_PRICE(10),
    RICE_UNIT_PRICE(62),
    SUGAR_UNIT_PRICE(41);

    private final double unitPrice;

    Supermarket2(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
}
