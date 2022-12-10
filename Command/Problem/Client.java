package Command.Problem;

// PROBLEM :- 
// if in future if we have another device example bulb
// then we can't use this same remote to operate buld
// BASIC THEY WANT OPEN FOR EXTENSION AND CLOSE FOR MODIFICATION DESIGN PRINCIPLE

public class Client {
    public static void main(String[] args){
        Remote remote = new Remote(new Television());
        remote.nextButton();
        remote.decreaseButton();
        remote.increaseButton();
        remote.previousButton();
    }
}
