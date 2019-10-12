package penguins;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.stream;

public class Tailor {


    public Bill stitch(List<Materials> matirials) {
        List<Item> items = new ArrayList<>();
        int bybyMatirial = 0, maleMaterial = 0, femaleMaterial = 0;
        for (int i = 0; i < matirials.size(); i++) {
            if (matirials.get(i).equals(Materials.BABY)) {
                bybyMatirial++;
            }
            if (matirials.get(i).equals(Materials.MALE)) {
                maleMaterial++;
            }
            if (matirials.get(i).equals(Materials.FEMALE)) {
                femaleMaterial++;
            }
        }
        items.add(new Item(120, 5, maleMaterial));
        items.add(new Item(145, 7, femaleMaterial));
        items.add(new Item(70, 3, bybyMatirial));
        Bill bill = new Bill(items);
        return bill;
    }
}
