package Proxy.Solution;

import java.util.*;

public class DatabaseCrud implements ICrud {

    HashMap<Integer, Integer> hashmap;
    String password;

    DatabaseCrud() {
        hashmap = new HashMap<Integer, Integer>();
    }

    public void create(int key, int value) {
        hashmap.put(key, value);

    }

    public void delete(int key) {
        if (hashmap.containsKey(key) == false) {
            System.out.println("key is not exsist");
            return;
        } else {
            hashmap.remove(key);
        }

    }

    public int read(int key) {

        if (hashmap.containsKey(key) == false) {
            System.out.println("key is not exsist");
            return -1;
        } else {
            return hashmap.get(key);
        }

    }

    public void update(int key, int value) {
        if (hashmap.containsKey(key) == false) {
            System.out.println("key is not exsist");
            return;
        } else {
            hashmap.put(key, value);
        }
    }

}
