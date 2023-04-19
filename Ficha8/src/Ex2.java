import java.util.Formatter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Ex2 {
    public static void createFile(String path) throws FileNotFoundException {

        String fileContent = "Olá, sou o Bernardo";

        Formatter novoTexto = new Formatter(new File(path));
        novoTexto.format(fileContent);
        novoTexto.close();
    }


    public static void main(String[] args) {

        try {
            createFile("C:/Users/sdev0223/Desktop/Bernardo's Projects/Java-Training/Ficha8/newFile.txt");

            File file = new File("newFile.txt");
            Scanner openFile = new Scanner(file);
            System.out.println(openFile.nextLine());

        } catch (FileNotFoundException exc) {

            System.out.println("Can't create file");
        }



    }

}
