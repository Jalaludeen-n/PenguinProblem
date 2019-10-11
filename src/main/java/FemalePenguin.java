import java.text.DecimalFormat;

public class FemalePenguin implements Penguin {
    final float charge;
    final int percentage;

    public FemalePenguin(int festivalHikeForFemale, int charge) {
        this.charge = charge;
        this.percentage = festivalHikeForFemale;
    }

    @Override
    public float calculate() {
        return ((charge * (percentage / 100.0f)) + charge);
    }
}
