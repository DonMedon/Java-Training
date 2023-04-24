/*
4.Escreva um programa que leia um ficheiro CSV (Comma-Separated Values)
e imprima o conteúdo na consola.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex4 {
    public static void readFile(String pathFile) throws FileNotFoundException {

        File file = new File(pathFile);
        Scanner openFile = new Scanner(file);

        while (openFile.hasNextLine()) {

            System.out.println(openFile.nextLine());
        }
    }

    public static void main(String[] args) {

        try {
            readFile("exercicio_04.csv");
        } catch (FileNotFoundException exc) {

            System.out.println("Can't create file");
        }
    }
}
