package penguins;

public class PenguinMain {
    public static void main(String... agrs) {
        Bill bill;
        Tailor tailor = new Tailor();
        bill = tailor.stitch(2, 1, 1);
        System.out.println(bill.netAmount());
    }
}
