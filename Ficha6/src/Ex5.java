import java.util.Scanner;
public class Ex5 {

    public static boolean parImpar(int num) {

        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean pOun(int num) {

        if (num > 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean primo(int num) {

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean perfeito(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {

            if (num % i == 0) {
                sum = sum + i;
            }
        }
        return num == sum;
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
                    if(parImpar(num))
                        System.out.println("O nº é par");
                    else
                        System.out.println("O nº é impar");
                    break;

                case 2:
                    if (pOun(num))
                        System.out.println("O nº é positivo");
                    else
                        System.out.println("O nº é negativo");
                    break;

                case 3:
                    if(primo(num))
                        System.out.println("O nº é primo");
                    else
                        System.out.println("O nº não é primo");
                    break;

                case 4:
                    if (perfeito(num))
                        System.out.println("O nº é perfeito");
                    else
                        System.out.println("O nº não é perfeito");
                    break;
            }
        }
        while (opcao != 4);
    }
    public static void main(String[] args) {

        menu();

        }
    }



