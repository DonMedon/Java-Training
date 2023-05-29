package Ex1;

import Ex1.DatabaseConnection;

public class Main {
    public static void main(String[] args) {

        DatabaseConnection connection = DatabaseConnection.getInstance("jdbc:mysql://localhost:3306/mydatabase");
        connection.connect();
        connection.disconnect();

        DatabaseConnection connection_2 = DatabaseConnection.getInstance("jdbc:mysql://localhost:3800/myNewDB");
        connection_2.connect();
        connection_2.disconnect();

        DatabaseConnection connection_3 = DatabaseConnection.getInstance("jdbc:mysql://localhost:3300/myDB");
        connection_3.connect();
        connection_3.disconnect();
    }
}