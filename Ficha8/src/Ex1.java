import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Ex1 {
    public static void readFile() throws FileNotFoundException {

        File file = new File("exercicio_01_Alternativa02.txt");
        Scanner openFile = new Scanner(file);

        while (openFile.hasNext()){

            System.out.println(openFile.nextLine());
        }

    }

    public static void main(String[] args) {

        try {
            readFile();
        } catch (FileNotFoundException exc) {

            System.out.println("File not found");
}


    }

}

