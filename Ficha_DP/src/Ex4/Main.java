package Ex4;

public class Main {
    public static void main(String[] args) {

        FileManager fileManager = FileManager.getInstance("\\desktop");

        fileManager.createFile("file.txt");
        fileManager.createFile("fileToDelete.txt");

        fileManager.deleteFile("fileToDelete.txt");

        fileManager.setRootDirectory("");

        fileManager.createFile("newFile.txt");
    }
}
