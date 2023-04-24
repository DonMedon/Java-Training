import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*8.Escreva um programa que leia o conteúdo de um ficheiro de texto e
grave apenas as linhas que contêm uma palavra específica num outro ficheiro.
 */

public class Ex8 {

    public static void findWord(String pathFile, String word) throws FileNotFoundException {

        File file = new File(pathFile);
        Scanner readFile = new Scanner(file);
        String line;


        File newFile = new File("ficheiro8.txt");
        PrintWriter writeFile = new PrintWriter(newFile);

        while (readFile.hasNextLine()) {

            line = readFile.nextLine();
            String[] array = line.split("[, ]");

            for (int i = 0; i < array.length; i++) {
                //System.out.println("A posição " + i + " do meu array corresponde à palavra " + array[i]);

                if ((array[i].equals(word))) {
                    writeFile.print(line);
                }
            }
        }
        readFile.close();
        writeFile.close();
    }

    public static void main(String[] args) {

        String word;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word you want to find");
        word = input.next();

        try {
            findWord("exercicio_08.txt", word);
        } catch (FileNotFoundException exc) {
            System.out.println("Can´t read file");
        }
    }

}
