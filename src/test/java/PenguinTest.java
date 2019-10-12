import org.junit.jupiter.api.Test;
import penguins.Bill;
import penguins.Materials;
import penguins.Tailor;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static penguins.Materials.*;


public class PenguinTest {
    private void addMale(List<Materials> matirials, int total) {
        for (int i = 0; i < total; i++) {
            matirials.add(MALE);
        }
    }

    private void addFemale(List<Materials> matirials, int total) {
        for (int i = 0; i < total; i++) {
            matirials.add(FEMALE);
        }
    }

    private void addBaby(List<Materials> matirials, int total) {
        for (int i = 0; i < total; i++) {
            matirials.add(BABY);
        }
    }

    @Test
    void twoMaleOneFemaleOneBaby() {
        Tailor tailor = new Tailor();
        List<Materials> materials = new ArrayList<>();
        addBaby(materials, 1);
        addMale(materials, 2);
        addFemale(materials, 1);
        Bill bill = tailor.stitch(materials);
        assertEquals(479, bill.netAmount());
    }

    @Test
    void threeMaleFourFemaleOneBaby() {
        Tailor tailor = new Tailor();
        List<Materials> materials = new ArrayList<>();
        addBaby(materials, 1);
        addMale(materials, 3);
        addFemale(materials, 4);
        Bill bill = tailor.stitch(materials);
        assertEquals(963, bill.netAmount());
    }

    @Test
    void eightMaleSevenFemaleTwoBaby() {
        Tailor tailor = new Tailor();
        List<Materials> materials = new ArrayList<>();
        addBaby(materials, 2);
        addMale(materials, 8);
        addFemale(materials, 7);
        Bill bill = tailor.stitch(materials);
        assertEquals(1678.5, bill.netAmount());
    }
}
