package poo_fp11.stand;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mota extends Veiculo {
    public Mota(String marca, String modelo, int anoFabrico, int potencia, double cilindrada, double consumo) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, consumo);

    }
    public void printFile(String path) {

        try {
            Scanner readFile = new Scanner(new File(path));
            while (readFile.hasNextLine()) {
                System.out.println(readFile.nextLine());
            }
            readFile.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
    }
}
