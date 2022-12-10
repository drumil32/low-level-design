package Command.Solution;

public class Remote {
    private IDevice device;
    public IDevice getDevice() {
        return device;
    }

    public void setDevice(IDevice device) {
        this.device = device;
    }

    Remote(IDevice device){
        this.device = device;
    }

    void increaseButton(){
        device.increaseButton();
    }
    void decreaseButton(){
        device.decreaseButton();
    }
    void nextButton(){
        device.nextButton();
    }
    void previousButton(){
        device.previousButton();
    }
}
