package poo_fp11.stand;

public class Veiculo {

    private String marca, modelo;

    private int anoFabrico, potencia;

    private double cilindrada, consumo;



    public Veiculo(String marca, String modelo, int anoFabrico, int potencia, double cilindrada, double consumo) {

        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.consumo = consumo;
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

    public int calcularIdade() {
        return 2023 - anoFabrico;
    }

    public void ligar() {
        System.out.println("O veiculo está ligado");
    }

    public void exibirDetalhes() {
        System.out.println("Marca: "+ this.marca);
        System.out.println("Modelo: "+ this.modelo);
    }

    public Veiculo corrida(Veiculo adversario) {

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




