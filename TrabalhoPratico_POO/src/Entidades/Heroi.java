package Entidades;

import Itens.Arma;
import Itens.PocaoHP;
import Itens.TipoHeroi;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Heroi extends Entidade {
    private int nivel, ouro;
    private Arma arma;
    private ArrayList<PocaoHP> pocoes;
    private ArrayList<TipoHeroi> tipoHeroi;

    public Heroi(String nome, int hp, int forca, int nivel, int ouro) {
        super(nome, hp, forca);
        this.nivel = nivel;
        this.ouro = ouro;
        this.pocoes = new ArrayList<>();
        this.tipoHeroi = new ArrayList<>();
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

    public ArrayList<TipoHeroi> getTipoHeroi() {
        return tipoHeroi;
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

        int option;
        int num;

            do {
                int i = 0;
                System.out.println("-----------------------------------------------------------------------------------------------------------------");
                System.out.println("Queres usar alguma poção?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                num = input.nextInt();

                if (num == 1 && !this.getPocoes().isEmpty()) {

                    System.out.println("-----------------------------------------------------------------------------------------------------------------");
                    System.out.println("Tens as seguintes poções:");
                    for (PocaoHP pocao : this.getPocoes()) {
                        System.out.println("-----------------------------------------------------------------------------------------------------------------");
                        System.out.println("ID " + i + " - " + pocao.getNome());
                        System.out.println("Vida da poção: " + pocao.getCura() + " HP");
                        i++;
                    }

                    System.out.println("-----------------------------------------------------------------------------------------------------------------");
                    System.out.println("Que poção queres utilizar? Insere o nº de ID:");
                    option = input.nextInt();

                    System.out.println("Usaste a poção " + getPocoes().get(option).getNome() + " que te curou " + getPocoes().get(option).getCura() + " HP.");
                    this.setHp(this.getHp() + getPocoes().get(option).getCura());
                    System.out.println(this.getNome() + " tem agora " + this.getHp() + " de vida");
                    System.out.println("-----------------------------------------------------------------------------------------------------------------");
                    getPocoes().remove(option);
                }
                if (num == 1 && this.getPocoes().isEmpty()) {
                    System.out.println("-------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Não tem poções para utilizar! Pode seguir viagem!");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------");
                }

                if (num == 2) {
                    System.out.println("-------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Não usaste nenhuma poção. Podes seguir viagem!");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------");
                }
            } while (num == 1);
    }

}
