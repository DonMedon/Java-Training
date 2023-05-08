package Ex3;

import java.util.ArrayList;

public class Animal {

    private String nome, especie, pais;
    private double peso;
    private ArrayList<String> alimentacao;


    public Animal(String nome, String especie, String pais, double peso, ArrayList<String> alimentacao) {
        this.nome = nome;
        this.especie = especie;
        this.pais = pais;
        this.peso = peso;
        this.alimentacao = alimentacao;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public String getPais() {
        return pais;
    }

    public double getPeso() {
        return peso;
    }

    public ArrayList getAlimentacao() {
        return alimentacao;
    }


    public boolean comer(String alimento, double peso) {

        for (int i = 0; i < alimentacao.size(); i++) {
            if (alimento.equals(alimentacao.get(i))) {
                this.peso += peso / 1000;
                return true;
            }
        }
        return false;

    }
}
