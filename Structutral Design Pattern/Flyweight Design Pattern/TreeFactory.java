// TreeFactory.java
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static final Map<String, Tree> trees = new HashMap<>();

    public static Tree getTree(String type) {
        Tree tree = trees.get(type);
        if (tree == null) {
            switch (type) {
                case "Oak":
                    tree = new OakTree();
                    break;
                case "Pine":
                    tree = new PineTree();
                    break;
                default:
                    throw new IllegalArgumentException("Tree type not supported.");
            }
            trees.put(type, tree);
        }
        return tree;
    }
}
