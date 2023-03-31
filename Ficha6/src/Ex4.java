import java.util.Scanner;
public class Ex4 {

    public static boolean perfeito(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {

            if (num % i == 0) {
                sum = sum + i;
            }
        }
        return num == sum;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;
        System.out.println("Enter a number");
        num = input.nextInt();
        if (perfeito(num)) {
            System.out.println("The number is perfect");
        } else {
            System.out.println("The number is not perfect");
        }
    }
}