package Ex5;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Bernardo Medon","bmb@gmail.com", "912345667", 26);
        Pessoa pessoa2 = new Pessoa("Angelo Ramos","ar@gmail.com", "912346567", 42);
        Pessoa pessoa3 = new Pessoa("Vitor Santos", "vs@gmail.com", "987657654", 23);
        Pessoa pessoa4 = new Pessoa("Joao Nogueira", "jn@gmail.com", "963546533", 38);

        ArrayList<Pessoa> contactos = new ArrayList<Pessoa>();
        contactos.add(pessoa1);
        contactos.add(pessoa2);
        contactos.add(pessoa3);

        Agenda aMinhaAgenda = new Agenda(contactos);
        aMinhaAgenda.addPessoas(pessoa4);

        aMinhaAgenda.exibirDetalhes();
    }
}
