/*6.Escreva um programa que leia um ficheiro de texto contendo nomes e
idades separados por vírgulas e imprima o nome da pessoa mais velha na consola.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.io.File;

public class Ex6 {

    public static void findOldestPerson(String pathFile) throws FileNotFoundException {

        File file = new File(pathFile);
        Scanner openFile = new Scanner(file);
        String line, nameOldest = "";
        int totalLines = 0, i = 0, oldest = 0;


        while (openFile.hasNextLine()) {
            openFile.nextLine();
            totalLines++;
        }
        openFile.close();
        System.out.println("Total lines: " + totalLines);

        String[][] matrix = new String[totalLines][2];

        Scanner openAnotherFile = new Scanner(file);

        while (openAnotherFile.hasNextLine()) {
            line = openAnotherFile.nextLine();
            String[] array = line.split(",");
            matrix[i][0] = array[0];
            matrix[i][1] = array[1];
            i++;
        }

        for (int j = 0; j < matrix.length; j++) {
            for (int k = 0; k < matrix[0].length; k++) {
                System.out.println(matrix[j][k]);
            }
            System.out.println("");
        }

        for (int j = 0; j < matrix.length; j++) {

            if (Integer.parseInt(matrix[j][1]) > oldest) {
                System.out.println("A pessoa mais velha passou a ser "+matrix[j][0]+ " que tem " + matrix[j][1] + " anos." );
                oldest = Integer.parseInt(matrix[j][1]);
                nameOldest = matrix[j][0];
        }

        }
        System.out.println("A pessoa mais velha é " + nameOldest + " que tem " + oldest + " anos.");
    }

    public static void main(String[] args) {
        try {
            findOldestPerson("exercicio_06.txt");
        } catch (FileNotFoundException exc) {
            System.out.println("Can´t read file");
        }
    }
}