package Entidades;

import Itens.Arma;
import Itens.PocaoHP;

import java.util.ArrayList;

public class Cavaleiro extends Heroi {

    public Cavaleiro(String nome, int hp, int forca, int nivel, int ouro) {
        super(nome, hp, forca, nivel, ouro);
    }
    @Override
    public void atacar(NPC vilao) {
        while ((vilao.getHp() > 0 && this.getHp() > 0)) {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("O vilão " + vilao.getNome() + " ataca!");
            setHp((int) (this.getHp() - (vilao.getForca() * 0.8)));

            if (this.getHp() > 0) {
                System.out.println(this.getNome() + " ficou com " + this.getHp() + " de vida.");
                System.out.println(this.getNome() + " ataca!");
                if (this.getArma() == null) {
                    vilao.setHp((vilao.getHp() - (this.getForca())));
                } else {
                    vilao.setHp((vilao.getHp()) - (this.getForca() + getArma().getDano()));
                }

                if (vilao.getHp() > 0) {
                    System.out.println("O vilão " + vilao.getNome() + " tem agora " + vilao.getHp() + " de vida.");
                    System.out.println("-----------------------------------------------------------------------------");
                } else {
                    System.out.println("O vilão " + vilao.getNome() + " ficou sem vida.");
                    System.out.println("-----------------------------------------------------------------------------");
                }
            } else {
                System.out.println(this.getNome() + " ficou sem vida.");
                System.out.println("-----------------------------------------------------------------------------");
            }
        }
        if (this.getHp() > 0) {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println(this.getNome() + " VENCEU A BATALHA!");
            System.out.println("-----------------------------------------------------------------------------");
            setNivel(this.getNivel() + 1);
            System.out.println("Subiste para nível " + this.getNivel());
            setForca(this.getForca() + 1);
            System.out.println("Aumentaste 1 ponto de força e passaste a ter " + this.getForca() + " de força.");
            setOuro(this.getOuro() + 10);
            System.out.println("Aumentaste 10 moedas de ouro ao teu saldo e passaste a ter " + this.getOuro() + " de ouro.");
            System.out.println("-----------------------------------------------------------------------------");
        } else {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println(this.getNome() + " perdeu.");
            System.out.println("O vilão " + vilao.getNome() + " venceu!");
            System.out.println("-----------------------------------------------------------------------------");
        }
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Nome: " + getNome());
        System.out.println("HP: " + getHp());
        System.out.println("Força " + getForca());
        System.out.println("Nível: " + getNivel());
        System.out.println("Ouro: " + getOuro());
        if (this.getArma() == null) {
            System.out.println("Arma: Não tens arma.");
        } else {
            System.out.println("Arma: " + getArma().getNome());
        }
        if (this.getPocoes() == null) {
            System.out.println("Poções: Não tens poções.");
        } else {
            for(PocaoHP pocoes : this.getPocoes()) {
                System.out.println("Poções: " + pocoes.getNome());
            }
            System.out.println("---------------------------------------------------------------------------------");
        }

    }
}
