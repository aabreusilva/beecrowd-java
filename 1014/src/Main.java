import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int distancia = scanner.nextInt();
        double combustivel = scanner.nextDouble();
        double kml = distancia / combustivel;
        System.out.printf("%.3f km/l", kml);
        scanner.close();
    }
}