import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*9.Escreva um programa que leia o conteúdo de um ficheiro de texto e
imprima as dez palavras mais frequentes no ficheiro.
 */

public class Ex9 {
    public static boolean findWords(String pathFile) throws FileNotFoundException {

        File file = new File(pathFile);
        Scanner readFile = new Scanner(file);
        Scanner readFileAgain = new Scanner(file);
        String line;
        int wordCounter = 0, totalLines = 0, totalWords = 0;
        int u = 0;


        while(readFile.hasNextLine()) {
            line = readFile.nextLine();
            totalLines++;

        }
        System.out.println("Total lines: " + totalLines);

        while (readFileAgain.hasNextLine()) {
            line = readFileAgain.nextLine();
            String[] words = line.split(" ");
            String[] unWords = new String[u];

            for (int i = 0; i < words.length; i++) {

                if(words[i].equals(unWords[i])) {

                }
            }
        }

        return false;


    }

    public static void main (String[]args){

        try {
            findWords("exercicio_09.txt");
        } catch (FileNotFoundException exc) {
            System.out.println("Can´t read file");
        }
    }
}
