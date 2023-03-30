import java.util.Scanner;
public class Ex3 {

    public static void primo(int num) {

        //Implemente uma função que determine se um número (passado por argumento) é ou não primo.
        boolean p = true;

        for (int i = 2; i < num; i++) {



            if (num % i == 0) {
                p = false;
            }


        }

        if (p) {
            System.out.println("O nº é primo");
        } else {
            System.out.println("O nº não é primo");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;
        System.out.println("Enter a number");
        num=input.nextInt();
        primo(num);
    }
}