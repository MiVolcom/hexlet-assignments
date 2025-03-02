package exercise;

import java.util.Arrays;

class SafetyList {
    // BEGIN
    private int[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;


    public SafetyList() {
        elements = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    public synchronized void add(int element) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }

        elements[size] = element;
        size++;
    }

    public synchronized int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы списка: " + index);
        }
        return elements[index];
    }

    public synchronized int getSize() {
        return size;
    }

    // END
}
