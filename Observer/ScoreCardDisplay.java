package Observer;
import Observer.*;

public class ScoreCardDisplay implements Observer{

    @Override
    public void update(Subject subject) throws Exception{

        if( subject instanceof CricketData ){
            CricketData cricketData = (CricketData)subject;
            System.out.println("current runs :- " + cricketData.getRuns());
            System.out.println("current balls :- " + cricketData.getBalls());
            System.out.println("current Wickets :- " + cricketData.getWickets());
        }else{
            throw new Exception("Object is not type of CricketData");
        }

    }

}