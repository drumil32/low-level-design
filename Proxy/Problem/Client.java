package Proxy.Problem;

// HERE WHAT IS PROBLEM ??

// as you can see in DatabaseCrud class 
// there are two responsibilities
    // 1. to do CRUD operations
    // 2. to check authentication
// it violates SRP

public class Client{
    public static void main(String[] args){
        DatabaseCrud crud = new DatabaseCrud();

        crud.create(1,45);
        crud.create(2,56);
        System.out.println(crud.read(1));
        crud.update(1,67);
        System.out.println(crud.read(1));

        System.out.println(crud.read(4));

        crud.password = "1234";
        crud.create(1,45);
        crud.create(2,56);
        System.out.println(crud.read(1));
        crud.update(1,67);
        System.out.println(crud.read(1));

        System.out.println(crud.read(4));
    }
}