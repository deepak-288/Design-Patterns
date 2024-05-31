import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ConcreteIterator<T> implements Iterator<T> {
    private ArrayList<T> items;
    private int position = 0;

    public ConcreteIterator(ArrayList<T> items) {
        this.items = items;
    }

    public boolean hasNext() {
        return position < items.size();
    }

    public T next() throws NoSuchElementException {
        if (!hasNext()) {
            throw new NoSuchElementException("No more elements in the collection");
        }
        T item = items.get(position);
        position++;
        return item;
    }
}
