import java.util.ArrayList;
import java.util.List;

public class Supermarket {
    private final Product bread;
    private final Product rice;
    private final Product sugar;

    public Supermarket(Product bread, Product rice, Product sugar) {
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
                Supermarket1.calculateTotalPriceOfProductsFromSupermarket1(bread.selectQuantity(), rice.selectQuantity(), sugar.selectQuantity());

        double totalPriceOfProductsFromSupermarket2 =
                Supermarket2.calculateTotalPriceOfProductsFromSupermarket2(bread.selectQuantity(), rice.selectQuantity(), sugar.selectQuantity());

        return (totalPriceOfProductsFromSupermarket1 < totalPriceOfProductsFromSupermarket2 ? "Supermarket1" : "Supermarket2");
    }

    public double calculateCheapestPriceOfProductsIncludingServiceCharge() {

        double totalPriceOfProductsFromSupermarket1 = Supermarket1.calculateTotalPriceOfProductsIncludingServiceChargeFromSupermarket1(bread.selectQuantity(), rice.selectQuantity(), sugar.selectQuantity());

        double totalPriceOfProductsFromSupermarket2 = Supermarket2.calculateTotalPriceOfProductsIncludingServiceChargeFromSupermarket2(bread.selectQuantity(), rice.selectQuantity(), sugar.selectQuantity());

        return (totalPriceOfProductsFromSupermarket1 < totalPriceOfProductsFromSupermarket2 ?
                totalPriceOfProductsFromSupermarket1 : totalPriceOfProductsFromSupermarket2);

    }
}
