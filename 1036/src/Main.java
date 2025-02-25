import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);
        double a = read.nextDouble();
        double b = read.nextDouble();
        double c = read.nextDouble();
        double delta = Math.pow(b, 2) - 4 * a * c;
        double r1 = (- b + Math.sqrt(delta)) / (2.0 * a);
        double r2 = (- b - Math.sqrt(delta)) / (2.0 * a);
        if ((a == 0) | delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            System.out.printf("R1 = %.5f%n", r1);
            System.out.printf("R2 = %.5f%n", r2);
        }

        read.close();
    }
}