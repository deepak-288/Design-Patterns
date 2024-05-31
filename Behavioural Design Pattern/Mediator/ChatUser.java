public class ChatUser implements User {
    private Mediator mediator;
    private String name;

    public ChatUser(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public void sendMessage(String message) {
        System.out.println(name + " sends: " + message);
        mediator.sendMessage(this, message);
    }

    public void receiveMessage(String message) {
        System.out.println(name + " receives: " + message);
    }
}
