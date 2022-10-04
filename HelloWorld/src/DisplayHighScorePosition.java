public class DisplayHighScorePosition {

    public static void main(String[] args){
        int position = calculateHighScorePosition(50);
        displayHighScorePosition("Test", position);
    }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000){
          return 1;
        }
        else if(playerScore >= 500){
            return 2;
        }
        else if(playerScore >= 100){
            return 3;
        }
        return 4;
    }
}
