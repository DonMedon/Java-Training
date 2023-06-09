package Ex3;

import java.util.Random;

public class UserSessionManager {

    private static UserSessionManager instance;
    private long lastAccess;
    private Random sessionToken;

    public UserSessionManager() {
        this.sessionToken = new Random();
        this.lastAccess = System.currentTimeMillis();

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
        public Random getSessionToken () {
            return sessionToken;
        }
        public void setLastAccess (long lastAccess){
            this.lastAccess = lastAccess;
        }
}

