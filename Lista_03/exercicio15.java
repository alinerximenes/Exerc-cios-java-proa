package Lista_03;

import java.util.Scanner;

public class exercicio15 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n;
        int s = 0;

        System.out.println("Digite números para somar. Caso adicionar um número negativo, a conta se encerra.");

        while(true){
            System.out.println("Informe um número:");
            n = entrada.nextInt();

            if(n < 0){ break; }
            s += n;
        }

        System.out.println("Conta encerrada.");
        System.out.println("A soma dos números digitados é: " + s);
    }
}