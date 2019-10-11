import java.text.DecimalFormat;
import java.util.List;

public class Tailor {
    List<Penguin> penguins;
    Charges charges;

    public Tailor(List<Penguin> penguin, Charges charges) {
        this.penguins = penguin;
        this.charges=charges;
    }

    String stitching() {

        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumFractionDigits(2);
        float totalCost = 0;
        for (Penguin penguin : penguins) {
            totalCost += penguin.calculate();
        }
        if (totalCost >= 1000 && totalCost < 2000)
            totalCost -= totalCost * (charges.getDiscountFor1000() / 100.0f);
        else if (totalCost > 2000)
            totalCost -= totalCost * (charges.getDiscountFor2000() / 100.0f);

        return decimalFormat.format(totalCost);
    }
}
