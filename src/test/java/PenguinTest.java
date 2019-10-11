import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PenguinTest {
    Charges helperMethodToCharge() {
        int malePenguin = 120;
        int femalePenguin = 145;
        int childPenguin = 170;
        int festivalHikeForMale = 5;
        int festivalHikeForFemale = 7;
        int festivalHikeForBaby = 3;
        int discountFor1000 = 10;
        int discountFor2000 = 25;

        Charges charges = new Charges(malePenguin,
                femalePenguin,
                childPenguin,
                festivalHikeForMale,
                festivalHikeForFemale,
                festivalHikeForBaby,
                discountFor1000,
                discountFor2000);

        return charges;
    }

    void helperMethodForMalePenguin(int totalFemalePenguin, List<Penguin> penguin) {
        for (int i = 0; i < totalFemalePenguin; i++) {
            penguin.add(new MalePenguin());
        }

    }

    void helperMethodForFemalePenguin(int totalFemalePenguin, List<Penguin> penguin) {
        for (int i = 0; i < totalFemalePenguin; i++) {
            penguin.add(new FemalePenguin());
        }

    }

    void helperMethodForBabyPenguin(int totalFemalePenguin, List<Penguin> penguin) {
        for (int i = 0; i < totalFemalePenguin; i++) {
            penguin.add(new BabyPenguin());
        }

    }

    @Test
    void StitchingForMalePenguin() {
        Penguin malePenguin = new MalePenguin();
        List<Penguin> penguins = new ArrayList<>();
        penguins.add(malePenguin);
        Tailor tailor = new Tailor(penguins, helperMethodToCharge());
        assertEquals("126", tailor.stitching());
    }

    @Test
    void StitchingForMalePenguins() {
        List<Penguin> penguins = new ArrayList<>();
        helperMethodForMalePenguin(4, penguins);
        Tailor tailor = new Tailor(penguins, helperMethodToCharge());
        assertEquals("504", tailor.stitching());
    }

    @Test
    void StitchingForFemalePenguin() {
        Penguin femalePenguin = new FemalePenguin();
        List<Penguin> penguins = new ArrayList<>();
        penguins.add(femalePenguin);
        Tailor tailor = new Tailor(penguins, helperMethodToCharge());
        assertEquals("155.15", tailor.stitching());
    }

    @Test
    void StitchingForFemalePenguins() {
        List<Penguin> penguins = new ArrayList<>();
       helperMethodForFemalePenguin(4,penguins);
       Tailor tailor = new Tailor(penguins, helperMethodToCharge());
        assertEquals("620.6", tailor.stitching());
    }

    @Test
    void StitchingForChildPenguin() {
        Penguin childPenguin = new BabyPenguin();
        List<Penguin> penguins = new ArrayList<>();
        penguins.add(childPenguin);
        Tailor tailor = new Tailor(penguins, helperMethodToCharge());
        assertEquals("175.1", tailor.stitching());
    }

    @Test
    void StitchingForChildPenguins() {
        List<Penguin> penguins = new ArrayList<>();
        helperMethodForBabyPenguin(4,penguins);
        Tailor tailor = new Tailor(penguins, helperMethodToCharge());
        assertEquals("700.4", tailor.stitching());
    }

    @Test
    void StitchingChargeMoreThan1000() {
        List<Penguin> penguins = new ArrayList<>();
        helperMethodForBabyPenguin(8,penguins);
        Tailor tailor = new Tailor(penguins, helperMethodToCharge());
        assertEquals("1,260.72", tailor.stitching());
    }

    @Test
    void StitchingChargeMoreThan2500() {
        List<Penguin> penguins = new ArrayList<>();
        helperMethodForBabyPenguin(20,penguins);
        Tailor tailor = new Tailor(penguins, helperMethodToCharge());
        assertEquals("2,626.5", tailor.stitching());
    }

    //    Family consisting of 2 Male, 1 Female, 1 Baby
//
//    Output:
//            479.25
    //
    @Test
    void TwoMaleOneFemaleOneBaby() {
        List<Penguin> penguins = new ArrayList<>();
        helperMethodForMalePenguin(2,penguins);
        penguins.add(new BabyPenguin());
        penguins.add(new FemalePenguin());
        Tailor tailor = new Tailor(penguins, helperMethodToCharge());
        assertEquals("492.25", tailor.stitching());
    }

}
