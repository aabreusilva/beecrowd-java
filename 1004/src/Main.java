import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a, b, prod;
        a = scanner.nextInt();
        b = scanner.nextInt();
        prod = a * b;
        System.out.printf("PROD = %d%n", prod);

        scanner.close();
    }
}