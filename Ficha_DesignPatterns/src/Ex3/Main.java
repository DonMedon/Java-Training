package Ex3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        UserSessionManager userSessionManager = UserSessionManager.getInstance();

        Random sessionToken = userSessionManager.getSessionToken();

        long lastAccess = userSessionManager.getLastAccess();
        System.out.println("Último acesso: " + userSessionManager.getLastAccess());

        userSessionManager.setLastAccess(lastAccess);

        long updatedLastAccess = userSessionManager.getLastAccess();
        System.out.println("Último acesso atualizado: " + userSessionManager.getLastAccess());
    }
}
