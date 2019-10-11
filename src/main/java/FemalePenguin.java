public class FemalePenguin implements Penguin {
    final int charge = 145;
    final int percentage = 7;

    @Override
    public int calculate() {
        return (int) (charge * (percentage / 100.0f)) + charge;
    }
}
