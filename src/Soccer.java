public class Soccer extends Game {
    int maxPeriod;
    int perLength;
    String perName;
    String[] scoreMethod;
    public Soccer(String home, String away){
        super(home, away);              //calls game constructor with home and away team names
        maxPeriod = 2;                  //2 halves in soccer
        perLength = 45;                 //45 minutes each half
        perName = "Half";
        startGame();                    //initializes the game score at 0's, first half
    }
    public String[] getScoringMethod(){
        scoreMethod = new String[1];
        scoreMethod[0] = "Goal - 1";        //can only score one goal at a time
        return scoreMethod;
    }
    public int getPerLength() {             //returns period length
        return perLength;
    }
    public int getMaxPeriod() {             //returns max amount of halves
        return maxPeriod;
    }
    public String getPerName() {            //returns 'half'
        return perName;
    }
}
