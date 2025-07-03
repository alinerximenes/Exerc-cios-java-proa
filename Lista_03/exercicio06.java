package Lista_03;

import java.util.Scanner;

public class exercicio06 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int sI = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite a " + i + " ° idade:");
            int idade = entrada.nextInt();

            sI += idade;
        }

        System.out.println("A soma de todas as idades é:" + sI);
    }
}
