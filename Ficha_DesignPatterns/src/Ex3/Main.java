package Ex3;

public class Main {
    public static void main(String[] args) {

        UserSessionManager userSessionManager = UserSessionManager.getInstance();
        String sessionToken = userSessionManager.getSessionToken();
        long lastAccess = userSessionManager.getLastAccess();
        userSessionManager.setLastAccess(lastAccess);
    }
}
