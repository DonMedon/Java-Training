import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner input = new Scanner(System.in);

        //Escreva um programa que lê um array de tamanho 10 e encontra o maior elemento.

        int[]num=new int[10];
        int maior;

        System.out.println("Digite 10 valores");
        num[0]=input.nextInt();
        maior=num[0];

        for(int counter=1;counter<10;counter++) {

            System.out.println("Digite 10 valores");
            num[counter]=input.nextInt();
            if (num[counter]>maior) {
                maior=num[counter];

            }
        }
        System.out.println(maior);
    }
}