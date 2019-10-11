import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PenguinTest {
    @Test
    void StitchingForMalePenguin() {
        Penguin malePenguin = new MalePenguin();
        List<Penguin> penguins = new ArrayList<>();
        penguins.add(malePenguin);
        Tailor tailor = new Tailor(penguins);
        assertEquals("126", tailor.stitching());
    }

    @Test
    void StitchingForMalePenguins() {
        List<Penguin> penguins = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            penguins.add(new MalePenguin());
        }
        Tailor tailor = new Tailor(penguins);
        assertEquals("1,008", tailor.stitching());
    }

    @Test
    void StitchingForFemalePenguin() {
        Penguin femalePenguin = new FemalePenguin();
        List<Penguin> penguins = new ArrayList<>();
        penguins.add(femalePenguin);
        Tailor tailor = new Tailor(penguins);
        assertEquals("155.15", tailor.stitching());
    }

    @Test
    void StitchingForFemalePenguins() {
        List<Penguin> penguins = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            penguins.add(new FemalePenguin());
        }
        Tailor tailor = new Tailor(penguins);
        assertEquals("1,241.2", tailor.stitching());
    }

    @Test
    void StitchingForChildPenguin() {
        Penguin childPenguin = new ChildPenguin();
        List<Penguin> penguins = new ArrayList<>();
        penguins.add(childPenguin);
        Tailor tailor = new Tailor(penguins);
        assertEquals("175.1", tailor.stitching());
    }

    @Test
    void StitchingForChildPenguins() {
        List<Penguin> penguins = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            penguins.add(new ChildPenguin());
        }
        Tailor tailor = new Tailor(penguins);
        assertEquals("1,400.8", tailor.stitching());
    }

    @Test
    void StitchingChargeMoreThan1000() {
        List<Penguin> penguins = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            penguins.add(new ChildPenguin());
        }
        Tailor tailor = new Tailor(penguins);
        assertEquals("1,260.72", tailor.stitching());
    }

}
