package Lista_03;

import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        String nome = entrada.nextLine();

        System.out.println("Informe um número:");
        int n = entrada.nextInt();

        System.out.println("Imprimindo seu nome " + n + " vezes");

        for (int i = 1; i <= n; i++) {
            System.out.println(i + " - " + nome);
        }
    }
}