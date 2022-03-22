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

    public List<String> findSupermarketWithCheapestPrice() {
        List<String> listOfSupermarketWithCheapestPrice = new ArrayList<>();
        listOfSupermarketWithCheapestPrice.add(Supermarket1.BREAD_UNIT_PRICE.getUnitPrice() > Supermarket2.BREAD_UNIT_PRICE.getUnitPrice() ? "Supermarket2" : "Supermarket1");
        listOfSupermarketWithCheapestPrice.add(Supermarket1.RICE_UNIT_PRICE.getUnitPrice() > Supermarket2.RICE_UNIT_PRICE.getUnitPrice() ? "Supermarket2" : "Supermarket1");
        listOfSupermarketWithCheapestPrice.add(Supermarket1.SUGAR_UNIT_PRICE.getUnitPrice() > Supermarket2.SUGAR_UNIT_PRICE.getUnitPrice() ? "Supermarket2" : "Supermarket1");

        return listOfSupermarketWithCheapestPrice;
    }
}
