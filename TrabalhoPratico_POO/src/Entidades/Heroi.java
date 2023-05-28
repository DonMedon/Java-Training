package Entidades;

import Entidades.Entidade;
import Itens.Arma;
import Itens.ItemHeroi;
import Itens.PocaoHP;

import java.util.ArrayList;
import java.util.Scanner;

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

    public void setOuro(int ouro) {
        this.ouro = ouro;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    abstract public void atacar(NPC vilao);

    public void usarPocao() {

        Scanner input = new Scanner(System.in);
        String option;

        for(PocaoHP pocao : this.pocoes) {
            System.out.println(this.pocoes);
            System.out.println("---------------------------------------");
            System.out.println("Qual a poção que deseja utilizar?");
            option = input.next();
            if (option.equals(pocao.getNome())) {
                setHp(getHp() + pocao.getCura());
                System.out.println("O herói consumiu a poção " + pocao.getNome() + " que lhe curou " + pocao.getCura() + " de vida.");
                System.out.println("O heróis tem agora " + this.getHp() + " de vida");
            } else {
                System.out.println("O herói não tem essa poção!");
            }
        }
    }
}
