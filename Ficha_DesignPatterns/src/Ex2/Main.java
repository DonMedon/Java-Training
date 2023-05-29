package Ex2;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {

        Logger logger = Logger.getInstance("express.txt");

        try {
            logger.log("Mensagem 1");
            logger.log("Mensagem 2");
        } catch (FileNotFoundException exc) {
            System.out.println("Erro no ficheiro...");
        }

    }
}
