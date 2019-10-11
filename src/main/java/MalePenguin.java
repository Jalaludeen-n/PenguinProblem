public class MalePenguin implements Penguin {
    final float charge = 120;
    final int percentage = 5;

    @Override
    public float calculate() {
        return  (charge * (percentage / 100.0f)) + charge;
    }
}
