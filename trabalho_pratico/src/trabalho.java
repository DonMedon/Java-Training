import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
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
        int salesNumber = 0, i = 0;
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
        int i = 0;
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
        int i = 0;

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

        Scanner input = new Scanner(System.in);
        int clientID;
        System.out.println("Choose an ID");
        clientID = input.nextInt();

        try {
            clientInfo("GameStart.csv", clientID);
        } catch (FileNotFoundException exc) {
            System.out.println("Can't read file!");
        }
    }
}