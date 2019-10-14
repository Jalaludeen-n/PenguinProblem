import org.junit.jupiter.api.Test;
import penguins.Bill;
import penguins.Tailor;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PenguinTest {
    @Test
    void twoMaleOneFemaleOneBaby() {
        Tailor tailor = new Tailor();
        Bill bill = tailor.stitch(1,2,3);
        assertEquals(479, bill.netAmount());
    }

    @Test
    void threeMaleFourFemaleOneBaby() {
        Tailor tailor = new Tailor();
        Bill bill = tailor.stitch(1,1,1);
        assertEquals(963, bill.netAmount());
    }

    @Test
    void eightMaleSevenFemaleTwoBaby() {
        Tailor tailor = new Tailor();
        Bill bill = tailor.stitch(1,2,3);
        assertEquals(1678.5, bill.netAmount());
    }
}
