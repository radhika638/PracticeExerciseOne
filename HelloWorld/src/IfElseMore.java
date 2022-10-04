public class IfElseMore {
    public static void main(String[] args){
        int score = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + score);

        score = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + score);
    }
    public static int calculateScore(boolean gameOver, int score, int levelComplete, int bonus){
        if(gameOver) {
            int finalScore = score + (levelComplete * bonus);
            finalScore += 2000;
            return finalScore;
        }
        else {
            return -1;
        }
    }
}
