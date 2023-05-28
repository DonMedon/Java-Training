package Entidades;

public class NPC extends Entidade {

    public NPC(String nome, int hp, int forca) {
        super(nome, hp, forca);
    }
    public void mostrarDetalhes() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("HP: " + this.getHp());
        System.out.println("Força: " + this.getForca());
    }
}
