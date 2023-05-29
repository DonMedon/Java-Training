package Ex1;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private String connectionString;
    private DatabaseConnection(String connectionString) {this.connectionString = connectionString;
    }
    public static synchronized DatabaseConnection getInstance(String connectionString) {
        if (instance == null) {
            instance = new DatabaseConnection(connectionString);
        }
        return instance;
    }
    public void connect() {
        // Código para conectar à basede dados usando a connectionString
        System.out.println("Conectado à basede dados: " + connectionString);
    }
    public void disconnect() {
        // Código para desconectar da basede dados
        System.out.println("Desconectado da base de dados: " + connectionString);
    }
        //Outros métodos da classe}
}
