package challenges;
public class MethodChallenge
{
    public static void main(String[] args)
    {
        System.out.println("Method Challenge:");
        System.out.println("----------------");
        System.out.println(" ");
        System.out.println(" ");

        String Player = "John";
        int  score = 50;
        int result = calculateHighScorePosition(score);

        displayHighScorePosition(Player, result);
    
    }
        public static void displayHighScorePosition(String Player, int position)
        {

            System.out.println(Player + " managed to get position " + position + ".");
        }

        public static int calculateHighScorePosition(int playerScore)
        {
            if(playerScore >= 1000)
            {
                return 1;
            }

            else if (playerScore >= 500 && playerScore < 1000)
            {
                return 2;
            }

            else if(playerScore >= 100 && playerScore < 500)
            {
                return 3;
            }
            else
            {
                return 4;
            }
        }

}
