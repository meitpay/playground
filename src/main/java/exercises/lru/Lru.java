package exercises.lru;

import java.util.*;

public class Lru<T> {
    int capacity = Integer.MAX_VALUE;
    HashMap<String, T> map = new HashMap<>();
    LinkedList<String> priority =new LinkedList<>();

    public Lru() {
    }

    public Lru(int capacity) {
        this.capacity = capacity;
    }

    public void put(String key, T value) {
        setPriority(key);
        removeLowPriorityMaps();
        map.put(key, value);
    }

    private void removeLowPriorityMaps() {
        if (map.size() >= capacity) {
            while (priority.size() > capacity) {
                priority.poll();
            }
        }
        HashMap<String, T> tmp = new HashMap<>();

        priority.forEach(e -> tmp.put(e, map.get(e)));
        map.clear();
        map = tmp;
    }

    private void setPriority(String key) {
        priority.add(key);
    }


    public T get(String key) {
        if (map.get(key) != null) {
            setPriority(key);
        }
        return map.get(key);
    }
}