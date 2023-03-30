import java.util.Scanner;
public class Ex5 {

    public static void parImpar(int num) {

        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }

    public static void pOun(int num) {

        //Implemente uma função que determine se um número (passado por argumento) é positivo ou negativo.

        if (num < 0) {
            System.out.println(num + " é negativo");
        } else {
            System.out.println(num + " é positivo");
        }
    }

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

    public static void perfeito(int num) {

        int sum = 0;
        for (int i = 1; i < num; i++) {

            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (num == sum) {
            System.out.println("The number is perfect");
        } else {
            System.out.println("The number is not perfect");
        }
    }

    public static void menu() {

        /*Implemente  um  programa  que  contenha  uma  função  com  menu  de  opções
        que  permitam  invocar  as  funções  desenvolvidas nos exercícios 1 a 3 (ou 4),
        devendo o número ser escolhido antes das opções do menu.*/

        int num, opcao;
        Scanner input = new Scanner(System.in);

        do {

            System.out.println("Escolha um número:");
            num = input.nextInt();
            do {

                System.out.println("1 - Para verificar se é par ou ímpar");
                System.out.println("2 - Para verificar se é positivo ou negativo");
                System.out.println("3 - Para verificar se é primo");
                System.out.println("4 - Para verificar se é perfeito");

                System.out.println("Escolha uma opção");
                opcao = input.nextInt();

                if (opcao < 1 || opcao > 4) {
                    System.out.println("Opção inválida");
                }

            } while (opcao < 1 || opcao > 4);

            switch (opcao) {
                case 1:
                    parImpar(num);
                    break;

                case 2:
                    pOun(num);
                    break;

                case 3:
                    primo(num);
                    break;

                case 4:
                    perfeito(num);
                    break;

            }
        }

        while (opcao != 4);


    }

    public static void main(String[] args) {

        menu();
    }
}


