package Proxy.Solution;

public interface ICrud {
    void create(int key,int value);

    void update(int key,int value);

    int read(int key);

    void delete(int key);
}
