package Observer;

import Observer.*;

public class ProjectedScoreDisplay implements Observer {

    @Override
    public void update(Subject subject) throws Exception {

        if (subject instanceof CricketData) {
            CricketData cricketData = (CricketData) subject;
            int projectedScore;
            if (0 == cricketData.getBalls()) {
                projectedScore = 0;
            } else {
                int remainingBalls = 120 - cricketData.getBalls();
                int netRunRate = ((cricketData.getRuns() / cricketData.getBalls()) * 6);
                projectedScore = ((remainingBalls / 6) * netRunRate);
            }
            System.out.println("Projected runs :- " + projectedScore);
        } else {
            throw new Exception("Object is not type of CricketData");
        }

    }

}
