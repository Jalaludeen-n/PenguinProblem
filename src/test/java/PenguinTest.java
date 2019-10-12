import org.junit.jupiter.api.Test;
import penguins.Bill;
import penguins.Matirials;
import penguins.Tailor;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static penguins.Matirials.*;


public class PenguinTest {
    private void addMale(List<Matirials> matirials, int total) {
        for (int i = 0; i < total; i++) {
            matirials.add(MALE);
        }
    }

    private void addFemale(List<Matirials> matirials, int total) {
        for (int i = 0; i < total; i++) {
            matirials.add(FEMALE);
        }
    }

    private void addBaby(List<Matirials> matirials, int total) {
        for (int i = 0; i < total; i++) {
            matirials.add(BABY);
        }
    }

    @Test
    void twoMaleOneFemaleOneBaby() {
        Tailor tailor = new Tailor();
        List<Matirials> matirials = new ArrayList<>();
        addBaby(matirials,1);
        addMale(matirials,2);
        addFemale(matirials,1);
        Bill bill = tailor.stitch(matirials);
        assertEquals(479, bill.netAmount());
    }

    @Test
    void threeMaleFourFemaleOneBaby() {
        Tailor tailor = new Tailor();
        List<Matirials> matirials = new ArrayList<>();
        addBaby(matirials,1);
        addMale(matirials,3);
        addFemale(matirials,4);
        Bill bill = tailor.stitch(matirials);
        assertEquals(963, bill.netAmount());
    }
    @Test
    void eightMaleSevenFemaleTwoBaby() {
        Tailor tailor = new Tailor();
        List<Matirials> matirials = new ArrayList<>();
        addBaby(matirials,2);
        addMale(matirials,8);
        addFemale(matirials,7);
        Bill bill = tailor.stitch(matirials);
        assertEquals(1678.5, bill.netAmount());
    }
}
