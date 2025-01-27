import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.printf("%d minutos%n", (x * 2));
        scanner.close();
    }
}