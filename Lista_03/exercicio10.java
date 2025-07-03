package Lista_03;

import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número par ver a tabuada: ");
        int n = entrada.nextInt();

        System.out.println("Tabuada do número" + n);
        for (int i = 1; i <= 10; i++) {
            int r = n * i;
            System.out.println(n + " x " + i + " = " + r);
        }

    }
}
