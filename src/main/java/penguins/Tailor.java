package penguins;

import java.util.ArrayList;
import java.util.List;

public class Tailor {


    public Bill stitch(List<Materials> materials) {
        List<Item> items = new ArrayList<>();

        int babyMaterial = 0, maleMaterial = 0, femaleMaterial = 0;
        for (int i = 0; i < materials.size(); i++) {
            if (materials.get(i).equals(Materials.BABY)) {
                babyMaterial++;
            }
            if (materials.get(i).equals(Materials.MALE)) {
                maleMaterial++;
            }
            if (materials.get(i).equals(Materials.FEMALE)) {
                femaleMaterial++;
            }
        }
        items.add(new Item(120, 5, maleMaterial));
        items.add(new Item(145, 7, femaleMaterial));
        items.add(new Item(70, 3, babyMaterial));

        Bill bill = new Bill(items);
        return bill;
    }
}
