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
        for (int i = 0; i < pessoas.size() ; i++) {
            System.out.println("Nome: ");
            System.out.println(pessoas.get(i).getNome());
            System.out.println("Idade: ");
            System.out.println(pessoas.get(i).getIdade());
        }


    }

}