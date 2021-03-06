package ohtu;

public class TennisGame {
    
    private int points1;
    private int points2;
    private String player1Name;
    private String player2Name;

    public TennisGame(String player1Name, String player2Name) {
        this.points2 = 0;
        this.points1 = 0;
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            points1 += 1;
        else
            points2 += 1;
    }

    public String getScore() {
 
        if (points1==points2) {
            return evenPointsToScores(points1);
        }
        
        if (points1>=4 || points2>=4) {
            return largeUnevenPointsToScores(points1, points2);
        }
    
        return smallUnevenPointsToScores(points1, points2);
    }
    
    static String pointsToScore(int points) {
        String ret = "";
        switch (points) {
            case 0:
                ret = "Love";
                break;
            case 1:
                ret = "Fifteen";
                break;
            case 2:
                ret = "Thirty";
                break;
            case 3:
                ret = "Forty";
                break;
        }
        return ret;
    }

    private String evenPointsToScores(int points1) {
        String ret;
        if (points1 >= 0 && points1 <= 3) {
            ret = pointsToScore(points1) + "-All";
        } else {
            ret = "Deuce";
        }
        return ret;
    }

    private String largeUnevenPointsToScores(int points1, int points2) {
        int diff = points1 - points2;
        if (diff == 1) {
            return "Advantage player1";
        } else if (diff == -1) {
            return "Advantage player2";
        } else if (diff >= 2) {
            return "Win for player1";
        } else {
            return "Win for player2";
        }
    }

    private String smallUnevenPointsToScores(int points1, int points2) {
        return pointsToScore(points1) + "-" + pointsToScore(points2);
   }
}