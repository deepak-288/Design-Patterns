public class ConcreteHandler1 implements Handler {
    private Handler nextHandler;

    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    public void handleRequest(Request request) {
        if (request.getRequestType().equals("Type1")) {
            System.out.println("Handled by ConcreteHandler1");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No handler found for the request");
        }
    }
}
