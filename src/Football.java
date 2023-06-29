public class Football extends Game {
    int maxPeriod;
    int perLength;
    String perName;
    String[] scoreMethod;
    public Football(String home, String away) {
        super(home, away);          //calls game constructor with home and away team names
        maxPeriod = 4;                  //4 quarters in football
        perLength = 15;                 //period length in football
        perName = "Quarter";
        startGame();                    //starts the game score at 0's in the first quarter
    }
    public String[] getScoringMethod(){
        scoreMethod = new String[5];            // 5 ways to score in football
        scoreMethod[0] = "Extra point - 1";
        scoreMethod[1] = "Safety - 2";
        scoreMethod[2] = "2-point Conversion - 2";
        scoreMethod[3] = "Field goal - 3";
        scoreMethod[4] = "Touchdown - 6";
        return scoreMethod;
    }
    public int getPerLength() { //returns period length
        return perLength;
    }
    public int getMaxPeriod() { //returns max quarters
        return maxPeriod;
    }
    public String getPerName() { //returns 'quarter'
        return perName;
    }

}
