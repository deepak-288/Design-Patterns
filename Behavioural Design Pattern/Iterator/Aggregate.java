import java.util.Iterator;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}
