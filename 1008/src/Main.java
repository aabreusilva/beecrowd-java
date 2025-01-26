import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int numero, hora;
        double salario, total;
        numero = scanner.nextInt();
        hora = scanner.nextInt();
        salario = scanner.nextDouble();
        total = hora * salario;
        System.out.printf("NUMBER = %d%n", numero);
        System.out.printf("SALARY = U$ %.2f%n", total);
        scanner.close();
    }
}