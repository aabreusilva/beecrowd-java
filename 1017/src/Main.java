import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int tempo = scanner.nextInt();
        int velocidade = scanner.nextInt();
        double litros = (velocidade * tempo) / 12.0;
        System.out.printf("%.3f%n", litros);
        scanner.close();
    }
}