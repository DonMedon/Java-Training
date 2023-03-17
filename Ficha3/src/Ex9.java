import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner input = new Scanner(System.in);

        //Faça um programa que leia um número inteiro (variável limite), um incremento (variável salto)
        // e imprima os números inteiros de 0 até limite inclusive, com incremento de salto.
        // Suponha que limite e salto são maiores que zero.
        // Exemplo:Valores lidos: 10 (limite) e 3 (salto)Saída do algoritmo: 0 3 6 9

        int n = 0, limite, salto;

        System.out.println("Introduza um nº limite");
        limite = input.nextInt();
        System.out.println("Introduza um nº para o salto");
        salto = input.nextInt();

        while (n < limite) {

            System.out.println(n);
            n = n + salto;


        }
    }
}