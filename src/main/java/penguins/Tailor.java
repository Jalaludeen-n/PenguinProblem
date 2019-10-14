package penguins;

import java.util.ArrayList;
import java.util.List;

public class Tailor {


    public Bill stitch(int male, int female, int baby) {
        List<Item> items = new ArrayList<>();

        items.add(new Item(120, 5, male));
        items.add(new Item(145, 7, female));
        items.add(new Item(70, 3, baby));

        Bill bill = new Bill(items);
        return bill;
    }
}
