package State.Solution;

public class OnDoorState implements IState {

    @Override
    public void giveOperationDetailsWithState() {
        System.out.println("this is onDoorState so now you can only do the refund");
    }
    
}
