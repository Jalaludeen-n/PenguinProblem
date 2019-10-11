import java.text.DecimalFormat;

public class FemalePenguin implements Penguin {
    final float charge = 145;
    final int percentage = 7;

    @Override
    public float calculate() {
        return ((charge * (percentage / 100.0f)) + charge);
    }
}
