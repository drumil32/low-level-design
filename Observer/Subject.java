package Observer;
import java.util.*;

abstract class Subject {
    private List<Observer> observers;

    Subject() {
        this(null);
    }

    Subject(List<Observer> observers) {
        this.observers = new ArrayList<>();
        if (null != observers) {
            for (Observer observer : observers) {
                this.observers.add(observer);
            }
        }
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyAllObservers() throws Exception {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}