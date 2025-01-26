import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(in);
        int cod1 = scanner.nextInt();
        int quantidade1 = scanner.nextInt();
        double preco1 = scanner.nextDouble();
        int cod2 = scanner.nextInt();
        int quantidade2 = scanner.nextInt();
        double preco2 = scanner.nextDouble();
        double total = (preco1 * quantidade1) + (preco2 * quantidade2);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
        scanner.close();
    }
}