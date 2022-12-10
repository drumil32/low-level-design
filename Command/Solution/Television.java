package Command.Solution;

public class Television implements IDevice{
    public void increaseButton(){
        System.out.println("television's volume is increased");
    }
    public void decreaseButton(){
        System.out.println("television's volume is decreased");
    }
    public void nextButton(){
        System.out.println("television's next channel is selected");
    }
    public void previousButton(){
        System.out.println("television's previous channel is selected");
    }
}
