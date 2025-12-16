package hometask_9.task2;

import java.util.*;

public class MyEntry <K, V> {


    private K key;
    private V value;

    public MyEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyEntry{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public static <K, V> void addToMap (Map<K, V> map, K key, V value) {
        map.put(key, value);
    }

    public static <K, V> void removeForKey (Map<K, V> map, K key) {
        map.remove(key);
    }

    public static <K, V> void removeForValue (Map<K, V> map, V value) {
        map.remove(value);
    }

    public static <K, V> void setKeys (Set<K> keySet) {
        System.out.println("Set of keys : " + keySet);
    }

    public static <K, V> void listValues (List<V> listOfValues) {
        System.out.println("List of values: " + listOfValues);
    }

    public static <K, V> void allMap (Map<K, V> map) {
        System.out.println("All map : " + map);
    }

}



