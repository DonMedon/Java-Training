package Ex5;

public class Pessoa {

    private String nome, email, telemovel;
    private int idade;

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelemovel() {
        return telemovel;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelemovel(String telemovel) {
        this.telemovel = telemovel;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa(String nome, String email, String telemovel, int idade) {
        this.nome = nome;
        this.email = email;
        this.telemovel = telemovel;
        this.idade = idade;

    }
}
