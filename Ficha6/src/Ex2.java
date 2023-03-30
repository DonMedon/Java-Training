import java.util.Scanner;
public class Ex2 {

    public static void pOun(int num) {

        //Implemente uma função que determine se um número (passado por argumento) é positivo ou negativo.

        if (num < 0) {
            System.out.println(num + " é negativo");
        } else {
            System.out.println(num + " é positivo");
        }
    }

    public static void main (String[]args){

        Scanner input = new Scanner(System.in);

        int num;
        System.out.println("Enter a number");
        num=input.nextInt();
        pOun(num);
    }
}



