public class MalePenguin implements Penguin {
    final int charge = 120;
    final int percentage = 5;

    @Override
    public int calculate() {
        return (int) (charge * (percentage / 100.0f)) + charge;
    }
}
