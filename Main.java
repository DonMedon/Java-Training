import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Declarar variáveis para o nº do quarto, do nº de dias reservado e o tipo de quarto.
        int nQuarto, nDias;
        String tipo;

        System.out.println("Qual o nº do quarto que pretende obter informação?");
        nQuarto = input.nextInt();

        System.out.println("Quantos dias do ano esteve o quarto reservado?");
        nDias = input.nextInt();

        System.out.println("Qual o tipo de quarto?");
        tipo=input.next();

        //receita total do quarto - rt
        int rt=0;
        //custo total das limpezas - cl
        int cl=0;

        //Fazer um switch para escolher o tipo de quarto e comsoante a escolha,
        //calcular a receita total e o custo total da limpeza.
        switch (tipo) {
            case "I":
                System.out.println("Quarto Individual");
                rt = nDias * 200;
                cl = nDias * 25;
                break;

        case "D":
                System.out.println("Quarto Duplo");
                rt = nDias * 250;
                cl = nDias * 30;
                break;

            case "T":
                System.out.println("Quarto Triplo");
                rt = nDias * 275;
                cl = nDias * 30;
                break;

            case "S":
                System.out.println("Quarto Suite");
                rt = nDias * 350;
                cl = nDias * 50;
                break;

            default: System.out.println("O tipo de quarto não existe");
        }

        //declarar variável para o imposto.
        double i=(rt-cl)*0.23;
        //declarar variável para o lucro final.
        double lf;

        //Defiinr condições para as diferentes taxas de imposto aplicadas a diferentes valores para o lucro.
        if(rt-cl>50000) {
            i=(rt-cl)*0.28;}
        if((rt-cl)>20000 && (rt-cl)<=50000) {
            i=(rt-cl)*0.25;}

        //Calcular o lucro final (depois de retirar o custo d limpeza e o imposto).
        lf=(rt-cl)-i;

        System.out.println("O quarto nº " + nQuarto + " esteve reservado " + nDias + " dias. " +
                "O valor total das reservas foi de " + rt + " euros, " +
                "o custo total das limpezas foi de " + cl + " euros " +
                "e o valor dos impostos a entregar ao Estado foi de " + i + " euros. " +
                "O lucro final do quarto foi de " + lf + " euros.");

    }
}