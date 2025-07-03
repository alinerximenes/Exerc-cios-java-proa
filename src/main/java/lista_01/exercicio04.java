package lista_01;

import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem-vindo(a) à MaisVeloz!");
        System.out.print("Digite a porcentagem do IPI a ser adicionada no valor das peças: ");
        double ipi = entrada.nextDouble();

        System.out.print("Digite o código da peça 1: ");
        int codPeca1 = entrada.nextInt();

        System.out.print("Digite o valor unitário da peça 1: ");
        double valPeca1 = entrada.nextDouble();

        System.out.print("Digite a quantidade da peça 1: ");
        int quantidadePeca1 = entrada.nextInt();

        System.out.print("Digite o código da peça 2: ");
        int codPeca2 = entrada.nextInt();

        System.out.print("Digite o valor unitário da peça 2: ");
        double valPeca2 = entrada.nextDouble();

        System.out.print("Digite a quantidade da peça 2: ");
        int quantidadePeca2 = entrada.nextInt();

        double total = (valPeca1 * quantidadePeca1 + valPeca2 * quantidadePeca2) * (ipi / 100 + 1);

        System.out.printf("O total da sua compra com IPI ficou: R$:"+total);

        entrada.close();
    }
}
