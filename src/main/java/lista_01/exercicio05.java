package lista_01;

import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float sM= 1518;

        System.out.println("Digite o valor do salário:");
        float s = entrada.nextFloat();

        float qS = s / sM;

        System.out.printf("Você ganha em torno de: %.2f salários mínimos.%n", qS);
    }
}
