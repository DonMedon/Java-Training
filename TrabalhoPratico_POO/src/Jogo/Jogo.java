package Jogo;

import Entidades.*;
import Itens.Arma;
import Itens.PocaoHP;

import java.util.ArrayList;
import java.util.Scanner;

public class Jogo {

    public static Heroi criacao() {

        Heroi heroi;

    }

    public static void escolherDificuldade() {

        Scanner input = new Scanner(System.in);
        int option;
        int points = 0;

        ArrayList<PocaoHP> pocoes = new ArrayList<>();
        ArrayList<Heroi> herois = new ArrayList<>();
        Arma arma1 = new Arma("Espada Mágica", 320, herois, 240);
        Cavaleiro cavaleiro1 = new Cavaleiro("Hecarim", 4000, 120, 0, 0, arma1, pocoes);
        Feiticeiro feiticeiro1 = new Feiticeiro("Barley", 2800, 340, 0, 0, arma1, pocoes);
        Arqueiro arqueiro1 = new Arqueiro("Varus", 3000, 300, 0, 0, arma1, pocoes);

        do {
            do {
                System.out.println("---------------------------------------------------------------");
                System.out.println("Escolha a dificuldade que quer jogar!");
                System.out.println();
                System.out.println("Escreva 1 para jogar o modo fácil.");
                System.out.println("Escreva 2 para jogar o modo difícil.");
                System.out.println("Escreva 3 para sair.");

                option = input.nextInt();

            } while (option < 1 || option > 4);

                    switch (option) {

                        case 1:
                            if (option == 1) {
                                points = 300;
                                herois.get(0).setOuro(20);
                                herois.get(1).setOuro(20);
                                herois.get(2).setOuro(20);

                                System.out.println("Escolheu o modo fácil. Foram-lhe atribbuidos 300 pontos de criação de personagem e 20 moedas de ouro");
                            labirinto();}
                        case 2:
                            if (option == 2) {
                                points = 220;
                                .get(0).setOuro(15);
                                herois.get(1).setOuro(15);
                                herois.get(2).setOuro(15);

                                System.out.println("Escolheu o modo difícil. Foram-lhe atribbuidos 220 pontos de criação de personagem e 15 moedas de ouro");
                            labirinto();}
                    }

        } while (option != 3);
    }

    public static void labirinto() {

        int points = 0;
        ArrayList<Heroi> herois = new ArrayList<>();
        ArrayList<PocaoHP> pocoes = new ArrayList<>();

        Arma arma1 = new Arma("Espada Mágica", 320, herois, 240);
        Arma arma2 = new Arma("Machado Viking", 350, herois, 250);
        Arma arma3 = new Arma("Martelo de Thor", 380, herois, 290);
        Arma arma4 = new Arma("Arco Medieval", 280, herois, 220);
        Arma arma5 = new Arma("Canhão de fogo", 300, herois, 220);

        Cavaleiro cavaleiro1 = new Cavaleiro("Hecarim", 4000, 120, 0, 0, arma1, pocoes);
       /* Cavaleiro cavaleiro2 = new Cavaleiro("Olaf", 4200, 100, 0, 500, arma2, pocoes);
        Cavaleiro cavaleiro3 = new Cavaleiro("Gragas", 5100, 90, 0, 500, arma3, pocoes);
        Cavaleiro cavaleiro4 = new Cavaleiro("Ashe", 2800, 310, 0, 500, arma4, pocoes);
        Cavaleiro cavaleiro5 = new Cavaleiro("Tristana", 3500, 290, 0, 500, arma5, pocoes); */

        Feiticeiro feiticeiro1 = new Feiticeiro("Barley", 2800, 340, 0, 0, arma1, pocoes);
       /* Feiticeiro feiticeiro2 = new Feiticeiro("Ahri", 2900, 320, 0, 500, arma2, pocoes);
        Feiticeiro feiticeiro3 = new Feiticeiro("Syndra", 3100, 300, 0, 500, arma3, pocoes);
        Feiticeiro feiticeiro4 = new Feiticeiro("Dynamike", 2900, 315, 0, 500, arma4, pocoes);
        Feiticeiro feiticeiro5 = new Feiticeiro("Veigar", 2800, 360, 0, 500, arma5, pocoes); */

        Arqueiro arqueiro1 = new Arqueiro("Varus", 3000, 300, 0, 0, arma1, pocoes);

        herois.add(cavaleiro1);
        herois.add(feiticeiro1);
        herois.add(arqueiro1);

        NPC npc1 = new NPC("BOT1", 2000, 140);
        NPC npc2 = new NPC("BOT2", 4000, 500);
        NPC npc3 = new NPC("BOT3", 2200, 120);
        NPC npc4 = new NPC("BOT4", 2300, 110);
        NPC npc5 = new NPC("BOT5", 2400, 100);

        Scanner input = new Scanner(System.in);
        int option;

        do {
            do {
                System.out.println("------------------------------------------------------------------------------------------------------");
                System.out.println("Qual o tipo de herói que deseja utilizar?");
                System.out.println();
                System.out.println("Escreva 1 se quiser escolher um Cavaleiro.");
                System.out.println("Escreva 2 se quiser escolher um Feiticeiro.");
                System.out.println("Escreva 3 se quiser escolher um Arqueiro.");
                System.out.println("Escreva 4 se quiser sair.");
                System.out.println("------------------------------------------------------------------------------------------------------");

                option = input.nextInt();

            } while (option < 1 || option > 3) ;

                    switch (option) {

                        case 1: escolherDificuldade();

                        case 2: escolherDificuldade();

                        case 3: escolherDificuldade();

                    }

        } while (option != 4);
            System.out.println("Você saiu do jogo");
    }

    public static void main(String[] args) {

        labirinto();

    }
}
