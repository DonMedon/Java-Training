package Jogo;

import Entidades.*;
import Itens.Arma;
import Itens.PocaoHP;
import Itens.TipoHeroi;

import java.util.ArrayList;
import java.util.Scanner;

public class Jogo {

    public static Heroi criacaoHeroi() {

        Heroi heroi = null;

        ArrayList<TipoHeroi> permissaoGeral = new ArrayList<>();
        permissaoGeral.add(TipoHeroi.CAVALEIRO);
        permissaoGeral.add(TipoHeroi.ARQUEIRO);
        permissaoGeral.add(TipoHeroi.FEITICEIRO);

        ArrayList<PocaoHP> pocoes = new ArrayList<>();
        PocaoHP pocao0 = new PocaoHP("Sem poção", 0, permissaoGeral, 0);
        pocoes.add(pocao0);

        Arma arma0 = new Arma("Sem arma", 0, permissaoGeral, 0);

        Scanner input = new Scanner(System.in);
        int option;
        int num;

        do {
            do {
                System.out.println("------------------------------------------------------------------------------------------------------");
                System.out.println("Qual o herói que deseja utilizar?");
                System.out.println();
                System.out.println("1 - Cavaleiro\n2 - Arqueiro\n3 - Feiticeiro\n4 - Sair");
                System.out.println("------------------------------------------------------------------------------------------------------");

                option = input.nextInt();

                if (option < 1 || option > 4) {
                    System.out.println("Escolha uma opção válida");
                }

            } while (option < 1 || option > 4) ;

            switch (option) {

                case 1:

                    System.out.println("---------------------------------------------------------------------------------------------------");
                    System.out.println("Escolheu jogar com um Cavaleiro.");
                    System.out.println("Escolha a dificuldade do jogo: ");
                    System.out.println("1. Fácil\n2. Dificil\n3. Sair");
                    num = input.nextInt();

                    if (num == 1) {

                        heroi = new Cavaleiro("Pegasus", 0, 0, 0, 0);
                        System.out.println("Escolheu o modo fácil. Foram-lhe atribbuidos 300 pontos de criação de personagem e 20 moedas de ouro");
                        heroi.setHp(4200);
                        heroi.setForca(250);
                        heroi.setOuro(20);
                        heroi.setArma(arma0);
                        heroi.setPocoes(pocoes);
                        System.out.println("Aqui está o seu herói: ");
                        heroi.mostrarDetalhes();

                    } else if (num == 2) {

                        heroi = new Cavaleiro("Pegasus", 0, 0, 0, 0);
                        System.out.println("Escolheu o modo difícil. Foram-lhe atribbuidos 220 pontos de criação de personagem e 10 moedas de ouro");
                        heroi.setHp(4200);
                        heroi.setForca(250);
                        heroi.setOuro(15);
                        heroi.setArma(arma0);
                        heroi.setPocoes(pocoes);
                        System.out.println("Aqui está o seu herói: ");
                        heroi.mostrarDetalhes();

                    } else if (num == 3) {
                        System.out.println("Você saiu do jogo");

                    } break;

                case 2:

                    System.out.println("------------------------------------------------------------");
                    System.out.println("Escolheu jogar com um Cavaleiro.");
                    System.out.println("Escolha a dificuldade do jogo: ");
                    System.out.println("1. Fácil\n2. Dificil\n3. Sair");
                    num = input.nextInt();

                    if (num == 1) {

                        heroi = new Arqueiro("Archer", 0, 0, 0, 0);
                        System.out.println("Escolheu o modo fácil. Foram-lhe atribbuidos 300 pontos de criação de personagem e 20 moedas de ouro");
                        heroi.setHp(3100);
                        heroi.setForca(350);
                        heroi.setOuro(20);
                        heroi.setArma(arma0);
                        heroi.setPocoes(pocoes);
                        System.out.println("Aqui está o seu herói: ");
                        heroi.mostrarDetalhes();

                    } else if (num == 2) {

                        heroi = new Arqueiro("Archer", 0, 0, 0, 0);
                        System.out.println("Escolheu o modo difícil. Foram-lhe atribbuidos 220 pontos de criação de personagem e 15 moedas de ouro");
                        heroi.setHp(3100);
                        heroi.setForca(350);
                        heroi.setOuro(15);
                        heroi.setArma(arma0);
                        heroi.setPocoes(pocoes);
                        System.out.println("Aqui está o seu herói: ");
                        heroi.mostrarDetalhes();

                    } else if (num == 3) {
                        System.out.println("Você saiu do jogo");

                    } break;

                case 3:

                    System.out.println("------------------------------------------------------------");
                    System.out.println("Escolheu jogar com um Cavaleiro.");
                    System.out.println("Escolha a dificuldade do jogo: ");
                    System.out.println("1. Fácil\n2. Dificil\n3. Sair");
                    num = input.nextInt();

                    if (num == 1) {

                        heroi = new Feiticeiro("Veigar", 0, 0, 0, 0);
                        System.out.println("Escolheu o modo fácil. Foram-lhe atribbuidos 300 pontos de criação de personagem e 20 moedas de ouro");
                        heroi.setHp(2800);
                        heroi.setForca(400);
                        heroi.setOuro(20);
                        heroi.setArma(arma0);
                        heroi.setPocoes(pocoes);
                        System.out.println("Aqui está o seu herói: ");
                        heroi.mostrarDetalhes();

                    } else if (num == 2) {

                        heroi = new Feiticeiro("Veigar", 0, 0, 0, 0);
                        System.out.println("Escolheu o modo difícil. Foram-lhe atribbuidos 220 pontos de criação de personagem e 15 moedas de ouro");
                        heroi.setHp(2800);
                        heroi.setForca(390);
                        heroi.setOuro(15);
                        heroi.setArma(arma0);
                        heroi.setPocoes(pocoes);
                        System.out.println("Aqui está o seu herói: ");
                        heroi.mostrarDetalhes();

                    } else if (num == 3) {
                        System.out.println("Você saiu do jogo");

                    } break;
            }

        } while (option != 4);
        System.out.println("Você saiu do jogo.");

        return heroi;

    }

    public static void labirinto() {

        NPC npc = new NPC("BOT", 3000, 150);
        Heroi heroi = criacaoHeroi();
        heroi.atacar(npc);


    }

    public static void main(String[] args) {

        System.out.println("------------------------------------|");
        System.out.println("Bem-vindo ao LABIRINTO DA MORTE!    |");
        System.out.println("Que comece a aventura!              |");
        System.out.println("------------------------------------|");
        labirinto();

    }
}
