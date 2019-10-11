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
        assertEquals(126, tailor.stitching());
    }
    @Test
    void StitchingForMalePenguins() {
        List<Penguin> penguins = new ArrayList<>();
        for(int i=0;i<8;i++)
        {
            penguins.add(new MalePenguin());
        }
        Tailor tailor = new Tailor(penguins);
        assertEquals(1008, tailor.stitching());
    }

}
