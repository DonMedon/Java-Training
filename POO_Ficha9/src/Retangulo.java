import java.util.Scanner;

public class Retangulo {

    private double altura;
    private double largura;
    public Retangulo(double altura, double largura) {
        this.altura=altura;
        this.largura=largura;
    }
    public double calculos() {

        Scanner input= new Scanner(System.in);

        System.out.print("Insira a altura do retângulo: ");
        double altura = input.nextDouble();

        System.out.print("Insira a largura do retângulo: ");
        double largura = input.nextDouble();

        double area = altura*largura;
        System.out.println("A área do retângulo é: "+area);

        double perimetro = altura * 2 + largura * 2;
        System.out.println("O perímetro do retângulo é: "+ perimetro);

    }
}
