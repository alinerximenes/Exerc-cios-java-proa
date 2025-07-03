package lista_01;

import java.util.Scanner;

public class exercicio03 {

        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            System.out.println("Informe seu saldo: ");

            float s = entrada.nextFloat();

            double r = s * 1.01;

            System.out.println("Seu saldo com reajuste de 1%: R$ " + r);

    }
}
