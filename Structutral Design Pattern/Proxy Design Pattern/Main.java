public class Main {
    public static void main(String[] args) {
        try {
            VideoProxy videoProxy = new VideoProxy("example.mp4");
            videoProxy.play();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            // Change the user to simulate access denial
            VideoProxy videoProxyDenied = new VideoProxy("example.mp4") {
                @Override
                protected String getCurrentUser() {
                    return "user2"; // Simulate user2 who doesn't have access
                }
            };
            videoProxyDenied.play();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
