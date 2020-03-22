package generics;

import java.util.Iterator;
import java.util.Objects;

public class GenericList<T> implements Iterable<T> {
    private T[] items = (T[]) new Object[10];
    private int counter;

    public void add(T item){
        items[counter++] = item;
    }

    public T get(int index){
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this);
    }

    private class ListIterator implements Iterator<T> {

        private GenericList<T> list;
        private int index;

        public ListIterator(GenericList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return (index < list.counter);
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }
}
