public class Game {
    private String team1;
    private String team2;
    private int homeScore;
    private int awayScore;
    private int period;
    public Game(String team1, String team2){
        this.team1 = team1; //home team
        this.team2 = team2; //away team
    }
    public void startGame(){      //initialize score and period
        homeScore = 0;
        awayScore = 0;
        period = 1;
    }
    public void addScore(String  team, int points){     //adds points to designated team
        if(team == team1){
            homeScore+= points;
        }else{
            awayScore+= points;
        }
    }
    public void endPeriod(){        //ends the period, begins the next one
            period++;
    }
    public int getPeriod(){         //returns the current period
        return period;
    }
    public int getHomeScore(){      //returns score of the home team
        return homeScore;
    }
    public int getAwayScore(){      //returns score of the away team
        return awayScore;
    }
    public String getTeam1(){       //gets the name of home team
        return team1;
    }
    public String getTeam2(){       //gets the name of away team
        return team2;
    }
    public void endGame(){          //ends the game and terminates the program with a success status 0
        System.exit(0);
    }
}
