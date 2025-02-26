import com.sun.jdi.connect.Connector;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);
        int codigo = read.nextInt();
        int quantidade = read.nextInt();
        double total;
        double produto;
        switch (codigo) {
            case 1:
                produto = 4.00;
                break;
            case 2:
                produto = 4.50;
                break;
            case 3:
                produto = 5.00;
                break;
            case 4:
                produto = 2.00;
                break;
            case 5:
                produto = 1.50; 
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + codigo);
        }
        total = produto * quantidade;
        System.out.printf("Total: R$ %.2f%n", total);
        read.close();
    }
}