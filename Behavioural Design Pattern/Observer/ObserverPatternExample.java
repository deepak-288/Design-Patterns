public class ObserverPatternExample {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserver observer1 = new ConcreteObserver("Observer1");
        ConcreteObserver observer2 = new ConcreteObserver("Observer2");

        subject.attach(observer1);
        subject.attach(observer2);

        // Perform action that triggers notification
        subject.performAction();

        // Detach an observer and perform action again
        subject.detach(observer1);
        subject.performAction();

        // Try to detach an observer that is not attached
        try {
            subject.detach(observer1);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
