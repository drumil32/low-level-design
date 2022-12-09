package State.Solution;

public class Product {
    IState state;
    Product(){this.state = new PandingState();}
    void setState(IState state){this.state=state;}
    IState getState(){return state;}
    void giveOperationDetailsWithState(){
        state.giveOperationDetailsWithState();
    }
}
