import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner input = new Scanner(System.in);

        //Faça um programa que leia um número inteiro e imprima os números pares entre 2 e o número lido inclusive.
        //Suponha que o número lido da entrada será maior que 2.

        int n = 2, n1;

        System.out.println("Introduza um número");
        n1 = input.nextInt();

        while(n <= n1) {


            System.out.println(n);
            n+=2;

            }



    }
}