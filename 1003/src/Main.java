import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a, b, soma;

        a = scanner.nextInt();
        b = scanner.nextInt();

        soma = a + b;

        System.out.printf("SOMA = %d%n", soma);

        scanner.close();
    }
}