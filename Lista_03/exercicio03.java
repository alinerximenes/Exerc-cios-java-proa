package Lista_03;

import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = entrada.nextLine();

        for(int i = 1; i <= 10; i++){
            System.out.println(nome);
        }

    }
}