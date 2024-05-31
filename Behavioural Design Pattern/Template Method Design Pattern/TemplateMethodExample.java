public class TemplateMethodExample {
    public static void main(String[] args) {
        AbstractClass abstractClass1 = new ConcreteClass1();
        AbstractClass abstractClass2 = new ConcreteClass2();

        System.out.println("Calling template method for ConcreteClass1:");
        abstractClass1.templateMethod();

        System.out.println("\nCalling template method for ConcreteClass2:");
        abstractClass2.templateMethod();
    }
}
