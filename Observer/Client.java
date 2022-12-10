package Observer;
import java.util.*;

public class Client {
    public static void main(String[] args) throws Exception {
        List<Observer> observers = new ArrayList<>();
        NetRunRateDisplay netRunRateDisplay = new NetRunRateDisplay();
        ProjectedScoreDisplay projectedScoreDisplay = new ProjectedScoreDisplay();
        ScoreCardDisplay scoreCardDisplay = new ScoreCardDisplay();
        observers.add(netRunRateDisplay);
        observers.add(projectedScoreDisplay);
        observers.add(scoreCardDisplay);

        CricketData cricketData = new CricketData(1, 58, 24,observers);
        // subject.addObserver(new ProjectedScoreDisplay());
        // subject.addObserver(new NetRunRateDisplay());
        // subject.addObserver(new ScoreCardDisplay());
        cricketData.removeObserver(netRunRateDisplay);
        
        cricketData.setBalls(120);

    }
}
