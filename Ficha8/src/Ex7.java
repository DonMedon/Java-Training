import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.io.File;

/*7.Escreva um programa que leia o conteúdo de um ficheiro de texto e
imprima o número de linhas e o número de palavras presentes nesse ficheiro.*/
public class Ex7 {

    public static void readFile(String pathFile) throws FileNotFoundException {

        File file = new File(pathFile);
        Scanner openFile = new Scanner(file);
        Scanner openFileAgain = new Scanner(file);

        int totalLines = 0;
        int totalWords = 0;
        String line;

        while (openFile.hasNextLine()) {

            openFile.nextLine();
            totalLines++;
        }
        openFile.close();
        System.out.println("Total lines: " + totalLines);

        while (openFileAgain.hasNextLine()) {
            line = openFileAgain.nextLine();
            String[] array = line.split(" ");


            for (int i = 0; i < array.length; i++) {
                if (!line.isEmpty()) {
                    totalWords++;

                }
            }
        }

            System.out.println("Total Words: " + totalWords);
        }


        public static void main (String[]args){
            try {
                readFile("exercicio_07.txt");
            } catch (FileNotFoundException exc) {
                System.out.println("Can´t read file");
            }
        }

    }

