package AtividadeTres;

import java.util.Scanner;

public class ConversorMoedas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor em reais: ");
        double valor = sc.nextDouble();
        sc.nextLine();

        System.out.println("Escolha a moeda a qual deseja converter (euro, dolar, libras: ");
        String moeda = sc.nextLine().toLowerCase();

        double valorConvertido = 0;
        String moedaDestino = "";

        if (moeda.equals("dolar")) {
            valorConvertido = valor * 5.8;
            moedaDestino = "dólares";
        } else if (moeda.equals("libras")) {
            valorConvertido = valor * 7.4;
            moedaDestino = "libras";
        } else if (moeda.equals("euro")) {
            valorConvertido = valor * 6.1;
            moedaDestino = "euros";
        } else {
            System.out.println("Moeda inválida. Tente novamente.");
            sc.close();
            return;
        }

        System.out.printf("O valor de R$%.2f equivale a %.2f %s.%n", valor, valorConvertido, moedaDestino);

        sc.close();
    }
}
