import java.util.Scanner;
public class Ex4 {

    public static void perfeito(int num) {

        int sum=0;
        for (int i = 1; i < num; i++) {

            if(num%i==0) {
                sum=sum+i;
            }

        }
        if(num==sum) {
            System.out.println("The number is perfect");
        } else {
            System.out.println("The number is not perfect");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;
        System.out.println("Enter a number");
        num=input.nextInt();
        perfeito(num);
    }
}