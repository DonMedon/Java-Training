package Jogo;

import Entidades.*;
import Itens.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Jogo {

    static Scanner input = new Scanner(System.in);
    public static Heroi criacaoHeroi() {

        Heroi heroi = null;

        ArrayList<TipoHeroi> permissaoGeral = new ArrayList<>();
        permissaoGeral.add(TipoHeroi.CAVALEIRO);
        permissaoGeral.add(TipoHeroi.ARQUEIRO);
        permissaoGeral.add(TipoHeroi.FEITICEIRO);

        /* ArrayList<PocaoHP> pocoes = new ArrayList<>();
        PocaoHP pocao0 = new PocaoHP("Sem poção", 0, permissaoGeral, 0);
        pocoes.add(pocao0);

        Arma arma0 = new Arma("Sem arma", 0, permissaoGeral, 0); */

        Scanner input = new Scanner(System.in);
        int option;
        int num;


            do {
                System.out.println("------------------------------------------------------------------------------------------------------");
                System.out.println("Qual o herói que deseja utilizar?");
                System.out.println();
                System.out.println("1 - Cavaleiro\n2 - Arqueiro\n3 - Feiticeiro");
                System.out.println("------------------------------------------------------------------------------------------------------");

                option = input.nextInt();

                if (option < 1 || option > 4) {
                    System.out.println("Escolha uma opção válida");
                }

            } while (option < 1 || option > 3) ;

            switch (option) {

                case 1:

                    System.out.println("---------------------------------------------------------------------------------------------------");
                    System.out.println("Escolheu jogar com um Cavaleiro.");
                    System.out.println("Escolha a dificuldade do jogo: ");
                    System.out.println("1. Fácil\n2. Dificil");
                    num = input.nextInt();

                    if (num == 1) {

                        heroi = new Cavaleiro("Pegasus", 0, 0, 0, 0);
                        System.out.println("Escolheu o modo fácil. Foram-lhe atribbuidos 300 pontos de criação de personagem e 20 moedas de ouro");
                        heroi.setHp(4200);
                        heroi.setForca(250);
                        heroi.setOuro(20);
                        /*heroi.setArma(arma0);
                        heroi.setPocoes(pocoes); */
                        System.out.println("Aqui está o seu herói: ");
                        heroi.mostrarDetalhes();

                    } else if (num == 2) {

                        heroi = new Cavaleiro("Pegasus", 0, 0, 0, 0);
                        System.out.println("Escolheu o modo difícil. Foram-lhe atribbuidos 220 pontos de criação de personagem e 10 moedas de ouro");
                        heroi.setHp(4200);
                        heroi.setForca(250);
                        heroi.setOuro(15);
                       /*heroi.setArma(arma0);
                        heroi.setPocoes(pocoes);*/
                        System.out.println("Aqui está o seu herói: ");
                        heroi.mostrarDetalhes();

                    } break;

                case 2:

                    System.out.println("------------------------------------------------------------");
                    System.out.println("Escolheu jogar com um Cavaleiro.");
                    System.out.println("Escolha a dificuldade do jogo: ");
                    System.out.println("1. Fácil\n2. Dificil");
                    num = input.nextInt();

                    if (num == 1) {

                        heroi = new Arqueiro("Archer", 0, 0, 0, 0);
                        System.out.println("Escolheu o modo fácil. Foram-lhe atribbuidos 300 pontos de criação de personagem e 20 moedas de ouro");
                        heroi.setHp(3100);
                        heroi.setForca(350);
                        heroi.setOuro(20);
                        /* heroi.setArma(arma0);
                        heroi.setPocoes(pocoes); */
                        System.out.println("Aqui está o seu herói: ");
                        heroi.mostrarDetalhes();

                    } else if (num == 2) {

                        heroi = new Arqueiro("Archer", 0, 0, 0, 0);
                        System.out.println("Escolheu o modo difícil. Foram-lhe atribbuidos 220 pontos de criação de personagem e 15 moedas de ouro");
                        heroi.setHp(3100);
                        heroi.setForca(350);
                        heroi.setOuro(15);
                       /* heroi.setArma(arma0);
                        heroi.setPocoes(pocoes); */
                        System.out.println("Aqui está o seu herói: ");
                        heroi.mostrarDetalhes();
                    } break;

                case 3:

                    System.out.println("------------------------------------------------------------");
                    System.out.println("Escolheu jogar com um Cavaleiro.");
                    System.out.println("Escolha a dificuldade do jogo: ");
                    System.out.println("1. Fácil\n2. Dificil");
                    num = input.nextInt();

                    if (num == 1) {

                        heroi = new Feiticeiro("Veigar", 0, 0, 0, 0);
                        System.out.println("Escolheu o modo fácil. Foram-lhe atribbuidos 300 pontos de criação de personagem e 20 moedas de ouro");
                        heroi.setHp(2800);
                        heroi.setForca(400);
                        heroi.setOuro(20);
                        /* heroi.setArma(arma0);
                        heroi.setPocoes(pocoes); */
                        System.out.println("Aqui está o seu herói: ");
                        heroi.mostrarDetalhes();

                    } else if (num == 2) {

                        heroi = new Feiticeiro("Veigar", 0, 0, 0, 0);
                        System.out.println("Escolheu o modo difícil. Foram-lhe atribbuidos 220 pontos de criação de personagem e 15 moedas de ouro");
                        heroi.setHp(2800);
                        heroi.setForca(390);
                        heroi.setOuro(15);
                        /* heroi.setArma(arma0);
                        heroi.setPocoes(pocoes); */
                        System.out.println("Aqui está o seu herói: ");
                        heroi.mostrarDetalhes();
                    } break;
            }



        return heroi;
    }

    public static Vendedor trafico(){

        ArrayList<TipoHeroi> permissaoGeral = new ArrayList<>();
        permissaoGeral.add(TipoHeroi.CAVALEIRO);
        permissaoGeral.add(TipoHeroi.ARQUEIRO);
        permissaoGeral.add(TipoHeroi.FEITICEIRO);

        ArrayList<TipoHeroi> permissaoC = new ArrayList<>();
        permissaoC.add(TipoHeroi.CAVALEIRO);

        ArrayList<TipoHeroi> permissaoA = new ArrayList<>();
        permissaoA.add(TipoHeroi.ARQUEIRO);

        ArrayList<TipoHeroi> permissaoF = new ArrayList<>();
        permissaoF.add(TipoHeroi.FEITICEIRO);

        ArrayList<TipoHeroi> permissaoCA = new ArrayList<>();
        permissaoCA.add(TipoHeroi.CAVALEIRO);
        permissaoCA.add(TipoHeroi.ARQUEIRO);

        Arma espada = new Arma("Espada", 14, permissaoC, 5);
        Arma machado = new Arma("Machado", 13, permissaoC, 4);
        Arma foice = new Arma("Nunchaku", 12, permissaoCA, 3);
        Arma arco = new Arma("Arco", 11, permissaoA, 5);
        Arma fisga = new Arma("Fisga", 10, permissaoA, 3);
        Arma besta = new Arma("Besta", 9,permissaoCA, 4 );
        Arma cuboMagico = new Arma("Cubo", 8, permissaoF, 4);
        Arma estrelaMagica = new Arma("Estrela", 7, permissaoF, 5);
        Arma fosforosMagicos = new Arma("Fósforos", 6, permissaoF, 3);

        PocaoHP carlsberg = new PocaoHP("Carlsberg", 5, permissaoGeral, 25);
        PocaoHP stout = new PocaoHP("Stout", 4, permissaoGeral,12 );
        PocaoHP budweiser = new PocaoHP("Budweiser", 3, permissaoGeral, 15);
        PocaoHP sb = new PocaoHP("SuperBock", 2, permissaoGeral, 20);

        ArrayList<ItemHeroi> stockVendedor = new ArrayList<>();
        stockVendedor.add(sb);
        stockVendedor.add(stout);
        stockVendedor.add(budweiser);
        stockVendedor.add(espada);
        stockVendedor.add(foice);
        stockVendedor.add(machado);
        stockVendedor.add(arco);
        stockVendedor.add(fisga);
        stockVendedor.add(besta);
        stockVendedor.add(cuboMagico);
        stockVendedor.add(estrelaMagica);
        stockVendedor.add(fosforosMagicos);
        stockVendedor.add(carlsberg);

        return new Vendedor(stockVendedor);
    }
    public static void sala1(Heroi heroi) {

        int option;
        System.out.println("Entrou no Vale dos Mortos! Aqui vai ter de atravessar o vale sem acordar os cadáveres.");
        System.out.println("Vais devagar ou a correr?");
        System.out.println("1 - Devagar");
        System.out.println("2 - Correr");
        option = input.nextInt();
        if (option == 1) {
            heroi.setHp(heroi.getHp() - 20);
            System.out.println("Boa! Só acordou dois cadávares ao atravessar. Perdeu 10 de HP por cada cadáver.");
            System.out.println("O seu herói tem agora " + heroi.getHp() + " de vida");
        } else if (option == 2) {
            heroi.setHp(heroi.getHp() - 50);
            System.out.println("Vá lá! Menos mal! Conseguiu sobreviver apesar de ter acordado 5 cadávares. Perdeu 50 HP.");
            System.out.println("O seu herói tem agora " + heroi.getHp() + " de vida");
        }
        heroi.usarPocao();
    }
    public static void sala2() {

    }

    public static boolean labirinto() {

        NPC npc = new NPC("BOT", 3000, 150);

        Heroi heroi = criacaoHeroi();

        Vendedor vendedor = trafico();
        System.out.println("BEM-VINDO À LOJA ONDE PODE COMPRAR OS SEUS ITEMS");
        System.out.println("LISTA DE ITEMS:");
        System.out.println();
        vendedor.vender(heroi);
        System.out.println("-------------------------------------------------------------");

        System.out.println("-------------------------------------------------------------");
        heroi.mostrarDetalhes();

        System.out.println("Chegaste à primeira decisão de vida ou de morte.");
        System.out.println("Se fores para a opção 1, vais para o Vale dos Mortos");
        System.out.println("Se fores para a opção 2, vais para a Montanha das Virtudes");
        System.out.println("Que opção deseja escolher?");
        int option = input.nextInt();
        if (option == 1) {
            sala1(heroi);
        } else if (option == 2){
            sala2();
        }


        return true;
    }


    public static void main(String[] args) {

        System.out.println("------------------------------------|");
        System.out.println("Bem-vindo ao LABIRINTO DA MORTE!    |");
        System.out.println("Que comece a aventura!              |");
        System.out.println("------------------------------------|");

        if (labirinto()) {
            System.out.println("Parabéns! Ganhou o jogo!");
        } else {
            System.out.println("Game Over!");
        }

    }
}
