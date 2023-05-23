package Ex6;

import Ex1.Carro;
import Ex5.Pessoa;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Atleta atleta1 = new Atleta("Lebron James", "Baquetebol", "USA", 2.06, 107.5);
        Atleta atleta2 = new Atleta("Tiger Woods", "Golf", "USA", 1.82, 78.5);
        Atleta atleta3 = new Atleta("Cristiano Ronaldo", "Futebol", "Portugal", 1.87, 82.0);
        Atleta atleta4 = new Atleta("Roger Federer", "Ténis", "Suiça", 1.85, 77.1);

        ArrayList<Atleta> jogadores = new ArrayList<Atleta>();
        jogadores.add(atleta1);
        jogadores.add(atleta2);
        jogadores.add(atleta3);

        ArrayList<Competicao> torneios = new ArrayList<Competicao>();

        Competicao competicao1 = new Competicao(jogadores, "GOAT Championship", "China", torneios);
        Competicao competicao2 = new Competicao(jogadores, "Levantamento do copo", "Cuba", torneios);
        Competicao competicao3 = new Competicao(jogadores, "110 metros barreiras", "Viana do Castelo", torneios);
        competicao1.addCompeticao(competicao2);


        competicao3.addAtletas(atleta2);

        System.out.println("----------------------------------------");
        System.out.println("Vai ter inicio a GOAT Championship...");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Vai dar início a primeira 1/2 final!!!  --->  O sorteio ditou:");
        System.out.println("------------------------------------------------------------------");
        System.out.println(atleta1.getNome() + " VS " + atleta3.getNome());
        System.out.println("----------------------------------------");
        System.out.println("O jogo está a decorrer...");
        System.out.println("----------------------------------------");
        System.out.println("O jogador mais alto será o vencedor!");

        Atleta vencedor1=atleta1.torneio(atleta3);
        if (vencedor1 == null) {
            System.out.println("Empataram!!");
        }else{
            System.out.println("O vencedor foi: " + vencedor1.getNome());
        }

        System.out.println("----------------------------------------");
        System.out.println("Vai dar início a segunda 1/2 final!!!  --->  O sorteio ditou:");
        System.out.println("------------------------------------------------------------------");
        System.out.println(atleta2.getNome() + " VS " + atleta4.getNome());
        System.out.println("----------------------------------------");
        System.out.println("O jogo está a decorrer...");
        System.out.println("----------------------------------------");
        System.out.println("O jogador mais alto será o vencedor!");
        System.out.println("----------------------------------------");

        Atleta vencedor2=atleta2.torneio(atleta4);
        if (vencedor2 == null) {
            System.out.println("Empataram!!");
        }else{
            System.out.println("O vencedor foi: " + vencedor2.getNome());
        }

        System.out.println("----------------------------------------");
        System.out.println("Vai dar início a grande final!!!");
        System.out.println("------------------------------------------------------------------");
        System.out.println(vencedor1.getNome() + " VS " + vencedor2.getNome());
        System.out.println("----------------------------------------");
        System.out.println("O jogo está a decorrer...");
        System.out.println("----------------------------------------");
        System.out.println("O jogador mais alto será o vencedor!");
        System.out.println("----------------------------------------");

        Atleta vencedor3=vencedor1.torneio(vencedor2);
        if (vencedor3 == null) {
            System.out.println("Empataram!!");
        }else{
            System.out.println("O vencedor foi: " + vencedor3.getNome());
        }



    }
}
