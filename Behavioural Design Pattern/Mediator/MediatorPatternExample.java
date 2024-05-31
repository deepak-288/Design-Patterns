public class MediatorPatternExample {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediator();

        ChatUser user1 = new ChatUser(chatMediator, "User1");
        ChatUser user2 = new ChatUser(chatMediator, "User2");
        ChatUser user3 = new ChatUser(chatMediator, "User3");

        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);

        user1.sendMessage("Hello everyone!");

        // Trying to send a message without adding the user to the mediator
        ChatUser unknownUser = new ChatUser(chatMediator, "UnknownUser");
        unknownUser.sendMessage("This message should not be received");
    }
}
