package Entidades;

import Itens.Arma;
import Itens.PocaoHP;

import java.util.ArrayList;

public class Feiticeiro extends Heroi {

    public Feiticeiro(String nome, int hp, int forca, int nivel, int ouro) {
        super(nome, hp, forca, nivel, ouro);
    }

    @Override
    public void atacar(NPC vilao) {
        while((vilao.getHp() > 0 && this.getHp() > 0)) {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("O herói " + this.getNome() + " ataca!");
            vilao.setHp((vilao.getHp()) - (this.getForca() + getArma().getDano()));

            if (vilao.getHp() > 0) {
                System.out.println("O vilão " + vilao.getNome() + " ficou com " + vilao.getHp() + " de vida.");
                System.out.println("O vilão " + vilao.getNome() + " ataca!");
                this.setHp((this.getHp() - (vilao.getForca())));

                if (this.getHp() > 0) {
                    System.out.println("O herói " + this.getNome() + " tem agora " + this.getHp() + " de vida.");
                    System.out.println("-----------------------------------------------------------------------------");
                } else {
                    System.out.println("O herói " + this.getNome() + " ficou sem vida.");
                    System.out.println("-----------------------------------------------------------------------------");
                }
            } else {
                System.out.println("O vilão " + vilao.getNome() + " ficou sem vida.");
                System.out.println("-----------------------------------------------------------------------------");
            }
        }
        if (this.getHp() > 0) {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("O herói " + this.getNome() + " venceu a batalha!");
            setNivel(this.getNivel() + 1);
            System.out.println("Subiu para nível " + this.getNivel());
            setHp(this.getHp() + 10);
            System.out.println("Aumentou 10 pontos de vida e passou a ter " + this.getHp() + " de HP.");
            setForca(this.getForca() + 1);
            System.out.println("Aumentou 1 ponto de força e passou a ter " + this.getForca() + " de força.");
            setOuro(this.getOuro() + 10);
            System.out.println("Aumentou 10 moedas de ouro ao seu saldo e passou a ter " + this.getOuro() + " de ouro.");
            System.out.println("-----------------------------------------------------------------------------");
        } else {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("O herói " + this.getNome() + " perdeu!");
            System.out.println("Venceu o vilão " + vilao.getNome() + "!");
            System.out.println("-----------------------------------------------------------------------------");
        }
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Nome: " + getNome());
        System.out.println("HP: " + getHp());
        System.out.println("Força " + getForca());
        System.out.println("Nível: " + getNivel());
        System.out.println("Ouro: " + getOuro());
        if (this.getArma() == null) {
            System.out.println("Arma: Não possui arma.");
        } else {
            System.out.println("Arma: " + getArma().getNome());
        }
        for(PocaoHP pocoes : this.getPocoes()) {
            System.out.println("Poções: " + pocoes.getNome());
        }
        System.out.println("------------------------------------------------------------------------------");
    }
}



