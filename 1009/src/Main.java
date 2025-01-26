import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        String nome;
        double fixo, vendas, total;
        nome = scanner.next();
        fixo = scanner.nextDouble();
        vendas = scanner.nextDouble();
        total = fixo + (vendas * 0.15);
        System.out.printf("TOTAL = R$ %.2f%n", total);
        scanner.close();
    }
}