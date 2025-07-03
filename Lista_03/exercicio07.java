package Lista_03;

import java.util.Scanner;

public class exercicio07 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int sI = 0;

        for (int i = 1; i <= 20; i++){
            System.out.println("Digite a " +  i + " ° idade:");
            int idade = entrada.nextInt();

            sI += idade;
        }

        double m = sI / 20;

        System.out.println("A média das idades é:" + m);
    }

}