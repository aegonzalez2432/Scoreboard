import java.util.Scanner;
public class GameDriver {
    static Scanner scanner = new Scanner(System.in);
    static int sport;
    static String home, away;
    static Object clon;
    static boolean gameOn = true;
    static String[] scoringMethods;
    static String team;
    static int menuChoice;
    public static void main(String[] args) {
        System.out.println("Please select the sport you would like to play. \n1. Football\n2. Basketball\n3. Soccer\n4. Hockey");
        try {           //ensure user enters a number with try catch statement
            sport = scanner.nextInt();
        } catch (Exception e) {     //if user doesnt enter number, prompts user to restart and enter a number
            System.out.println("Input a number only");
        }
        System.out.println("Enter home team");      //prompts user for home team name
        home = scanner.nextLine();
        home = scanner.nextLine();
        System.out.println("Enter away team");      // prompts user for away team name
        away = scanner.nextLine();

        switch (sport) {                            //use user input for sport to choose which game to play
            case 1:
                Football playFB = new Football(home, away);             //initialize football game
                while (gameOn) {                                        //while gameOn is 1,, stay in loop
                    System.out.println("\n\nHome: " + playFB.getHomeScore() + "\tAway: " + playFB.getAwayScore() + "\nCurrent "
                            + playFB.getPerName() + ": " + playFB.getPeriod() + "\n\nMenu:");   //prints scoreboard
                    scoringMethods = playFB.getScoringMethod();

                    //Nested for loop to print out scoring options for each team playing
                    for (int j = 1; j < 3; j++) {           //prints out scoring options for Football
                        if (j == 1) {                       //first for loop for the two teams
                            team = home;
                        } else {
                            team = away;
                        }
                        for (int i = 1; i < scoringMethods.length + 1; i++) {//second option to go through each scoring method
                            if (j == 1) {                                    //print out first teams menu
                                System.out.println((i) + ". " + team + " " + scoringMethods[i - 1] + " points");
                            } else {                                         //print out second teams menu with correct numbering
                                System.out.println((i + 5) + ". " + team + " " + scoringMethods[i - 1] + "points");
                            }
                        }
                    }//prints last option to end the quarter then prompts user for their choice
                    System.out.print((scoringMethods.length * 2 + 1) + ". End Quarter \nEnter choice: ");
                    menuChoice = scanner.nextInt();                 //takes in user choice
                    switch (menuChoice) {                      //action user chose
                        case 1:                          //if extra point was scored, sets appropriate team
                            team = home;
                        case 6:
                            playFB.addScore(team, 1);       //adds point to correct team score
                            break;
                        case 2:                                     //safety sets appropriate team as above and below
                            team = home;
                        case 7:
                            playFB.addScore(team, 2);
                            break;
                        case 3:                                     //2-point conversion
                            team = home;
                        case 8:
                            playFB.addScore(team, 2);
                            break;
                        case 4:                                     //field goal
                            team = home;
                        case 9:
                            playFB.addScore(team, 3);
                            break;
                        case 5:                                     //touchdown
                            team = home;
                        case 10:
                            playFB.addScore(team, 6);
                            break;
                        case 11:                                   //end period is chosen
                            playFB.endPeriod();                    //ends period
                            if (playFB.getPeriod() > playFB.getMaxPeriod()) {       //print scoreboard, winner, ends game   //
                                System.out.print("\nGame over!\nHome: " + playFB.getHomeScore() + "\tAway: "
                                        + playFB.getAwayScore() + "\nCurrent period: Final\nThe winner is: ");
                                if (playFB.getHomeScore() > playFB.getAwayScore()) {
                                    System.out.print(home);
                                } else {
                                    System.out.print(away);
                                }
                                playFB.endGame();
                                break;
                            }

                    }                                                               //                                         //
                }
                    break;
                    case 2:                                                    //case 2,3,4 works the same way as case 1, for
                        Basketball playBB = new Basketball(home, away);        //each sports object (basketball, soccer, hockey, football)
                        while (gameOn) {
                            System.out.println("\n\nHome: " + playBB.getHomeScore() + "\tAway: " + playBB.getAwayScore() + "\nCurrent "
                                    + playBB.getPerName() + ": " + playBB.getPeriod() + "\n\nMenu:");
                            scoringMethods = playBB.getScoringMethod();
                            for (int j = 1; j < 3; j++) {
                                if (j == 1) {
                                    team = home;
                                } else {
                                    team = away;
                                }
                                for (int i = 1; i < scoringMethods.length + 1; i++) {

                                    if (j == 1) {
                                        System.out.println((i) + ". " + team + " " + scoringMethods[i - 1]);
                                    } else {
                                        System.out.println((i + 3) + ". " + team + " " + scoringMethods[i - 1]);

                                    }
                                }
                            }
                            System.out.print((scoringMethods.length * 2 + 1) + ". End Quarter \nEnter choice: ");
                            menuChoice = scanner.nextInt();
                            switch (menuChoice) {
                                case 1:
                                    team = home;
                                case 4:
                                    playBB.addScore(team, 1);
                                    break;
                                case 2:
                                    team = home;
                                case 5:
                                    playBB.addScore(team, 2);
                                    break;
                                case 3:
                                    team = home;
                                case 6:
                                    playBB.addScore(team, 3);
                                    break;
                                case 7:
                                    playBB.endPeriod();
                                    if (playBB.getPeriod() > playBB.getMaxPeriod()) {
                                        System.out.print("\nGame over!\nHome: " + playBB.getHomeScore() + "\tAway: "
                                                + playBB.getAwayScore() + "\nCurrent period: Final\nThe winner is: ");
                                        if (playBB.getHomeScore() > playBB.getAwayScore()) {
                                            System.out.print(home);
                                        } else {
                                            System.out.print(away);
                                        }

                                        menuChoice = -1;
                                        playBB.endGame();
                                    }
                                    break;

                            }

                        }

                        break;
                    case 3:                                         //Soccer Object
                        Soccer playS = new Soccer(home, away);
                        while (gameOn) {
                            System.out.println("\n\nHome: " + playS.getHomeScore() + "\tAway: " + playS.getAwayScore() + "\nCurrent "
                                    + playS.getPerName() + ": " + playS.getPeriod() + "\n\nMenu:");
                            scoringMethods = playS.getScoringMethod();
                            for (int j = 1; j < 3; j++) {       //Nested for loop to print out scoring methods
                                if (j == 1) {
                                    team = home;
                                } else {
                                    team = away;
                                }
                                for (int i = 1; i < scoringMethods.length + 1; i++) {

                                    if (j == 1) {
                                        System.out.println((i) + ". " + team + " " + scoringMethods[i - 1]);
                                    } else {
                                        System.out.println((i + 1) + ". " + team + " " + scoringMethods[i - 1]);

                                    }
                                }
                            }
                            System.out.print((scoringMethods.length * 2 + 1) + ". End Half \nEnter choice: ");
                            menuChoice = scanner.nextInt();
                            switch (menuChoice) {
                                case 1:
                                    team = home;
                                case 2:
                                    playS.addScore(team, 1);
                                    break;

                                case 3:
                                    playS.endPeriod();
                                    if (playS.getPeriod() > playS.getMaxPeriod()) {
                                        System.out.print("\nGame over!\nHome: " + playS.getHomeScore() + "\tAway: "
                                                + playS.getAwayScore() + "\nCurrent period: Final\nThe winner is: ");
                                        if (playS.getHomeScore() > playS.getAwayScore()) {
                                            System.out.print(home);
                                        } else {
                                            System.out.print(away);
                                        }

                                        menuChoice = -1;
                                        playS.endGame();
                                    }
                                    break;

                            }

                        }
                        break;
                    case 4:                                             //Hockey object
                        Hockey playH = new Hockey(home, away);
                        while (gameOn) {
                            System.out.println("\n\nHome: " + playH.getHomeScore() + "\tAway: " + playH.getAwayScore() + "\nCurrent "
                                    + playH.getPerName() + ": " + playH.getPeriod() + "\n\nMenu:");
                            scoringMethods = playH.getScoringMethod();
                            for (int j = 1; j < 3; j++) {       //Nested for loop to print out scoring methods
                                if (j == 1) {
                                    team = home;
                                } else {
                                    team = away;
                                }
                                for (int i = 1; i < scoringMethods.length + 1; i++) {

                                    if (j == 1) {
                                        System.out.println((i) + ". " + team + " " + scoringMethods[i - 1]);
                                    } else {
                                        System.out.println((i + 1) + ". " + team + " " + scoringMethods[i - 1]);

                                    }
                                }
                            }
                            System.out.print((scoringMethods.length * 2 + 1) + ". End Period \nEnter choice: ");
                            menuChoice = scanner.nextInt();
                            switch (menuChoice) {//
                                case 1://set team to home team if 1 is chosen. otherwise, it is already set on away from for loop (j) so go directly to case 2
                                    team = home;
                                    //no break statement to go directly to case 2
                                case 2:
                                    playH.addScore(team, 1);//add one to away score
                                    break;

                                case 3:
                                    playH.endPeriod();
                                    if (playH.getPeriod() > playH.getMaxPeriod()) {
                                        System.out.print("\nGame over!\nHome: " + playH.getHomeScore() + "\tAway: "
                                                + playH.getAwayScore() + "\nCurrent period: Final\nThe winner is: ");//display game over and scoreboard
                                        if (playH.getHomeScore() > playH.getAwayScore()) {//prints winners name
                                            System.out.print(home);
                                        } else {
                                            System.out.print(away);
                                        }

                                        menuChoice = -1;
                                        playH.endGame();      //ends the game successfully
                                    }
                                    break;

                            }

                        }
                        break;
                    default:


                }//end of sport switch statement

    }   //end of main
 }//end class



