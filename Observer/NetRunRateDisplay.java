package Observer;
import Observer.*;

public class NetRunRateDisplay implements Observer {
    @Override
    public void update(Subject subject) throws Exception{

        int netRunRate = 0;
        if (subject instanceof CricketData) {
            CricketData cricketData = (CricketData) subject;
            if (0 == cricketData.getBalls()) {
                netRunRate = 0;
            } else {
                netRunRate = ((cricketData.getRuns() / cricketData.getBalls()) * 6);
            }
            System.out.println("NetRunRate runs :- " + netRunRate);
        } else {
            throw new Exception("Object is not type of CricketData");
        }

    }
}