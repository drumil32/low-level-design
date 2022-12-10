package Command.Problem;

public class Remote {
    Television television;
    Remote(Television television){
        this.television = television;
    }

    void increaseButton(){
        television.increaseVolume();
    }
    void decreaseButton(){
        television.decreaseVolume();
    }
    void nextButton(){
        television.nextChannel();
    }
    void previousButton(){
        television.previousChannel();
    }
}
