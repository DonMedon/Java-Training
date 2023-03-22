import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner input = new Scanner(System.in);

        //Escreva um programa que lê um array de tamanho 10 e verifica se os elementos estão em ordem crescente.

        int[]num=new int[10];
        int counter=0;

        for(counter=0;counter<10;counter++) {
            System.out.println("Digite 10 numeros");
            num[counter]=input.nextInt();


        }
    }
}