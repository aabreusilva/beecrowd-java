import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int ano = total / 365;
        int mes = (total % 365) / 30;
        int dias = (total % 365) % 30;
        System.out.printf("%d ano (s)%n", ano);
        System.out.printf("%d mes (es)%n", mes);
        System.out.printf("%d dia (s)%n", dias);
        scanner.close();
    }
}