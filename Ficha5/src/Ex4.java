import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner input = new Scanner(System.in);

        //Escreva um programa que lê um array de tamanho 10 e encontra o menor elemento.

        int[]num=new int[10];
        int menor;

        System.out.println("Digite 10 valores");
        num[0]=input.nextInt();
        menor=num[0];

        for(int counter=1;counter<10;counter++) {

            System.out.println("Digite 10 valores");
            num[counter]=input.nextInt();
            if (num[counter]<menor) {
                menor=num[counter];

            }
        }
        System.out.println(menor);
    }
}