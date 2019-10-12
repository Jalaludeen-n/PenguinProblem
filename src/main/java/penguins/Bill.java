package penguins;

import java.util.List;

public class Bill extends Calculator {
    int totalAmount;
    List<Item> items;

    public Bill(List<Item> items) {
        this.items = items;
    }

    public float netAmount() {
        for (Item item : items) {
            totalAmount += item.netAmount();
        }
        if (totalAmount > 1000 && totalAmount < 2000)
            return calculatePercentage(totalAmount, -10);
        else if (totalAmount > 2000)
            return calculatePercentage(totalAmount, -25);
        return totalAmount;
    }
}
