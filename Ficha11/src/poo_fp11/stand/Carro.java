package poo_fp11.stand;

public class Carro extends Veiculo {

    private Combustivel combustivel;

    public Carro(String marca, String modelo, int anoFabrico, int potencia, double cilindrada, double consumo, Combustivel combustivel) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, consumo);
        this.combustivel = combustivel;
    }
    public Combustivel getCombustivel() {
        return combustivel;
    }
    public double calcularCusto(double km) {
        double custo = 0;
        if (this.combustivel.equals(Combustivel.DIESEL)){
            custo = calcularConsumo(km) * 1.75;
        } else if (this.combustivel.equals(Combustivel.GASOLINA)) {
            custo = calcularConsumo(km) * 1.95;
        } else if (this.combustivel.equals(Combustivel.GPL)) {
            custo = calcularConsumo(km) * 0.95;
        }
        System.out.println(custo + "€ numa viagem de " + km + " km.");
        return custo;
    }
    public void exibirDetalhes() {
        System.out.println("O carro " + getMarca() + " " + getModelo() + " gastou: ");
    }

}

