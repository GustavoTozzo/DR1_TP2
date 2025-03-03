package AtividadeDois;

import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double num1 = sc.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double num2 = sc.nextDouble();
        System.out.println("Digite o terceiro valor: ");
        double num3 = sc.nextDouble();
        System.out.println("Digite o quarto valor: ");
        double num4 = sc.nextDouble();

        double media = (num1 + num2 + num3 + num4) / 4;

        if (media >= 7) {
            System.out.println("Sua média anual foi: " + media + ". Você foi aprovado!");
        } else if (media >= 5 && media < 7) {
            System.out.println("Sua média anual foi: " + media +". Você está em recuperação!.");
        } else {
            System.out.println("Sua média anual foi: " + media + ". Você foi reprovado!.");
        }
    }
}
