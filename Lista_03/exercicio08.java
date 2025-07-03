package Lista_03;

import java.util.Scanner;

public class exercicio08 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int mI = 0;

        for (int i = 1; i <= 20; i++){
            System.out.println("Digite a " +  i + " idade:");
            int idade = entrada.nextInt();

            if (idade >= 18){
                mI++;
            }
        }

        System.out.println("Nesse grupo, " + mI + " são maiores de idade");

    }
}