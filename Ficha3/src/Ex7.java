import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner input = new Scanner(System.in);

        //Faça um programa que vai pedindo números ao utilizador até que este introduza o número -1.
        //O computador deve dizer a média dos números introduzidos (excluindo o -1).

        int n, soma = 0, counter = 0;
        double media;

        System.out.println("Introduza um número");
        n = input.nextInt();


        while (n != -1) {

            soma = soma + n;
            counter++;
            System.out.println("Introduza um número");
            n = input.nextInt();


        }

        media = soma / counter;
        System.out.println(media);
    }
}