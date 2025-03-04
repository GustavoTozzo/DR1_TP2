package AtividadeNove;

import java.util.Scanner;

public class CadastroSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cadastre uma senha: ");
        String senhaCadastrada = scanner.nextLine();

        String senhaDigitada;

        do {
            System.out.print("Digite a senha cadastrada: ");
            senhaDigitada = scanner.nextLine();

            if (!senhaDigitada.equals(senhaCadastrada)) {
                System.out.println("Senha incorreta. Tente novamente!");
            }
        } while (!senhaDigitada.equals(senhaCadastrada));

        System.out.println("Senha correta!! Pode acessar o sistema.");

        scanner.close();
    }
}
