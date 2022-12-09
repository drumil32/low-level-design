package Observer;

import Observer.*;
import java.util.*;

public class CricketData extends Subject {
    private int wickets, runs, balls;

    public CricketData() throws Exception {
        this(0, 0, 0);
    }

    public CricketData(int wickets, int runs, int balls) throws Exception {
        this(wickets, runs, balls, null);
    }

    public CricketData(int wickets, int runs, int balls, List<Observer> observers) throws Exception {
        super(observers);
        // this.setWickets(wickets);
        // this.setRuns(runs);
        // this.setBalls(balls);
        this.wickets = wickets;
        this.runs = runs;
        this.balls = balls;
        this.notifyAllObservers();
    }

    public void setWickets(int wickets) throws Exception {
        this.wickets = wickets;
        this.notifyAllObservers();
    }

    public void setRuns(int runs) throws Exception {
        this.runs = runs;
        this.notifyAllObservers();
    }

    public void setBalls(int balls) throws Exception {
        this.balls = balls;
        this.notifyAllObservers();
    }

    public int getWickets() {
        return wickets;
    }

    public int getRuns() {
        return runs;
    }

    public int getBalls() {
        return balls;
    }
}
