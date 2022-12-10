package Proxy.Problem;

import java.util.*;

public class DatabaseCrud {

    HashMap<Integer, Integer> hashmap;
    String password;

    DatabaseCrud(){
        hashmap = new HashMap<Integer, Integer>();
    }

    public void create(int key, int value) {
        if ("1234" == password) {
            hashmap.put(key, value);
        } else {
            System.out.println("you are not authenticated");
        }
    }

    public void delete(int key) {
        if ("1234" == password) {
            if (hashmap.containsKey(key) == false) {
                System.out.println("key is not exsist");
                return;
            } else {
                hashmap.remove(key);
            }
        } else {
            System.out.println("you are not authenticated");
        }
    }

    public int read(int key) {
        if ("1234" == password) {
            if (hashmap.containsKey(key) == false) {
                System.out.println("key is not exsist");
                return -1;
            } else {
                return hashmap.get(key);
            }
        } else {
            System.out.println("you are not authenticated");
            return -1;
        }
    }

    public void update(int key, int value) {
        if ("1234" == password) {
            if (hashmap.containsKey(key) == false) {
                System.out.println("key is not exsist");
                return;
            } else {
                hashmap.put(key, value);
            }
        } else {
            System.out.println("you are not authenticated");
        }
    }

}
