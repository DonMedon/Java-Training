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
        int pontosHP;
        String nomeHeroi;

            do {
                System.out.println("-----------------------------------------------||");
                System.out.println("Que tipo de herói queres utilizar?");
                System.out.println();
                System.out.println("1 - Cavaleiro\n2 - Arqueiro\n3 - Feiticeiro");
                System.out.println("-----------------------------------------------||");
                System.out.println("R.: ");
                option = input.nextInt();
                System.out.println("-----------------------------------------------||");

                if (option < 1 || option > 3) {
                    System.out.println("Escolhe uma opção válida!");
                }

            } while (option < 1 || option > 3) ;

            switch (option) {

                case 1:

                    System.out.println("-------------------------------------------||");
                    System.out.println("Escolheste jogar com um Cavaleiro.");
                    System.out.println("Escolhe a dificuldade do jogo: ");
                    System.out.println("1. Fácil\n2. Dificil");
                    System.out.println("-------------------------------------------||");
                    System.out.println("R.: ");
                    num = input.nextInt();

                    if (num == 1) {

                        System.out.println("Escolheste o modo fácil. Recebeste 300 pontos de criação de personagem e 20 moedas de ouro");
                        System.out.println("Vamos começar por dar um nome ao teu Cavaleiro. Escreve um nome digno de um verdadeiro herói:");
                        nomeHeroi = input.next();
                        heroi = new Cavaleiro(nomeHeroi, 0, 0, 0, 0);
                        System.out.println("Excelente nome! Agora poderás distribuir os teus pontos entre vida do teu herói (HP) e força.");
                        System.out.println("Quanto de HP desejas atribuir ao teu herói? (Não te esqueças de distribuir bem os teus pontos entre vida e força. A estratégia é importante!)");
                        do {
                            pontosHP = input.nextInt();
                            if (pontosHP >= 0 && pontosHP <= 300) {
                                heroi.setHp(pontosHP);
                                heroi.setForca(300 - pontosHP);
                            } else {
                                System.out.println("Escolha um valor válido para o HP do herói. Máximo 300");
                            }
                        } while (pontosHP < 0 || pontosHP > 300);
                        heroi.setOuro(20);
                        /*heroi.setArma(arma0);
                        heroi.setPocoes(pocoes); */
                        System.out.println("Aqui está o teu herói: ");
                        heroi.mostrarDetalhes();

                    } else if (num == 2) {

                        System.out.println("Escolheste o modo difícil. Recebeste 220 pontos de criação de personagem e 10 moedas de ouro");
                        System.out.println("Vamos começar por dar um nome ao teu Cavaleiro. Escreve um nome digno de um verdadeiro herói:");
                        nomeHeroi = input.next();
                        heroi = new Cavaleiro(nomeHeroi, 0, 0, 0, 0);
                        System.out.println("Excelente nome! Agora poderás distribuir os teus pontos entre vida do teu herói (HP) e força.");
                        System.out.println("Quanto de HP desejas atribuir ao teu herói? (Não te esqueças de distribuir bem os teus pontos entre vida e força. A estratégia é importante!)");
                        do {
                            pontosHP = input.nextInt();
                            if (pontosHP >= 0 && pontosHP <= 220) {
                            heroi.setHp(pontosHP);
                            heroi.setForca(220 - pontosHP);
                            } else {
                            System.out.println("Escolha um valor válido para o HP do herói. Máximo 220");
                            }
                        } while (pontosHP < 0 || pontosHP > 220);
                        heroi.setOuro(15);
                       /*heroi.setArma(arma0);
                        heroi.setPocoes(pocoes);*/
                        System.out.println("Aqui está o teu herói: ");
                        heroi.mostrarDetalhes();

                    } break;

                case 2:

                    System.out.println("------------------------------------------------------------");
                    System.out.println("Escolheste jogar com um Arqueiro.");
                    System.out.println("Escolhe a dificuldade do jogo: ");
                    System.out.println("1. Fácil\n2. Dificil");
                    num = input.nextInt();

                    if (num == 1) {

                        System.out.println("Escolheste o modo fácil. Recebeste 300 pontos de criação de personagem e 20 moedas de ouro");
                        System.out.println("Vamos começar por dar um nome ao teu Arqueiro. Escreve um nome digno de um verdadeiro herói:");
                        nomeHeroi = input.next();
                        heroi = new Arqueiro(nomeHeroi, 0, 0, 0, 0);
                        System.out.println("Excelente nome! Agora poderás distribuir os teus pontos entre vida do teu herói (HP) e força.");
                        System.out.println("Quanto de HP desejas atribuir ao teu herói? (Não te esqueças de distribuir bem os teus pontos entre vida e força. A estratégia é importante!)");
                        do {
                            pontosHP = input.nextInt();
                            if (pontosHP >= 0 && pontosHP <= 300) {
                            heroi.setHp(pontosHP);
                            heroi.setForca(300 - pontosHP);
                            } else {
                            System.out.println("Escolha um valor válido para o HP do herói. Máximo 300");
                            }
                        } while (pontosHP < 0 || pontosHP > 300);
                        heroi.setOuro(20);
                        /* heroi.setArma(arma0);
                        heroi.setPocoes(pocoes); */
                        System.out.println("Aqui está o teu herói: ");
                        heroi.mostrarDetalhes();

                    } else if (num == 2) {

                        System.out.println("Escolheste o modo difícil. Recebeste 220 pontos de criação de personagem e 15 moedas de ouro");
                        System.out.println("Vamos começar por dar um nome ao teu Arqueiro. Escreve um nome digno de um verdadeiro herói:");
                        nomeHeroi = input.next();
                        heroi = new Arqueiro(nomeHeroi, 0, 0, 0, 0);
                        System.out.println("Excelente nome! Agora poderás distribuir os teus pontos entre vida do teu herói (HP) e força.");
                        System.out.println("Quanto de HP desejas atribuir ao teu herói? (Não te esqueças de distribuir bem os teus pontos entre vida e força. A estratégia é importante!)");
                        do {
                            pontosHP = input.nextInt();
                            if (pontosHP >= 0 && pontosHP <= 220) {
                            heroi.setHp(pontosHP);
                            heroi.setForca(220 - pontosHP);
                            } else {
                            System.out.println("Escolha um valor válido para o HP do herói. Máximo 220");
                            }
                        } while (pontosHP < 0 || pontosHP > 220);
                        heroi.setOuro(15);
                       /* heroi.setArma(arma0);
                        heroi.setPocoes(pocoes); */
                        System.out.println("Aqui está o teu herói: ");
                        heroi.mostrarDetalhes();
                    } break;

                case 3:

                    System.out.println("------------------------------------------------------------");
                    System.out.println("Escolheste jogar com um Feiticeiro.");
                    System.out.println("Escolhe a dificuldade do jogo: ");
                    System.out.println("1. Fácil\n2. Dificil");
                    num = input.nextInt();

                    if (num == 1) {

                        System.out.println("Escolheste o modo fácil. Recebeste 300 pontos de criação de personagem e 20 moedas de ouro");
                        System.out.println("Vamos começar por dar um nome ao teu Feiticeiro. Escreve um nome digno de um verdadeiro herói:");
                        nomeHeroi = input.next();
                        heroi = new Feiticeiro(nomeHeroi, 0, 0, 0, 0);
                        System.out.println("Excelente nome! Agora poderás distribuir os teus pontos entre vida do teu herói (HP) e força.");
                        System.out.println("Quanto de HP desejas atribuir ao teu herói? (Não te esqueças de distribuir bem os teus pontos entre vida e força. A estratégia é importante!)");
                        do {
                            pontosHP = input.nextInt();
                            if (pontosHP >= 0 && pontosHP <= 300) {
                            heroi.setHp(pontosHP);
                            heroi.setForca(300 - pontosHP);
                            } else {
                            System.out.println("Escolha um valor válido para o HP do herói. Máximo 300");
                            }
                        } while (pontosHP < 0 || pontosHP > 300);
                        heroi.setOuro(20);
                        /* heroi.setArma(arma0);
                        heroi.setPocoes(pocoes); */
                        System.out.println("Aqui está o teu herói: ");
                        heroi.mostrarDetalhes();

                    } else if (num == 2) {

                        System.out.println("Escolheste o modo difícil. Recebeste 220 pontos de criação de personagem e 15 moedas de ouro");
                        System.out.println("Vamos começar por dar um nome ao teu Feiticeiro. Escreve um nome digno de um verdadeiro herói:");
                        nomeHeroi = input.next();
                        heroi = new Feiticeiro(nomeHeroi, 0, 0, 0, 0);
                        System.out.println("Excelente nome! Agora poderás distribuir os teus pontos entre vida do teu herói (HP) e força.");
                        System.out.println("Quanto de HP queres atribuir ao teu herói? (Não te esqueças de distribuir bem os teus pontos entre vida e força. A estratégia é importante!)");
                        do {
                            pontosHP = input.nextInt();
                            if (pontosHP >= 0 && pontosHP <= 220) {
                            heroi.setHp(pontosHP);
                            heroi.setForca(220 - pontosHP);
                            } else {
                            System.out.println("Escolha um valor válido para o HP do herói. Máximo 220");
                            }
                        } while (pontosHP < 0 || pontosHP > 220);
                        heroi.setOuro(15);
                        /* heroi.setArma(arma0);
                        heroi.setPocoes(pocoes); */
                        System.out.println("Aqui está o teu herói: ");
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

        ArrayList<TipoHeroi> permissaoAF = new ArrayList<>();
        permissaoAF.add(TipoHeroi.FEITICEIRO);
        permissaoAF.add(TipoHeroi.ARQUEIRO);

        ArrayList<TipoHeroi> permissaoCF = new ArrayList<>();
        permissaoCF.add(TipoHeroi.FEITICEIRO);
        permissaoCF.add(TipoHeroi.CAVALEIRO);

        Arma espada = new Arma("Espada de Aço", 10, permissaoC, 8);
        Arma machado = new Arma("Machado Viking", 8, permissaoC, 5);
        Arma boom = new Arma("Boomerang Afiado", 7, permissaoCA, 4);
        Arma arco = new Arma("Arco Certeiro", 10, permissaoA, 5);
        Arma lanca = new Arma("Lança Pontiaguada", 10, permissaoCA, 8);
        Arma besta = new Arma("Besta Fatal", 9,permissaoA, 4 );
        Arma varinha = new Arma("Varinha Mágica", 10, permissaoF, 8);
        Arma corda = new Arma("Corda de Aço", 7, permissaoAF, 5);
        Arma granada = new Arma("Granada explosiva", 8, permissaoCF, 5);
        Arma fosforos = new Arma("Fósforos Especiais", 6, permissaoF, 4);

        PocaoHP carlsberg = new PocaoHP("Carlsberg", 5, permissaoGeral, 25);
        PocaoHP stout = new PocaoHP("Stout", 4, permissaoGeral,20 );
        PocaoHP budweiser = new PocaoHP("Budweiser", 3, permissaoGeral, 15);
        PocaoHP sb = new PocaoHP("SuperBock", 4, permissaoGeral, 20);

        ArrayList<ItemHeroi> stockVendedor = new ArrayList<>();
        stockVendedor.add(sb);
        stockVendedor.add(stout);
        stockVendedor.add(budweiser);
        stockVendedor.add(carlsberg);
        stockVendedor.add(espada);
        stockVendedor.add(boom);
        stockVendedor.add(machado);
        stockVendedor.add(arco);
        stockVendedor.add(lanca);
        stockVendedor.add(besta);
        stockVendedor.add(varinha);
        stockVendedor.add(corda);
        stockVendedor.add(fosforos);
        stockVendedor.add(granada);

        return new Vendedor(stockVendedor);
    }
    public static void sala1(Heroi heroi) {

        int option;
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.println("Entraste no Vale dos Mortos! Aqui vais ter de atravessar o vale sem acordar os zombies.");
        System.out.println("Vais com cautela para não acordar os zombies, ou vais a correr para atravessar o mais rápido possível?");
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.println("1 - Cautela");
        System.out.println("2 - Correr");
        option = input.nextInt();
        if (option == 1) {
            heroi.setHp(heroi.getHp() - 10);
            heroi.setNivel(heroi.getNivel() + 1);
            heroi.setOuro(heroi.getOuro() + 5);
            System.out.println("-------------------------------------------------------------------------------------------------------------");
            System.out.println("Boa! Só acordaste dois cadávares ao atravessar. Perdeste 5 de HP por cada zombie que acordaste.");
            System.out.println("O teu herói tem agora " + heroi.getHp() + " de vida");
            System.out.println("Subiste para nivel " + heroi.getNivel());
            System.out.println("Ganhaste 5 moedas de ouro. Tens agora " + heroi.getOuro() + " de ouro." );
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        } else if (option == 2) {
            heroi.setHp(heroi.getHp() - 25);
            heroi.setNivel(heroi.getNivel() + 1);
            heroi.setOuro(heroi.getOuro() + 10);
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Vá lá! Menos mal! Conseguiste sobreviver apesar de teres acordado 5 cadávares. Perdeste 5 de HP por cada zombie que acordaste.");
            System.out.println("O teu herói tem agora " + heroi.getHp() + " de vida");
            System.out.println("Subiste para nivel " + heroi.getNivel());
            System.out.println("Ganhaste 10 moedas de ouro. Tens agora " + heroi.getOuro() + " de ouro." );
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        }
        heroi.usarPocao();
    }
    public static void sala1_1(Heroi heroi) {

        NPC npc = new NPC("Crocodilo", 80, 20);
        int option;

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Passaste o Vale dos Mortos com sucesso! Mas logo a seguir enfrentas um gigante rio que vais ter de atravessar que está cheio de crocodilos!");
        System.out.println();
        System.out.println("Só há uma maneira de atravessar o rio!");
        System.out.println("É enfrentares os crocodilos com os teus poderes e armas e matá-los a todos.");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Que sorte! Encontraste um vendedor de items ao pé da margem do rio. Poderás reforçar o teu inventário antes de atravessar.");
        System.out.println("Surgiu uma nova solução! Podes pagar 12 de ouro ao vendedor para te emprestar a sua jangada e atravessares o rio.");
        System.out.println();
        System.out.println("Que decisão vais tomar? Pensa bem!");
        System.out.println();
        System.out.println("Decisão 1");
        System.out.println("Decisão 2");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
        option = input.nextInt();
        if (option == 1) {
            trafico().vender(heroi);
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Preparado para lutar? Let's goooo!");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
            heroi.atacar(npc);
            heroi.usarPocao();
        }
        if (option == 2) {
            if (heroi.getOuro() >= 15) {
                heroi.setOuro(heroi.getOuro() - 12);
                heroi.setHp(heroi.getHp() - 10);
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Boa! Conseguiste atravessar. Ainda assim foste mordido por um crocodilo e perdeste 10 de vida");
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
                heroi.usarPocao();
            } else {
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Não tens dinheiro para pagar ao vendedor para te emprestar a jangada. Vais ter que lutar com os crocodilos.");
                trafico().vender(heroi);
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Preparado para lutar? Let's goooo!");
                heroi.atacar(npc);
                heroi.usarPocao();
            }
        }
    }
    public static void sala1_2(Heroi heroi) {

        NPC npc = new NPC("Zombies", 100, 40);

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Uffff!! Estava a ver que não te savafas dos crocdilos!");
        System.out.println("Boas noticias! Vê-se uma luz ao fundo do túnel!");
        System.out.println("Avista-se a quilómetros uma civilização que não está afetada pela praga.");
        System.out.println("Mas antes de lá chegar primeiro é preciso eliminar todos os zombies que andam a circundar a vila.");
        System.out.println("Á CARGA!!!");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
        heroi.atacar(npc);

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");

    }
    public static void sala2(Heroi heroi) {

        NPC npc = new NPC("Ursinho da Montanha", 80, 20);
        int option;
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Chegaste à Montanha das Virtudes! Esta montanha está cheia de ursinhos fofinhos que te vão encantar para ires ter com eles! Mas cuidado...");
        System.out.println("Estás a meio do caminho... Ouve-se um barulho! O que será?");
        System.out.println("É um urso fofinho! Mas ele de repente transforma-se num urso zombie muito malvado!");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
        heroi.atacar(npc);

        heroi.usarPocao();
    }
    public static void sala2_1(Heroi heroi) {

        NPC npc = new NPC("Big Boss", 300, 70);
        int option;
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Depois de ultrapssar aqueles ursos fofos e assutadores, só faltava esta!");
        System.out.println("Aparece o maior zombie de todos, um gigante zombie chamado Big Boss.");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("És um herói e vais lutar? Ou és um rato e vais fugir?");
        System.out.println();
        System.out.println("1 - Lutar");
        System.out.println("2 - Fugir");
        System.out.println("------------------------------------------------------------------------------------");
        option = input.nextInt();
        if (option == 1) {
            heroi.atacar(npc);
        }
        if (option == 2) {
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("Boa! Levaste umas pauladas mas conseguiste fugir!");
            System.out.println("PARABÉNS");
            System.out.println("------------------------------------------------------------------------------------");
        }
    }

    public static boolean labirinto() {

        Heroi heroi = criacaoHeroi();

        Vendedor vendedor = trafico();
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("BEM-VINDO À LOJA ONDE PODES COMPRAR OS TEUS ITEMS.");
        System.out.println("PODES COMPRAR ARMAS E POÇÕES PARA CURAR VIDA");
        System.out.println("NÃO TE ESQUEÇAS DE GERIR BEM O TEU OURO!");
        vendedor.vender(heroi);
        System.out.println("------------------------------------------------------------------------------------");

        System.out.println("------------------------------------------------------------------------------------");
        heroi.mostrarDetalhes();
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("CHEGASTE À PRIMEIRA GRANDE DECISÃO! O LABIRINTO COMEÇA COM UMA BIFORCAÇÃO!");
        System.out.println("TERÁS DE ESCOLHER ENTRE O CAMINHO DA ESQUERDA (1), OU O CAMINHO DA DIREITA (2).");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("PARA ONDE QUERES IR?");
        System.out.println("------------------------------------------------------------------------------------");
        int option = input.nextInt();
        if (option == 1) {
            sala1(heroi);
            sala1_1(heroi);
            sala1_2(heroi);
            if (heroi.getHp() > 0) {
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("Boa!! Conseguiste eliminar todos os zombies e chegar à civilização!");
                System.out.println("Parece que por agora vai haver paz por uns tempos");
                System.out.println("Parabéns! Ganhaste o jogo!");
                System.out.println("------------------------------------------------------------------------------------");
            } else {
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("GAME OVER!!");
                System.out.println("------------------------------------------------------------------------------------");
            }
        }
        if (option == 2){
            sala2(heroi);
            sala2_1(heroi);
            if (heroi.getHp() <= 0) {
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("Devias ter fugido!! AHAHAHAH!!");
                System.out.println("GAME OVER!!");
                System.out.println("------------------------------------------------------------------------------------");
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------||");
        System.out.println("Algures no ano 3000, uma epidemia propagou-se pelo planeta Terra que afetou cerca de 90% da população.   ||");
        System.out.println("Apenas aqueles com grandes capacidades a nível de estratégia e de batalha têm chance de sobreviver.      ||----------------------------||");
        System.out.println("Só os melhores cavaleiros, arqueiros e feiticeiros conseguem fazer frente às adversidades e obstáculos que irão aparecer pelo caminho. ||---------------------------------------------------------------------||");
        System.out.println("Estás prestes a entrar num labirinto localizado na cordilheira dos Pirinéus, que terás de atravessar para chegar à Península Ibérica, o único sítio em todo o planeta que ainda não está afetado pela praga.  ||");
        System.out.println("Poucos chamam-lhe LABIRINTO DA SALVAÇÃO, e muitos chamam LABIRINTO DA MORTE!  ||------------------------------------------------------------------------------------------------------------------------------||");
        System.out.println("------------------------------------------------------------------------------||");
        System.out.println("--------------------------||");
        System.out.println("BOA SORTE NESTA JORNADA!  ||");
        System.out.println("QUE COMECE A AVENTURA!    ||");
        System.out.println("--------------------------||");

        if (labirinto()) {
            System.out.println("Terminou o jogo.");
        }

    }
}
