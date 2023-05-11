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

        double area = (this.altura)*(this.largura);
        return area;

        double perimetro = (this.altura * 2) + (this.largura*2);
        return perimetro;


    }
}
