package Lesson13;

public class Main {
    public static void main(String[] args) {
        DoubleBox<String> box = new DoubleBox<>();
        System.out.println("111 -> " + box.get(111)); // null
        System.out.println("SIZE: " + box.size()); // 0
        System.out.println();

        System.out.println("PUT: " + box.put(111, "First string")); // true
        System.out.println("111 -> " + box.get(111)); // First string
        System.out.println("111 -> " + box.get(22)); // null
        System.out.println("111 -> " + box.get(3333)); // null
        System.out.println("SIZE: " + box.size()); // 1
        System.out.println();

        System.out.println("PUT: " + box.put(22, "Second string")); // true
        System.out.println("111 -> " + box.get(111)); // First string
        System.out.println("111 -> " + box.get(22)); // Second string
        System.out.println("111 -> " + box.get(3333)); // null
        System.out.println("SIZE: " + box.size()); // 2
        System.out.println();

        System.out.println("PUT: " + box.put(3333, "First string")); // false
        System.out.println("111 -> " + box.get(111)); // First string
        System.out.println("111 -> " + box.get(22)); // Second string
        System.out.println("111 -> " + box.get(3333)); // null
        System.out.println("SIZE: " + box.size()); // 2
    }
}


class RandomBox<T> {
    private int key;
    private T value;

    public RandomBox(int key, T value) {
        this.key = key;
        this.value = value;
    }

    public T tryUnlock(int key) {
        if (this.key == key) {
            return value;
        } else {
            return null;
        }
    }

    public int getKey() {
        return key;
    }

    public T getValue() {
        return value;
    }
}


class DoubleBox<T> {
    private RandomBox<T> first = new RandomBox<>(0,null);
    private RandomBox<T> second = new RandomBox<>(0,null);;
    private int size = 0;


    public boolean put(int key, T value) {
        // ваш код
        if (first.tryUnlock(key) == null) {
            first = new RandomBox<T>(key, value);
            size++;
            return true;
        }
        if (second.tryUnlock(key) == null) {
            second = new RandomBox<T>(key, value);
            size++;
            return true;
        } else return false;
    }

    public T get(int key) {
        // ваш код

        if (key == first.getKey()) {
            return first.getValue();
        } else if (key == second.getKey()) {
            return second.getValue();
        } else return null;

    }

    public int size() {
        // ваш код
        return size;

    }
}
