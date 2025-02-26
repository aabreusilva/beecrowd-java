import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);
        double value = read.nextDouble();
        if (value >= 0.00 && value <= 25.0000) {
            System.out.println("Intervalo [0,25]");
        } else if (value >= 25.00001 && value <= 50.0000000) {
            System.out.println("Intervalo (25,50]");
        } else if (value >= 50.00001 && value <= 75.0000000) {
            System.out.println("Intervalo (50,75]");
        } else if (value > 75.00001 && value <= 100.0000000) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
        read.close();
    }
}