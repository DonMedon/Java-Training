import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

/*1.Imprima o seu conteúdo na consola.
2.Imprima quantas vendas foram executadas e o seu valor total.
3.Sabendo que a GameStart tem 10% de lucro em cada jogo, calcule o total de lucro.
4.Dado um idCliente, imprima todas as informações associadas a esse cliente (nome, contacto, email).
5.Dada uma Editora, imprima todos géneros e os respetivos jogos.
6.Imprima qual o jogo mais caro e os clientes que o compraram.*/


public class trabalho {

    public static void printFile(String pathFile) throws FileNotFoundException {

        //Abrir o ficheiro
        File file = new File(pathFile);
        //Ler o ficheiro
        Scanner readFile = new Scanner(file);

        //Enquanto houver nova linha, continua a ler a linha seguinte
        while (readFile.hasNext()) {
            //Imprime as linhas todas na consola
            System.out.println(readFile.nextLine());
        }
    }

    public static void totalSales(String pathFile) throws FileNotFoundException {

        //Abrir o ficheiro
        File file = new File(pathFile);
        //Ler o ficheiro
        Scanner readFile = new Scanner(file);

        //Declarar varável "line"
        String line;
        //Varável "nº de linhas" e contador para o ciclo
        int salesNumber = 0;
        double totalSales = 0, eachSale = 0;

        readFile.nextLine();

        //Ciclo para ler o ficheiro e contar o número total de linhas
        while (readFile.hasNextLine()) {
            line = readFile.nextLine();
            String[] itemsOfTheLine = line.split(";");
            totalSales += Double.parseDouble(itemsOfTheLine[8]);
            salesNumber++;
        }


        readFile.close();
        //Imprimir o numero total de linhas que corresponde ao nº total de vendas
        System.out.println("Total number of sales is: " + salesNumber);
        System.out.println("Total value of sales is: " + totalSales);
    }

    public static void totalProfit(String pathFile) throws FileNotFoundException {

        //Abrir o ficheiro
        File file = new File(pathFile);
        //Ler o ficheiro
        Scanner readFile = new Scanner(file);

        //Declarar varável "line"
        String line;
        //Varável "nº de linhas" e contador para o ciclo
        double totalProfit = 0, totalSales = 0;

        readFile.nextLine();

        //Ciclo para ler o ficheiro e contar o número total de linhas
        while (readFile.hasNextLine()) {
            line = readFile.nextLine();
            String[] itemsOfTheLine = line.split(";");
            totalSales += Double.parseDouble(itemsOfTheLine[8]);
            totalProfit = totalSales * 0.1;

        }
        readFile.close();
        //Imprimir o lucro total
        System.out.println("Total profit is: " + totalProfit);
    }

    public static void clientInfo(String pathFile, int clientID) throws FileNotFoundException {

        //Abrir o ficheiro
        File file = new File(pathFile);
        //Ler o ficheiro
        Scanner readFile = new Scanner(file);

        //Declarar varável "line"
        String line, name = "", contact = "", email = "";
        //Varável "nº de linhas" e contador para o ciclo

        readFile.nextLine();

        //Ciclo para ler o ficheiro e contar o número total de linhas
        while (readFile.hasNextLine()) {

            line = readFile.nextLine();
            String[] itemsOfTheLine = line.split(";");
            if (Integer.parseInt(itemsOfTheLine[1]) == (clientID)) {

                name = (itemsOfTheLine[2]);
                contact = (itemsOfTheLine[3]);
                email = (itemsOfTheLine[4]);
            }
        }

        readFile.close();
        //Imprimir o nome, contacto e e-mail que corresponde a um certo ID
        System.out.println("Name: " + name);
        System.out.println("Contact: " + contact);
        System.out.println("E-mail: " + email);

    }

    public static void GameEditor(String pathFile, String editor) throws FileNotFoundException {

        //Abrir o ficheiro
        File file = new File(pathFile);
        //Ler o ficheiro
        Scanner readFile = new Scanner(file);

        //Declarar varável "line"
        String line, category = "", game = "";
        int games = 0;
        String[] arrayGames = new String[120];
        boolean gamesSearch = false;

        //Ciclo para ler o ficheiro e contar o número total de linhas
        while (readFile.hasNextLine()) {

            line = readFile.nextLine();
            String[] itemsOfTheLine = line.split(";");
            if ((itemsOfTheLine[5]).equals(editor)) {

                category = (itemsOfTheLine[6]);
                game = (itemsOfTheLine[7]);

                //Imprimir o nome, contacto e e-mail que corresponde a um certo ID
                System.out.println("Category: " + category);
                System.out.println("Game: " + game);

               /* for (int j = 0; j < games; j++) {

                    if (arrayGames[j].equals(game)) {

                        gamesSearch = true;

                    }
                }
            }
            if (!gamesSearch) {
                arrayGames[games] = game;
                //Imprimir o nome, contacto e e-mail que corresponde a um certo ID
                System.out.println("Category: " + category);
                System.out.println("Game: " + game);
                games++;
            } */


            }

        }
        readFile.close();


    }

    public static void menu() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcao;
        String op = null;

        do {
            do {
                System.out.println("Seleccione uma das opções");
                System.out.println("Prima 1 para imprimir conteúdo do ficheiro na consola");
                System.out.println("Prima 2 para imprimir quantas vendas foram executadas e o seu valor total");
                System.out.println("Prima 3 para saber o total de lucro da GameStart");
                System.out.println("Prima 4 para imprimir todas as informações de um dado cliente da GameStart");
                System.out.println("Prima 5 para imprimir todos os géneros e respetivos jogos de uma dada Editora");
                System.out.println("Prima 6 para imprimir o jogo mais caro e os clientes que o compraram");

                opcao = input.nextInt();

            } while (opcao < 1 || opcao > 6);

            switch (opcao) {

                case 1:
                    printFile("GameStart.csv");
                    break;
                case 2:
                    totalSales("GameStart.csv");
                    break;
                case 3:
                    totalProfit("GameStart.csv");
                    break;
                case 4:
                    Scanner inputID = new Scanner(System.in);
                    int clientID;
                    System.out.println("Choose an ID");
                    clientID = inputID.nextInt();

                    clientInfo("GameStart.csv", clientID);


                    break;
                case 5:
                    Scanner inputED = new Scanner(System.in);
                    String editor;
                    System.out.println("Choose an editor");
                    editor = inputED.next();

                    GameEditor("GameStart.csv", editor);
                    break;
                case 6:
                    break;
            }
            System.out.println("Deseja efetuar mais alguma operação?");
            op = input.next();
            op = op.toUpperCase();

        } while(op.equals("S"));
    }


        /*Criar matriz com todas as linhas e colunas
        String[][] matrix = new String[salesNumber][9];

        //Ler novamente o ficheiro
        Scanner readFileAgain = new Scanner(file);

        //Novo ciclo para preencher a nossa matriz
        while (readFileAgain.hasNextLine()) {
            line = readFileAgain.nextLine();

            //Divide cada linha em colunas sempre que encontra um ";" e tranforma
            //num array de 9 posições. De seguida insere os valores de cada coluna
            //na respetiva posição da nossa matriz.
            String[] itemsOfTheLine = line.split(";");

            matrix[i][0] = itemsOfTheLine[0];
            matrix[i][1] = itemsOfTheLine[1];
            matrix[i][2] = itemsOfTheLine[2];
            matrix[i][3] = itemsOfTheLine[3];
            matrix[i][4] = itemsOfTheLine[4];
            matrix[i][5] = itemsOfTheLine[5];
            matrix[i][6] = itemsOfTheLine[6];
            matrix[i][7] = itemsOfTheLine[7];
            matrix[i][8] = itemsOfTheLine[8];
            i++;
        }


        /*Prints the matrix
        for (int j = 0; j < matrix.length; j++) {
            for (int k = 0; k < matrix[0].length; k++) {
                System.out.println("Matrix["+j+"]["+k+"]: " + matrix[j][k]);
            }
            System.out.println("");
        }*/




    public static void main(String[] args) {

        try {
            menu();
        } catch (FileNotFoundException exc) {
            System.out.println("Can't read file!");
        }
    }
}