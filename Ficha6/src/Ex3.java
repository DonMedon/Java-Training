import java.util.Scanner;
public class Ex3 {

    public static boolean primo(int num) {

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;
        System.out.println("Enter a number");
        num=input.nextInt();

        if(primo(num)) {
            System.out.println("O nº é primo");
        } else {
            System.out.println("O nº não é primo");
        }
    }
}