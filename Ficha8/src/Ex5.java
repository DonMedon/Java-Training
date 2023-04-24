/*5.Escreva um programa que leia um ficheiro de texto
contendo números inteiros separados por espaço e calcule a soma desses números
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex5 {

    public static void readFile(String pathFile) throws FileNotFoundException {

        File file = new File(pathFile);
        Scanner openFile = new Scanner(file);
        String line;
        int sum = 0;

        while (openFile.hasNextLine()) {

            line = openFile.nextLine();
            String[] numbers = line.split(" ");
            for (int i = 0; i < numbers.length ; i++) {

                sum = sum + Integer.parseInt(numbers[i]);

            }


            System.out.println(sum);

        }
        openFile.close();
    }

    public static void main(String[] args) {

        try {
            readFile("exercicio_05_31.txt");
        } catch (FileNotFoundException exc) {

            System.out.println("Can't create file");
        }
    }
}
