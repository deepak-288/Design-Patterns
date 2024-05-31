import java.util.HashMap;
import java.util.Map;

public class VideoProxy implements Video {
    private final String fileName;
    private RealVideo realVideo;
    private static final Map<String, Boolean> userAccessMap = new HashMap<>();

    static {
        // Simulate some user access rights
        userAccessMap.put("user1", true);
        userAccessMap.put("user2", false);
    }

    public VideoProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void play() throws Exception {
        if (!hasAccess()) {
            throw new Exception("Access denied: You do not have permission to play this video.");
        }

        if (realVideo == null) {
            realVideo = new RealVideo(fileName);
        }
        realVideo.play();
    }

    private boolean hasAccess() {
        // Simulate user access check
        String currentUser = getCurrentUser();
        return userAccessMap.getOrDefault(currentUser, false);
    }

    protected String getCurrentUser() {
        // Simulate getting the current user
        return "user1"; // Change this value to "user2" to simulate access denial
    }
}
