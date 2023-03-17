import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner input = new Scanner(System.in);

        //Escreva um algoritmo que leia uma quantidade desconhecida de números inteiros positivos fornecida
        //pelo utilizador e conte quantos deles estão nos seguintes intervalos:
        //[0.25], [26,50], [51,75] e [76,100]. A entrada de dados deve terminar quando for lido um número negativo.

        int n, counter1 = 0, counter2 = 0, counter3 = 0, counter4 = 0;

        System.out.println("Introduza um nº");
        n = input.nextInt();

        while(n > 0) {


            if(n >= 0 && n <= 25) {
                counter1++;}
            if(n >= 26 && n <= 50) {
                counter2++;}
            if(n >= 51 && n <= 75) {
                counter3++;}
            if(n >= 76 && n <= 100) {
                counter4++;}

            System.out.println("Introduza outro nº");
            n = input.nextInt();
        }

        System.out.println("Foram introduzidos " + counter1 + " números no intervalo [0,25].");
        System.out.println("Foram introduzidos " + counter2 + " números no intervalo [26,50].");
        System.out.println("Foram introduzidos " + counter3 + " números no intervalo [51,75].");
        System.out.println("Foram introduzidos " + counter4 + " números no intervalo [76,100].");




    }
}
