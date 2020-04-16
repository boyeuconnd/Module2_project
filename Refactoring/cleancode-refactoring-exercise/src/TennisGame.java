public class TennisGame {


    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        String score ="";
        if (scorePlayer1==scorePlayer2) //Draw Score case
        {
            score = drawScoreCall(scorePlayer1);
        }
        else if (scorePlayer1>=4 || scorePlayer2>=4) //One of player get advantage
        {
            score = lateMatchResultCall(scorePlayer1, scorePlayer2);
        }
        else //Beginning match points
        {
            score = beginScoreCall(scorePlayer1, scorePlayer2);
        }
        return score;
    }

    public static String beginScoreCall(int scorePlayer1, int scorePlayer2) {
        int tempScore;
        String score="";

        final int LOVE = 0;
        final int FIFTEEN = 1;
        final int THIRTY = 2;
        final int FORTY = 3;
        for (int point = 1; point<3; point++)
        {
            if (point== 1) tempScore = scorePlayer1;
            else { score+="-"; tempScore = scorePlayer2;}

            switch(tempScore)
            {
                case LOVE:
                    score+="Love";
                    break;
                case FIFTEEN:
                    score+="Fifteen";
                    break;
                case THIRTY:
                    score+="Thirty";
                    break;
                case FORTY:
                    score+="Forty";
                    break;
            }
        }
        return score;
    }

    public static String lateMatchResultCall(int scorePlayer1, int scorePlayer2) {
        String score;
        final int PLAYER1_ADVANTAGE = 1;
        final int PLAYER2_ADVANTAGE = -1;
        final int PLAYER1_WIN = 2;
        int scoreDifference = scorePlayer1-scorePlayer2;

        if (scoreDifference == PLAYER1_ADVANTAGE) score ="Advantage player1";
        else {

            if (scoreDifference == PLAYER2_ADVANTAGE) score ="Advantage player2";
            else {

                if (scoreDifference>= PLAYER1_WIN) score = "Win for player1";
                else score ="Win for player2";
            }
        }
        return score;
    }

    public static String drawScoreCall(int playerScore) {
        String drawResultCall;
        final int LOVE = 0;
        final int FIFTEEN = 1;
        final int THIRTY = 2;
        final int FORTY = 3;
        switch (playerScore)
        {
            case LOVE:
                drawResultCall = "Love-All";
                break;
            case FIFTEEN:
                drawResultCall = "Fifteen-All";
                break;
            case THIRTY:
                drawResultCall = "Thirty-All";
                break;
            case FORTY:
                drawResultCall = "Forty-All";
                break;
            default:
                drawResultCall = "Deuce";
                break;

        }
        return drawResultCall;
    }
}
