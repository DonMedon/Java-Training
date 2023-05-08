package Ex1;

public class Carro {

    private String marca, modelo;

    private int anoFabrico, potencia;

    private double cilindrada, consumo;

    private Combustivel combustivel;


    public Carro(String marca, String modelo, int anoFabrico, int potencia, double cilindrada, double consumo, Combustivel combustivel) {

        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.consumo = consumo;
        this.combustivel = combustivel;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabrico() {
        return anoFabrico;
    }

    public int getPotencia() {
        return potencia;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public double getConsumo() {
        return consumo;
    }

    public Combustivel getCombustivel() {
        return combustivel;
    }

    public int calcularIdade() {
        return 2023 - anoFabrico;
    }

    public void ligar() {

        if (calcularIdade() > 30) {
            if (this.combustivel.equals(Combustivel.GASOLEO)) {
                System.out.println("Deita um pouco de fumo... Custa a apegar... O carro está ligado");
                System.out.println("Vrum-vrum-vrum");
            } else {
                System.out.println("Custa a pegar... O carro está ligado");
                System.out.println("Vrum-vrum-vrum");
            }
        } else if (this.potencia < 250) {
            System.out.println("O carro está ligado");
            System.out.println("Vruuuuuuum");

        } else {
            System.out.println("O carro está ligado");
            System.out.println("VRUUUUUUUM");
        }
    }

    public void exibirDetalhes() {
        System.out.println("Marca: "+ this.marca);
        System.out.println("Modelo: "+ this.modelo);
    }

    public Carro corrida(Carro adversario) {

        if (this.potencia > adversario.potencia) {
            return this;
        } else if (this.potencia < adversario.potencia) {
            return adversario;
        } else {
            if (this.cilindrada > adversario.cilindrada) {
                return this;
            } else if (this.cilindrada < adversario.cilindrada) {
                return adversario;
            } else {
                if (this.anoFabrico > adversario.anoFabrico) {
                    return this;
                } else if (this.anoFabrico < adversario.anoFabrico) {
                    return adversario;
                }
            }
        }
        return null;

    }

    public double calcularConsumo(double km) {

        return km*consumo/100;

    }




}




