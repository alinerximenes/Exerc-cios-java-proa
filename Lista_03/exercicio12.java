package Lista_03;

import java.util.Scanner;

public class exercicio12 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int nP = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Informe um número: ");
            int n = entrada.nextInt();

            if (n % 2 == 0) {
                nP++;
            }
        }

        System.out.println("Desse grupo " + nP + " números são pares!");
    }
}