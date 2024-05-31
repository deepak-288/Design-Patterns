public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(ElementA element) {
        System.out.println("Visiting ElementA: " + element.getName());
    }

    @Override
    public void visit(ElementB element) {
        System.out.println("Visiting ElementB: " + element.getValue());
    }
}
