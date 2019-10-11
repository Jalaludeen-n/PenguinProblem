public class MalePenguin implements Penguin {
    private final float charge;
    private final int percentage;

    public MalePenguin(int festivalHikeForMale, int charge) {
        this.charge = charge;
        this.percentage = festivalHikeForMale;
    }

    @Override
    public float calculate() {
        return (charge * (percentage / 100.0f)) + charge;
    }
}
