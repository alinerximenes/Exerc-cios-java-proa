package Lista_03;

import java.util.Scanner;

public class exercicio14 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int nE0 = 0;
        int nE101 = 0;
        int nM = 0;

        for(int i = 1; i <= 20; i++) {
            System.out.println("Digite o " + i + "° número:");
            int n = entrada.nextInt();

            if(n >= 0 && n <= 100){
                nE0++;
            }else if(n >= 101 && n <= 200){
                nE101++;
            }else if(n >= 201){
                nM++;
            }
        }

        System.out.println("Nesse grupo:");
        System.out.println(nE0 + " números estão entre 0 e 100");
        System.out.println(nE101 + " números estão entre 101 e 200");
        System.out.println(nM + " números são maiores que 200");
    }
}