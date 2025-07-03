package lista_01;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe sua idade em anos: ");
        int anos = entrada.nextInt();

        System.out.print("Coloque os meses: ");
        int meses = entrada.nextInt();

        System.out.print("Informe os dias: ");
        int dias = entrada.nextInt();

        int totalDD = (anos * 365) + (meses * 30) + dias;


        System.out.println(anos + " anos, " + meses + " meses e " + dias + " dias.");
        System.out.println("Que legal! Você viveu até agora " + totalDD + " dias.");
    }
}
