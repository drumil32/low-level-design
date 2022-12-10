package Proxy.Solution;

// NOTE :- here why we create ICrud interface and then implemented it in both DatabaseCrud and AuthProxyCrud ??

// REASON :- because if suppose manage give DatabaseCrud class to employee A and AuthProxyCrud class to employee B to write the code 
// THEN, it can happen that both may give different to same functionlity example
// A gives name to read functionality as read
// B give name to read functionality as readFromDatabse

// then which method we will call from client side 
// because client doesn't know that between him and database there is another layer

// /HENCE, we manage will create one interface give nama and write required functionalities as abstract and give this interface to employees to implement

public class Client{
    public static void main(String[] args){
        ICrud crud = new AuthProxyCrud();

        crud.create(1,45);
        crud.create(2,56);
        System.out.println(crud.read(1));
        crud.update(1,67);
        System.out.println(crud.read(1));

        System.out.println(crud.read(4));

        ((AuthProxyCrud)crud).password = "1234";
        crud.create(1,45);
        crud.create(2,56);
        System.out.println(crud.read(1));
        crud.update(1,67);
        System.out.println(crud.read(1));

        System.out.println(crud.read(4));
    }
}