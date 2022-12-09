package State.Solution;

public class PandingState implements IState {

    @Override
    public void giveOperationDetailsWithState() {
        System.out.println("this is PandingState so you can cancel the order");
    }
    
}
