package AtividadeOito;

import java.util.Scanner;

public class TipoDoTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento do primeiro lado: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Digite o comprimento do segundo lado: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Digite o comprimento do terceiro lado: ");
        double lado3 = scanner.nextDouble();

        if (ehTrianguloValido(lado1, lado2, lado3)) {
            System.out.println("\nOs lados formam um triângulo do tipo " + classificarTriangulo(lado1, lado2, lado3));
        } else {
            System.out.println("\nOs valores informados não formam um triângulo válido.");
        }

        scanner.close();
    }

    public static boolean ehTrianguloValido(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static String classificarTriangulo(double a, double b, double c) {  // Professor, eu não entendi porque a classe está vermelha,sendo que o código está sendo lido e executado corretamente;
        if (a == b && b == c) {
            return "Equilátero, ou seja, três lados iguais.";
        } else if (a == b || a == c || b == c) {
            return "Isósceles, ou seja, dois lados iguais.";
        } else {
            return "Escaleno, ou seja, nenhum lado igual.";
        }
    }
}
