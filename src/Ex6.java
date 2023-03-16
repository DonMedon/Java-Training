import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        //Faça um programa que leia um número inteiro e imprima os 5 anteriores e os 5 seguintes..

        int n, ant, suc;

        System.out.println("Introduza um numero.");
        n = input.nextInt();
        ant = n - 5;
        suc = n + 5;

        while (ant <= suc) {

            System.out.println(ant);
            ant++;

            ;}


    }
}



