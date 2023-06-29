public class Hockey extends Game{
    int maxPeriod;
    int perLength;
    String perName;
    String[] scoreMethod;
    public Hockey(String home, String away){
        super(home, away);          //calls game constructor with home and away team names
        maxPeriod = 3;              //hockey has 3 periods
        perLength = 20;             //20 min each period
        perName = "Period";         //called Periods
        startGame();                //initializes the game with scores at 0 and period at 1
    }
    public String[] getScoringMethod(){
        scoreMethod = new String[1];
        scoreMethod[0] = "Goal - 1";        //only amount of points to score in hockey is one, cannot score more than one at a time
        return scoreMethod;
    }
    public int getPerLength() {             //returns the length of a period in Hockey
        return perLength;
    }
    public int getMaxPeriod() {             //returns the amount of periods there are
        return maxPeriod;
    }
    public String getPerName() {            //returns 'period'
        return perName;
    }
}
