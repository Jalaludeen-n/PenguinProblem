public class BabyPenguin implements Penguin {
    final float charge = 170;
    final int percentage = 3;

    @Override
    public float calculate() {
        return (charge * (percentage / 100.0f)) + charge;
    }
}
