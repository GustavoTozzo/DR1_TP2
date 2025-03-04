package AtividadeSete;

import java.util.Scanner;

public class ImpostoDeRenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu salário bruto anual: R$ ");
        double salarioBruto = scanner.nextDouble();

        double imposto = calcularImposto(salarioBruto);
        double salarioLiquido = salarioBruto - imposto;

        System.out.println("\nResumo do Cálculo do Imposto de Renda:");
        System.out.printf("Salário Bruto Anual: R$ %.2f%n", salarioBruto);
        System.out.printf("Imposto a Pagar: R$ %.2f%n", imposto);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);

        scanner.close();
    }

    public static double calcularImposto(double salario) {
        double imposto = 0;

        if (salario <= 22847.76) {
            imposto = 0;
        } else if (salario <= 33919.80) {
            imposto = (salario - 22847.76) * 0.075;
        } else if (salario <= 45012.60) {
            imposto = (33919.80 - 22847.76) * 0.075 + (salario - 33919.80) * 0.15;
        } else if (salario <= 55976.16) {
            imposto = (33919.80 - 22847.76) * 0.075 + (45012.60 - 33919.80) * 0.15 + (salario - 45012.60) * 0.225;
        } else {
            imposto = (33919.80 - 22847.76) * 0.075 + (45012.60 - 33919.80) * 0.15 + (55976.16 - 45012.60) * 0.225 + (salario - 55976.16) * 0.275;
        }

        return imposto;
    }
}
