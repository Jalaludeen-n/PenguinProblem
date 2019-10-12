package penguins;

public class Item extends Calculator {
    float amount;
    int quantity;
    float percentage;

    Item(float amount, float percentage, int quantity) {
        this.amount = amount;
        this.percentage = percentage;
        this.quantity = quantity;
    }

    float netAmount() {
        float totalAmount = amount * quantity;
        return calculatePercentage(totalAmount, percentage);
    }
}
