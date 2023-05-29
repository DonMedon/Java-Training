package Entidades;

import Itens.Arma;
import Itens.PocaoHP;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Heroi extends Entidade {
    private int nivel, ouro;
    private Arma arma;
    private ArrayList<PocaoHP> pocoes;

    public Heroi(String nome, int hp, int forca, int nivel, int ouro) {
        super(nome, hp, forca);
        this.nivel = nivel;
        this.ouro = ouro;
        this.pocoes = new ArrayList<>();
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

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public void setPocoes(ArrayList<PocaoHP> pocoes) {
        this.pocoes = pocoes;
    }

    abstract public void atacar(NPC vilao);

    public void usarPocao() {

        Scanner input = new Scanner(System.in);
        int i=0;

        for(PocaoHP pocao : this.getPocoes()) {
            System.out.println("Poções do herói: " + i + " - " + pocao.getNome());
            System.out.println("Vida: " + pocao.getCura());
            i++;

        }
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Qual a poção que deseja utilizar?");
            int option = input.nextInt();

            System.out.println("O herói consumiu a poção " + getPocoes().get(option).getNome() + " que lhe curou " + getPocoes().get(option).getCura() + " de vida.");
            this.setHp(this.getHp() + getPocoes().get(option).getCura());
            System.out.println("O herói tem agora " + this.getHp() + " de vida");

            getPocoes().remove(option);
            i--;

            for (PocaoHP pocao : this.getPocoes()) {
                System.out.println("Poções: " + i) ;
            }
    }
}
