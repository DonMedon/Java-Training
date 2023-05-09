package Ex5;

import org.w3c.dom.ls.LSOutput;

import java.io.PrintStream;
import java.util.ArrayList;

public class Agenda {
    ArrayList<Pessoa> pessoas;
    Pessoa nome;
    Pessoa idade;
    public Agenda(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
    public void addPessoas(Pessoa pessoaNova) {
        this.pessoas.add(pessoaNova);
    }
    public void exibirDetalhes() {
        System.out.println("Nome: ");
        System.out.println(this.nome);
        System.out.println("Idade: ");
        System.out.println(this.idade);
    }

}