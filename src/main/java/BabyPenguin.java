public class BabyPenguin implements Penguin {
    final float charge;
    final int percentage;

    public BabyPenguin(int festivalHikeForBaby, int charge) {
        this.charge = charge;
        this.percentage = festivalHikeForBaby;
    }

    @Override
    public float calculate() {
        return (charge * (percentage / 100.0f)) + charge;
    }
}
