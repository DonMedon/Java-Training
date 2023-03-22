import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner input = new Scanner(System.in);

        //Implemente um programa que permita adicionar 10 números inteiros
        //a um array e que os imprima pela ordem de inserção.

        int[] num = new int[10];
        int counter = 0;

        for(counter=0;counter<10;counter++) {

            System.out.println("Digite um número");
            num[counter] = input.nextInt();
        }

        counter=0;

        while(counter<10) {

            System.out.println(num[counter]);
            counter++;
        }





    }
}