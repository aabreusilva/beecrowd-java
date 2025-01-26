import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double r, a, pi = 3.14159;

        r = scanner.nextDouble();

        a = pi * r * r;

        System.out.printf("A=%.4f%n", a);

        scanner.close();
    }
}