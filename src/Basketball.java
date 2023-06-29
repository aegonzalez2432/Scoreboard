public class Basketball extends Game{
    int maxPeriod;
    int perLength;
    String perName;
    String[] scoreMethod;
    public Basketball(String home, String away){
        super(home, away);          //calls game constructor with home and away team names
        maxPeriod = 4;          //4 quarters in basketball
        perLength = 12;         //period length in basketball
        perName = "Quarter";
        startGame();            //starts game, score at 0's 1st quarter
    }
    public String[] getScoringMethod(){
        scoreMethod = new String[3];        //cannot score more than 3 points at a time
        scoreMethod[0] = "Free throw - 1";
        scoreMethod[1] = "Field Goal - 2";
        scoreMethod[2] = "Three pointer - 3";
        return scoreMethod;
    }
    public int getPerLength() {             //returns period lengh in basketball (12 min)
        return perLength;
    }
    public int getMaxPeriod() {             //returns max amount of quarters
        return maxPeriod;
    }
    public String getPerName() {            //returns 'quarter'
        return perName;
    }
}
