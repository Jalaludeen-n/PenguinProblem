public class ChildPenguin implements Penguin {
    final int charge = 170;
    final int percentage = 3;

    @Override
    public int calculate() {
        return (int) (charge * (percentage / 100.0f)) + charge;
    }
}
