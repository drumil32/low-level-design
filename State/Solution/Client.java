package State.Solution;

public class Client{
    public static void main(String[] args){
        Product product = new Product();
        product.giveOperationDetailsWithState();
        product.setState(new OutForDelivaryState());
        product.giveOperationDetailsWithState();
        product.setState(new OnDoorState());
        product.giveOperationDetailsWithState();
    }
}