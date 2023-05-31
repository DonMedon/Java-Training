package Ex2;

import java.io.*;
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
    public void log(String log_line) throws IOException {

    FileWriter log_writer = new FileWriter(this.file,true);

    log_writer.write(log_line);
    log_writer.close();


    }
}