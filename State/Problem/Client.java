package State.Problem;

public class Client{
    public static void main(String[] args){
        Product product = new Product();
        product.setState(2);
        product.giveOperationDetailsWithState();
        product.setState(5);
        product.giveOperationDetailsWithState();
        product.setState(6);
        product.giveOperationDetailsWithState();
    }
}