package AtividadeCinco;

import java.util.Scanner;

public class CalculoDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o valor da compra
        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        double desconto = 0;

        if (valorCompra > 1000) {
            desconto = valorCompra * 0.10;
        } else if (valorCompra >= 500) {
            desconto = valorCompra * 0.05;
        }

        double valorFinal = valorCompra - desconto;

        System.out.println("Valor original: R$ " + String.format("%.2f", valorCompra));
        System.out.println("Desconto aplicado: R$ " + String.format("%.2f", desconto));
        System.out.println("Valor final: R$ " + String.format("%.2f", valorFinal));

        scanner.close();
    }
}
