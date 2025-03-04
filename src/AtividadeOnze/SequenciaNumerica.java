package AtividadeOnze;

import java.util.Scanner;

public class SequenciaNumerica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inicial: ");
        int valorInicial = scanner.nextInt();

        System.out.print("Digite o incremento: ");
        int incremento = scanner.nextInt();

        System.out.print("Sequência: ");
        int numero = valorInicial;
        boolean primeiro = true;

        while (numero <= 100) {
            if (!primeiro) {
                System.out.print(", ");
            }
            System.out.print(numero);
            numero += incremento;
            primeiro = false;
        }

        System.out.println();
        scanner.close();
    }
}
