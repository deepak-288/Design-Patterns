import java.util.ArrayList;
import java.util.Iterator;

public class ConcreteAggregate<T> implements Aggregate<T> {
    private final ArrayList<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(items);
    }
}
