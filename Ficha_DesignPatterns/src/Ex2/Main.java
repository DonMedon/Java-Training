package Ex2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Logger logger = Logger.getInstance("src/Ex2/express.txt");

        try {
            logger.log("Mensagem 1");
            logger.log("Mensagem 2");
        } catch (IOException exc) {
            System.out.println("Erro no ficheiro...");
        }

    }
}
