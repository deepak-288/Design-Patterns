// FlyweightPatternDemo.java
public class FlyweightPatternDemo {
    public static void main(String[] args) {
        Tree oak1 = TreeFactory.getTree("Oak");
        oak1.display(1, 2);

        Tree oak2 = TreeFactory.getTree("Oak");
        oak2.display(3, 4);

        Tree pine1 = TreeFactory.getTree("Pine");
        pine1.display(5, 6);

        Tree pine2 = TreeFactory.getTree("Pine");
        pine2.display(7, 8);

        try {
            Tree unknown = TreeFactory.getTree("Birch");
            unknown.display(9, 10);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
