public class ConcreteHandler2 implements Handler {
    private Handler nextHandler;

    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    public void handleRequest(Request request) {
        if (request.getRequestType().equals("Type2")) {
            System.out.println("Handled by ConcreteHandler2");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No handler found for the request");
        }
    }
}
