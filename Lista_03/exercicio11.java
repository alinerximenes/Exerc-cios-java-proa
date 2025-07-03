package Lista_03;

import java.util.Scanner;

public class exercicio11 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int nM = 0;

        for(int i = 1; i <= 20; i++){
            System.out.println("Digite o " + i + "° número:");
            int n = entrada.nextInt();

            if(n > 8){
                nM++;
            }
        }

        System.out.println("Existem " + nM + " número(s) maior(es) que 8");

    }
}