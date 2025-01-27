import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int horas = total / 3600;
        int minutos  = ((total - (horas * 3600)) / 60);
        int segundos = total % 60;
        System.out.printf("%d:%d:%d%n", horas, minutos, segundos);
        scanner.close();
    }
}