/**
 * Created by Frank Hall on 6/25/2016.
 */
public class PremiumSugarSmashPlayer extends SugarSmashPlayer // child of SugarSmashPlayer
{
    public PremiumSugarSmashPlayer()// constructor using a different amount of array elements
    {
        highScore= new int[40];
    }

    @Override
    public int getHighScore(int level)// overridden get high score, it uses this highscore when a new instance of PremiumSugarSmashPlayer is created..
    {
        int score = 0;

        if(level < 1 || level > 40)
            System.out.println("Invalid level");

        else
            score = highScore[level-1];

        return score;
    }

    @Override
    public void setHighScore(int score, int level) // overridden get high score, it uses this highscore when a new instance of PremiumSugarSmashPlayer is created..
    {
        int previousLevel = 0;

        if(level == 1)
        {
            highScore[level-1] = score;
        }

        else
        {
            previousLevel = highScore[level-2];

            if(previousLevel < 100)
                System.out.println("Did not achieve 100 pts on previouslevel. Score not set");

            else
                highScore[level-1] = score;
        }
    }
}
