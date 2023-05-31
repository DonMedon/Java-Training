package Ex3;

public class UserSessionManager {

    private static UserSessionManager instance;
    private long lastAccess;
    private String sessionToken;

    private UserSessionManager() {
    }
    public static synchronized UserSessionManager getInstance() {
        if (instance == null) {
            instance = new UserSessionManager();
        }
        return instance;
    }
        public long getLastAccess () {
            return lastAccess;
        }
        public String getSessionToken () {
            return sessionToken;
        }
        public void setLastAccess (long lastAccess){
            this.lastAccess = lastAccess;
        }
}

