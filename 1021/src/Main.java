import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double valor = scanner.nextDouble();
        int notas = (int) valor;
        int moedas = (int) ((valor - notas) * 100);
        int cedula100 = notas / 100;
        notas -= cedula100 * 100;
        int cedula50 = notas / 50;
        notas -= cedula50 * 50;
        int cedula20 = notas / 20;
        notas -= cedula20 * 20;
        int cedula10 = notas / 10;
        notas -= cedula10 * 10;
        int cedula5 = notas / 5;
        notas -= cedula5 * 5;
        int cedula2 = notas / 2;
        notas -= cedula2 * 2;
        int moeda1 = notas;
        notas -= moeda1;
        int moeda050 = moedas / 50;
        moedas -= moeda050 * 50;
        int moeda025 = moedas / 25;
        moedas -= moeda025 * 25;
        int moeda010 = moedas / 10;
        moedas -= moeda010 * 10;
        int moeda005 = moedas / 5;
        moedas -= moeda005 * 5;
        int moeda001 = moedas;
        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00%n", cedula100);
        System.out.printf("%d nota(s) de R$ 50.00%n", cedula50);
        System.out.printf("%d nota(s) de R$ 20.00%n", cedula20);
        System.out.printf("%d nota(s) de R$ 10.00%n", cedula10);
        System.out.printf("%d nota(s) de R$ 5.00%n", cedula5);
        System.out.printf("%d nota(s) de R$ 2.00%n", cedula2);
        System.out.println("MOEDAS: ");
        System.out.printf("%d moeda(s) de R$ 1.00%n", moeda1);
        System.out.printf("%d moeda(s) de R$ 0.50%n", moeda050);
        System.out.printf("%d moeda(s) de R$ 0.25%n", moeda025);
        System.out.printf("%d moeda(s) de R$ 0.10%n", moeda010);
        System.out.printf("%d moeda(s) de R$ 0.05%n", moeda005);
        System.out.printf("%d moeda(s) de R$ 0.01%n", moeda001);
        scanner.close();
    }
}