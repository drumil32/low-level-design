package Proxy.Solution;

public class AuthProxyCrud implements ICrud{
    DatabaseCrud databaseCrud = new DatabaseCrud();
    String password;

    public void create(int key, int value) {
        if ("1234" == password) {
            databaseCrud.create(key, value);
        } else {
            System.out.println("you are not authenticated");
        }
    }

    public void delete(int key) {
        if ("1234" == password) {
            databaseCrud.delete(key);
        } else {
            System.out.println("you are not authenticated");
        }
    }

    public int read(int key) {
        if ("1234" == password) {
            return databaseCrud.read(key);
        } else {
            System.out.println("you are not authenticated");
            return -1;
        }
    }

    public void update(int key, int value) {
        if ("1234" == password) {
            databaseCrud.update(key, value);
        } else {
            System.out.println("you are not authenticated");
        }
    }
    
}
