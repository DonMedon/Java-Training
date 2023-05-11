public class circulo {

    private double raio;

    private static double pi = 3.141592;

    public circulo(double raio) {
        this.raio=raio;
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio=raio;
    }

    public double circunferencia() {
        return 2*pi*this.raio;
    }

    public double diametro() {
        return 2*this.raio;
    }

    public double areaCirculo() {
        return pi*(this.raio*this.raio);
    }
}
