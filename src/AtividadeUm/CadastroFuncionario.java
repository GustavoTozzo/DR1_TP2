package AtividadeUm;

import java.util.Scanner;

public class CadastroFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeUsuario = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o nome da sua mãe: ");
        String nomeMae = scanner.nextLine();

        System.out.print("Digite o nome do seu pai: ");
        String nomePai = scanner.nextLine();

        System.out.println("\n--- Informações do Usuário ---");
        System.out.println("Nome: " + nomeUsuario);
        System.out.println("Idade: " + idade);
        System.out.println("Nome da Mãe: " + nomeMae);
        System.out.println("Nome do Pai: " + nomePai);

        if (nomeUsuario.length() > nomeMae.length() && nomeUsuario.length() > nomePai.length()) {
            System.out.println("Seu nome é o mais longo entre os três.");
        } else if (nomeUsuario.length() < nomeMae.length() && nomeUsuario.length() < nomePai.length()) {
            System.out.println("Seu nome é o mais curto entre os três.");
        } else if (nomeUsuario.length() == nomeMae.length() && nomeUsuario.length() == nomePai.length()) {
            System.out.println("Seu nome tem o mesmo número de letras que o nome da sua mãe e do seu pai.");
        } else if (nomeUsuario.length() == nomeMae.length()) {
            System.out.println("Seu nome tem o mesmo número de letras que o nome da sua mãe.");
        } else if (nomeUsuario.length() == nomePai.length()) {
            System.out.println("Seu nome tem o mesmo número de letras que o nome do seu pai.");
        } else {
            System.out.println("Seu nome não é o maior nem o menor, mas tem um tamanho intermediário.");
        }

        scanner.close();
    }
}
