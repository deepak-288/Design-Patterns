public class ConfigurationManager {
    private static volatile ConfigurationManager instance;
    private boolean initialized = false;
    private String databaseUrl;
    private String username;
    private String password;

    private ConfigurationManager() {
        // Private constructor to prevent instantiation
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            synchronized (ConfigurationManager.class) {
                if (instance == null) {
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }

    public void initialize(String databaseUrl, String username, String password) {
        if (initialized) {
            throw new IllegalStateException("ConfigurationManager is already initialized");
        }

        if (databaseUrl == null || databaseUrl.isEmpty()) {
            throw new IllegalArgumentException("Database URL cannot be null or empty");
        }
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be null or empty");
        }
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Password cannot be null or empty");
        }

        this.databaseUrl = databaseUrl;
        this.username = username;
        this.password = password;
        initialized = true;
    }

    public String getDatabaseUrl() {
        if (!initialized) {
            throw new IllegalStateException("ConfigurationManager is not initialized");
        }
        return databaseUrl;
    }

    public String getUsername() {
        if (!initialized) {
            throw new IllegalStateException("ConfigurationManager is not initialized");
        }
        return username;
    }

    public String getPassword() {
        if (!initialized) {
            throw new IllegalStateException("ConfigurationManager is not initialized");
        }
        return password;
    }
}
