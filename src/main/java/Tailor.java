import java.util.List;

public class Tailor {
    List<Penguin> penguins;

    public Tailor(List<Penguin> penguin) {
        this.penguins = penguin;
    }

    int stitching() {
        int totalCost=0;
        for (Penguin penguin : penguins) {
            totalCost+=penguin.calculate();
        }
        return totalCost;
    }
}
