import java.util.ArrayList;
import java.util.List;

public class Supermarket {
    private final Bread bread;
    private final Rice rice;
    private final Sugar sugar;

    public Supermarket(Bread bread, Rice rice, Sugar sugar) {
        this.bread = bread;
        this.rice = rice;
        this.sugar = sugar;
    }

    public List<String> findSupermarketWithCheapestPriceForEachProduct() {
        List<String> listOfSupermarketWithCheapestPriceForEachProduct = new ArrayList<>();

        listOfSupermarketWithCheapestPriceForEachProduct.add(Supermarket1.BREAD_UNIT_PRICE.getUnitPrice() > Supermarket2.BREAD_UNIT_PRICE.getUnitPrice() ? "Supermarket2" : "Supermarket1");

        listOfSupermarketWithCheapestPriceForEachProduct.add(Supermarket1.RICE_UNIT_PRICE.getUnitPrice() > Supermarket2.RICE_UNIT_PRICE.getUnitPrice() ? "Supermarket2" : "Supermarket1");


        listOfSupermarketWithCheapestPriceForEachProduct.add(Supermarket1.SUGAR_UNIT_PRICE.getUnitPrice() > Supermarket2.SUGAR_UNIT_PRICE.getUnitPrice() ? "Supermarket2" : "Supermarket1");

        return listOfSupermarketWithCheapestPriceForEachProduct;
    }

    public String findSupermarketWithCheapestPriceForAllProducts() {

        double totalPriceOfProductsFromSupermarket1 =
                calculateTotalPriceOfProductsFromSupermarket1();

        double totalPriceOfProductsFromSupermarket2 =
                calculateTotalPriceOfProductsFromSupermarket2();

        return (totalPriceOfProductsFromSupermarket1 < totalPriceOfProductsFromSupermarket2 ? "Supermarket1" : "Supermarket2");
    }

    private double calculateTotalPriceOfProductsFromSupermarket2() {
        return bread.selectQuantity() * Supermarket2.BREAD_UNIT_PRICE.getUnitPrice() +
                rice.selectQuantity() * Supermarket2.RICE_UNIT_PRICE.getUnitPrice() +
                sugar.selectQuantity() * Supermarket2.SUGAR_UNIT_PRICE.getUnitPrice();
    }

    private double calculateTotalPriceOfProductsFromSupermarket1() {
        return bread.selectQuantity() * Supermarket1.BREAD_UNIT_PRICE.getUnitPrice() +
                rice.selectQuantity() * Supermarket1.RICE_UNIT_PRICE.getUnitPrice() +
                sugar.selectQuantity() * Supermarket1.SUGAR_UNIT_PRICE.getUnitPrice();
    }

    public double calculateCheapestPriceOfProductsIncludingServicecharge() {
        return 0;
    }
}
