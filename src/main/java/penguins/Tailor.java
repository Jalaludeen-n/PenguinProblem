package penguins;

import com.sun.tools.javac.jvm.Items;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.stream;

public class Tailor {


    public Bill stitch(List<Matirials> matirials) {
        List<Item> items = new ArrayList<>();
        int bybyMatirial = 0, maleMaterial = 0, femaleMaterial = 0;
        for (int i = 0; i < matirials.size(); i++) {
            if (matirials.get(i).equals(Matirials.BABY)) {
                bybyMatirial++;
            }
            if (matirials.get(i).equals(Matirials.MALE)) {
                maleMaterial++;
            }
            if (matirials.get(i).equals(Matirials.FEMALE)) {
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
