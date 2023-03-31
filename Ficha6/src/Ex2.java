import java.util.Scanner;
public class Ex2 {

    public static boolean pOun(int num) {

        if (num > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;
        System.out.println("Enter a number");
        num = input.nextInt();
        if (pOun(num)) {
            System.out.println(num + " é positivo");
        } else {
            System.out.println(num + " é negativo");
        }
    }
}



