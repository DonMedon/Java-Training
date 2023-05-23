package Entidades;

import Entidades.Entidade;
import Itens.Arma;
import Itens.PocaoHP;

import java.util.ArrayList;

public abstract class Heroi extends Entidade {
    private int nivel, ouro;
    private Arma arma;
    private ArrayList<PocaoHP> pocoes;

    public Heroi(String nome, int hp, int forca, int nivel, int ouro, Arma arma, ArrayList<PocaoHP> pocoes) {
        super(nome, hp, forca);
        this.nivel = nivel;
        this.ouro = ouro;
        this.arma = arma;
        this.pocoes = pocoes;
    }

    public int getNivel() {
        return nivel;
    }

    public int getOuro() {
        return ouro;
    }

    public Arma getArma() {
        return arma;
    }

    public ArrayList<PocaoHP> getPocoes() {
        return pocoes;
    }

    abstract public void atacar(NPC vilao);

}
