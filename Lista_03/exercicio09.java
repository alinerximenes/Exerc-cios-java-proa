package Lista_03;

import java.util.Scanner;

public class exercicio09 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nN= "";
        int iN = Integer.MAX_VALUE;

        for(int i = 1; i <= 10; i++){
            System.out.println("Informe o nome da " + i + " º pessoa:");
            String nome = entrada.nextLine();

            System.out.println("Informe a idade do(a) " + nome + ":");
            int idade = entrada.nextInt();
            entrada.nextLine();

            if(idade < iN){
                iN = idade;
                nN = nome;
            }
        }

        System.out.println("A pessoa mais nova desse grupo é o(a)" + nN + " com " + iN +" anos");
    }
}
