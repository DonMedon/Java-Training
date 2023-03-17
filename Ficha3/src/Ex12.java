import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner input = new Scanner(System.in);

        //Escreva um programa que leia uma sequência de números inteiros do
        //utilizador  e determine se a sequência está em ordem crescente.

        int quantidade, counter = 1, num1, num2;
        boolean crescente = true;

        System.out.println("Quantos números quer introduzir?");

        quantidade = input.nextInt();

        System.out.println("Intrduz um número");
        num1 = input.nextInt();

        while(counter < quantidade) {
            System.out.println("Intrduz um número");
            num2 = input.nextInt();
            counter++;

            if(num2 <= num1) {
                System.out.println("Atenção, não é crescente");
                crescente = false;
            }
            num1 = num2;
        }

        if(crescente == true) {
            System.out.println("Crescente");
        } else {
            System.out.println("Decrescente");
        }

    }
}