import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex3 {

    public static void saveFile(String pathFile) throws FileNotFoundException {

        File file = new File(pathFile);
        Scanner openFile = new Scanner(file);
        String line;

        File anotherFile = new File("ficheiro3.txt");
        PrintWriter createFile = new PrintWriter(anotherFile);

        while (openFile.hasNext()) {
                line = openFile.nextLine();
                createFile.print(line);

        }
        openFile.close();
        createFile.close();

    }

    public static void main(String[] args) {

        try {
            saveFile("exercicio_03.txt");
        } catch (FileNotFoundException exc) {

            System.out.println("Can't create file");
        }


    }

}
