import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double raio;

        System.out.println("Introduza um raio: ");
        raio = input.nextDouble();

        circulo circunferencia = new circulo(raio);


        System.out.println("Raio: "+ circunferencia.getRaio());
        System.out.println("Diametro:: "+ circunferencia.diametro());
        System.out.println("Circunferencia-diametro: "+ circunferencia.circunferencia());
        System.out.println("Area: "+ circunferencia.areaCirculo());

    }
}
