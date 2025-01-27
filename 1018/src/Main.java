import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int variavel = n;

        int cedula100 = variavel / 100;
        variavel -= cedula100 * 100;

        int cedula50 = variavel / 50;
        variavel -= cedula50 * 50;

        int cedula20 = variavel / 20;
        variavel -= cedula20 * 20;

        int cedula10 = variavel / 10;
        variavel -= cedula10 * 10;

        int cedula5 = variavel / 5;
        variavel -= cedula5 * 5;

        int cedula2 = variavel / 2;
        variavel -= cedula2 * 2;

        int cedula1 = variavel;

        System.out.printf("%d%n", n);
        System.out.printf("%d nota(s) de R$ 100,00%n", cedula100);
        System.out.printf("%d nota(s) de R$ 50,00%n", cedula50);
        System.out.printf("%d nota(s) de R$ 20,00%n", cedula20);
        System.out.printf("%d nota(s) de R$ 10,00%n", cedula10);
        System.out.printf("%d nota(s) de R$ 5,00%n", cedula5);
        System.out.printf("%d nota(s) de R$ 2,00%n", cedula2);
        System.out.printf("%d nota(s) de R$ 1,00%n", cedula1);

        scanner.close();
    }
}