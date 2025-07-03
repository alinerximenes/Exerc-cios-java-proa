package Lista_03;

import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int s = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o " + i + "° número:");
            int n = entrada.nextInt();
            s += n;
        }

        System.out.println("A soma desses 10 números é:" + s);
    }
}