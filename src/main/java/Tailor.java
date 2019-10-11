import java.text.DecimalFormat;
import java.util.List;

public class Tailor {
    List<Penguin> penguins;

    public Tailor(List<Penguin> penguin) {
        this.penguins = penguin;
    }

    String stitching() {
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumFractionDigits(2);
        float totalCost = 0;
        for (Penguin penguin : penguins) {
            totalCost += penguin.calculate();
        }
        if (totalCost >= 1000)
            totalCost -= totalCost * (10 / 100.0f);
        return decimalFormat.format(totalCost);
    }
}
