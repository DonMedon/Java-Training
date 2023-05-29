package Ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Logger {

    private static Logger instance;
    private File file;

    private Logger(String filename) {
        file = new File(filename);
    }

    public static synchronized Logger getInstance(String filename) {
        if (instance == null) {
            instance = new Logger(filename);
        }
        return instance;
    }
    public void log(String log_line) throws FileNotFoundException {

    PrintWriter log_writer = new PrintWriter(this.file);

    log_writer.println(log_line);
    log_writer.close();


    }
}