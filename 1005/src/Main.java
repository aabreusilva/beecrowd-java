import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double a, b, media;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        media = ((3.5 * a) + (7.5 * b)) / 11;
        System.out.printf("MEDIA = %.5f%n", media);
        scanner.close();
    }
}