package Command.Solution;

public class Client {
    public static void main(String[] args){
        Remote remote = new Remote(new Television());
        remote.nextButton();
        remote.decreaseButton();
        remote.increaseButton();
        remote.previousButton();

        remote.setDevice(new Buld());
        remote.nextButton();
        remote.decreaseButton();
        remote.increaseButton();
        remote.previousButton();
    }
}
