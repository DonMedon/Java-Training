import java.util.Scanner;
public class Ex1 {

    public static void parImpar(int num) {

        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }

        public static void main (String[]args){

            Scanner input = new Scanner(System.in);

            int num;

            System.out.println("Enter a number");

            num = input.nextInt();

            parImpar(num);

        }
    }

