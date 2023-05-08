package Ex4;

import static Ex4.Tipo.*;

public class Imovel {

    private String rua, nPorta, cidade;
    private double area, areaPiscina, valorImovel;
    private int nQuartos, nWC;

    Tipo tipo;
    Acabamento acabamento;

    public Imovel(String rua, String nPorta, String cidade, double area, double areaPiscina, int nQuartos, int nWC, Tipo tipo, Acabamento acabamento) {
        this.rua = rua;
        this.nPorta = nPorta;
        this.cidade = cidade;
        this.area = area;
        this.areaPiscina = areaPiscina;
        this.nQuartos = nQuartos;
        this.nWC = nWC;
        this.tipo = tipo;
        this.acabamento = acabamento;
    }

    public double calcularValor() {

        if (this.tipo.equals(Tipo.APARTAMENTO)) {
            this.valorImovel = area * 1000 + nQuartos * 7500 + nWC * 10500 + areaPiscina * 1000;
            if (this.acabamento.equals(Acabamento.RESTAURO)) {
                this.valorImovel *= 0.5;
            } else if (this.acabamento.equals(Acabamento.USADA)) {
                this.valorImovel *= 0.9;
            } else if (this.acabamento.equals(Acabamento.LUXO)) {
                this.valorImovel *= 1.25;
            }

        }
        if (this.tipo.equals(Tipo.CASA)) {
            this.valorImovel = area * 3000 + nQuartos * 7500 + nWC * 10500 + areaPiscina * 1000;
            if (this.acabamento.equals(Acabamento.RESTAURO)) {
                this.valorImovel *= 0.5;
            } else if (this.acabamento.equals(Acabamento.USADA)) {
                this.valorImovel *= 0.9;
            } else if (this.acabamento.equals(Acabamento.LUXO)) {
                this.valorImovel *= 1.25;
            }
        }

        if (this.tipo.equals(Tipo.MANSAO)) {
            this.valorImovel = area * 5000 + nQuartos * 7500 + nWC * 10500 + areaPiscina * 1000;
            if (this.acabamento.equals(Acabamento.RESTAURO)) {
                this.valorImovel *= 0.5;
            } else if (this.acabamento.equals(Acabamento.USADA)) {
                this.valorImovel *= 0.9;
            } else if (this.acabamento.equals(Acabamento.LUXO)) {
                this.valorImovel *= 1.25;
            }
        }
        return this.valorImovel;
    }

    public void setAcabamento(Acabamento acabamento) {
        this.acabamento = acabamento;
    }
    public Acabamento getAcabamento() {
        return acabamento;
    }

    public void detalhesImovel() {
        System.out.println("Rua: " + this.rua);
        System.out.println("Cidade: " + this.cidade);
    }
    public Imovel compararImoveis(Imovel imovel2) {
        if (this.calcularValor()>imovel2.calcularValor()) {
            return this;
        } else if (this.calcularValor()<imovel2.calcularValor()) {
            return imovel2;
        }else{
            return null;
        }
    }
}
