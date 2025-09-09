import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите а:");
        int a = scan.nextInt();
        System.out.println("Введите b:");
        int b = scan.nextInt();
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        BigDecimal div = BigDecimal.valueOf(a).divide(BigDecimal.valueOf(b), 3, RoundingMode.HALF_UP);
        System.out.println("a / b = " + div);
        System.out.println("a * b = " + a * b);
    }
}