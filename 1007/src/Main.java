import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a, b, c, d, dif;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        dif = (a * b) - (c * d);
        System.out.printf("DIFERENCA = %d%n", dif);
        scanner.close();
    }
}