package Command.Solution;

public class Buld implements IDevice{

    @Override
    public void decreaseButton() {
        System.out.println("bulb's bightness is decreased");
        
    }

    @Override
    public void increaseButton() {
        System.out.println("bulb's bightness is increased");
        
    }

    @Override
    public void nextButton() {
        System.out.println("bulb's next color is selected");
        
    }

    @Override
    public void previousButton() {
        System.out.println("bulb's previous color is selected");
        
    }
    
}
