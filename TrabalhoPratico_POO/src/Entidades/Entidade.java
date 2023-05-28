package Entidades;

abstract public class Entidade {

    private String nome;
    private int hp, forca;

    public Entidade(String nome, int hp, int forca) {
        this.nome = nome;
        this.hp = hp;
        this.forca = forca;
    }
    public String getNome() {
        return nome;
    }
    public int getHp() {
        return hp;
    }
    public int getForca() {
        return forca;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    abstract public void mostrarDetalhes();
}

