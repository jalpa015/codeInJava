import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args)
    {
        String [] items = {"ROCK", "PAPER", "SCISSORS"};
        Scanner scan = new Scanner(System.in);

        String userEntry = "S";
        String computerEntry;

        if(wantPlay(scan))
        {
            System.out.println("\n");
            for(int i = 0; i<items.length; i++)
            {
                System.out.print(items[i] + " ");
            }
            System.out.println("\n");
            
            System.out.print("You chose: ");
            System.out.println("Enter your pick\n");
            userEntry = scan.next();
            System.out.println(userEntry);
            System.out.println("\nThe Computer chose: " + getRandom(items));
        }
        else{
            System.out.println("\nMay be some other time! Bye!\n");
        }
        scan.close();
    }

    public static String getRandom(String [] items)
    {
        //accepts the Array as parameter
        int randomItem = (int) (Math.random() * 3);
        return items[randomItem];
    }

    public static boolean wantPlay(Scanner scan)
    {
        //Returns the True or false
        // based on user response whether they want to play or Not
//        Scanner play = new Scanner(System.in);
        String response;
        System.out.println("\n\t***Rock Paper Scissors***\n\n");
        System.out.println("Let\'s play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.");
        System.out.print("Are you ready? Type 'Y' or 'y' if you are ");
        response  = scan.next();
//        play.close();

        if((response.equals("Y")) || (response.equals("y")))
        {
            return true;
        }
        return false;
    }
}
