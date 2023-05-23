package Ex6;

public class Atleta {

    private String nome, modalidade, pais;
    private double altura, peso;

    public Atleta(String nome, String modalidade, String pais, double altura, double peso) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.pais = pais;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public String getModalidade() {
        return modalidade;
    }

    public String getPais() {
        return pais;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }


    public Atleta torneio(Atleta outroAtleta) {
        if (this.altura > outroAtleta.altura) {
            return this;
        } else if (this.altura < outroAtleta.altura) {
            return outroAtleta;
        }
        return null;
    }


}
