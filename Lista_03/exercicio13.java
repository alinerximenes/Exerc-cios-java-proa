package Lista_03;

import java.util.Scanner;

public class exercicio13 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int nE = 0;

        for(int i = 1; i <= 20; i++){
            System.out.println("Digite o " + i + "° número:");
            int n = entrada.nextInt();

            if(n >= 0 && n <= 100){
                nE++;
            }
        }

        System.out.println("Existem " + nE + " números entre 0 e 100!");

    }
}