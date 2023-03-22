import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner input = new Scanner(System.in);

        //Implemente um programa que permita adicionar o preço de produtos
        //a um array de tamanho 10 e calcular o seu total.

        int[]p = new int[10];
        int counter=0;
        int total=0;

        for (counter=0;counter<10;counter++) {

            System.out.println("Digite 10 preços de produtos");
            p[counter] = input.nextInt();
            total=total+p[counter];

        }
        System.out.println("O total é " + total);

    }
}

