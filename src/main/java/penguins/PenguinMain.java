package penguins;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PenguinMain {
    public static void main(String... agrs) {
        Bill bill;
        Tailor tailor = new Tailor();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Male : ");
        int male = scanner.nextInt();
        System.out.println("FeMale : ");
        int female = scanner.nextInt();
        System.out.println("Baby : ");
        int baby = scanner.nextInt();
        bill = tailor.stitch(male, female, baby);
        System.out.println(bill.netAmount());
    }
}
