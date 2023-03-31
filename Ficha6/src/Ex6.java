import java.util.Scanner;
public class Ex6 {

    public static int maior(int[] array) {

        //Escreva uma função que recebe um array de inteiros como parâmetro e retorna o maior valor do array.

        int maior;
        maior = array[0];


        for (int i = 0; i < array.length; i++)
            if (array[i] > maior) {
                maior = array[i];
            }

        return maior;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int size;
        System.out.println("Quantos números quer introduzir?");
        size=input.nextInt();
        int[] array= new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduza um número");
            array[i]=input.nextInt();
        }
        System.out.println(maior(array));
    }

}
