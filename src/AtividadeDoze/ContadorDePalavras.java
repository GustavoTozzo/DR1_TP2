package AtividadeDoze;

import java.util.Scanner;

public class ContadorDePalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        String[] palavras = frase.trim().split("\\s+");
        int quantidadePalavras = (frase.trim().isEmpty()) ? 0 : palavras.length;

        System.out.println("A frase contem " + quantidadePalavras + " palavras.");

        scanner.close();
    }
}
