import java.util.Random;
import java.util.Scanner;

public class Game
{
    public static void main(String[] args) throws InterruptedException
    {
        String [][] board = new String [3][3];
        String [] gamePlayers = new String[4];

        int [] checkArray = {1,2,3,4,5,6,7,8,9};
        int winner [] = new int [2];
    

        createBoard(board);
        createPlayers(gamePlayers);
        winner[0] = selectPlayerSym(gamePlayers);
        System.out.println("\nTurn: " + gamePlayers[winner[0]]);
        printBoard(board);

        int playerSelection;
        int checkLocation=50;



        int value = winner[0];
        int test=0;

            for(int i=0; i<9; i++)
            {
                
                do
                {
                    if(checkLocation != 0)
                    {
                        value = playerTurn(gamePlayers, value);
                    }

                    else
                    {
                        playerTurn(gamePlayers, value+1);
        

                    }
                    
                    playerSelection = selectLocation(checkArray);
                    checkLocation = duplicateEntry(checkArray, playerSelection);
                }while(checkLocation == 0);
            }
    





    }
    //----------------------------------------------------------
    //------------------------Board-----------------------------
    //----------------------------------------------------------
    public static void createBoard(String board[][])
    {
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board.length; j++)
            {
                board[i][j] = "_";
            }
        }
    }

    public static void printBoard(String[][] board)
    {
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board.length; j++)
            {
                System.out.print("\t" + board[i][j] + "\t");
            }
            System.out.println("\n\n");
        }
    }

    //----------------------------------------------------------
    //---------------------Create Players-----------------------
    //----------------------------------------------------------

    public static void createPlayers(String gamePlayers[])
    {
        Scanner names = new Scanner(System.in);
        for(int i=0; i<2; i++)
        {
            System.out.print("Player"+(i+1)+" :");
            gamePlayers[i] = names.nextLine();
        }
    }

    //----------------------------------------------------------
    //-------------------Mark Selection & Toss------------------
    //----------------------------------------------------------

    public static int selectPlayerSym(String gamePlayers[]) throws InterruptedException
    {
        //returns the integer indicating index of the winner!

        int player0 = randomNumber(20);
        int player1 = randomNumber(20);
        int tossWinner;

        System.out.println("Toss!");
        for(int i=0; i<5; i++)
        {
            Thread.sleep(500);
            System.out.print(" * ");
        }
        System.out.println("\n");

        if(player0 >= player1)
        {
            System.out.println(gamePlayers[0] + " wins the toss!");
            gamePlayers[2] = "X";
            gamePlayers[3] = "O";
            System.out.println(gamePlayers[0] + " will use " + gamePlayers[2]);
            System.out.println(gamePlayers[1] + " will use " + gamePlayers[3]);
            tossWinner = 0;
        }
        else
        {
            System.out.println(gamePlayers[1] + " wins the toss!");
            gamePlayers[3] = "X";
            gamePlayers[2] = "O";
            System.out.println(gamePlayers[1] + " will use " + gamePlayers[3]);
            System.out.println(gamePlayers[0] + " will use " + gamePlayers[2]);
            tossWinner = 1;
        }

        return tossWinner;
    
    }


    //----------------------------------------------------------
    //------------------------Player Turn-----------------------------
    //----------------------------------------------------------

    public static int playerTurn(String gamePlayeString[], int number)
    {
        if(number % 2 == 0)
        {
            System.out.println("\n"+gamePlayeString[0] + "'s Turn --- >");
            number = 5;
        }
        else
        {
            System.out.println("\n"+gamePlayeString[1] + "'s Turn --- >");
            number = 6;
        }
        return number;
        
    }




    //----------------------------------------------------------
    //------------------------Ransom Number-----------------------------
    //----------------------------------------------------------

    public static int randomNumber(int number)
    {   
    
        Random rand = new Random();
        number = rand.nextInt(number+1);
        return number;
    }

    //----------------------------------------------------------
    //----------------User Location Selection-------------------
    //----------------------------------------------------------

    public static int  selectLocation(int checkArray [])
    {
        int entry;
        Scanner userInput = new Scanner(System.in);
        do
        {
            System.out.println("\n");
            System.out.print("Enter location number ( 1 - 9): ");
            availableLocations(checkArray);
            entry = userInput.nextInt();

            if(!(entry >= 1 && entry <= 9))
            {
                notice(2);          // Valid Input required
            }

        } while (!(entry >= 1 && entry <= 9));

        return entry;
    }


    //----------------------------------------------------------
    //--------------Check Duplicate Entry-----------------------
    //----------------------------------------------------------

    public static int duplicateEntry(int checkArray[], int location)
    {
        // return 0 for invalid move
        // and 10 for valid move

        int signal= 20;

        System.out.println("Location: " + location);

        if(checkArray[location-1] == 0)
        {
            availableLocations(checkArray);
            // System.out.print("Available locations:  ");
            // for(int j=0; j<9; j++)
            // {
            //     if(!(checkArray[j] == 0))
            //     {
            //         System.out.print(checkArray[j]);
            //         System.out.print(" ");
            //     }
            // }
            signal = 0;
            notice(1);
            return signal;
        }

        else
        {
            signal = 10;
            checkArray[location-1] = 0;
        }

        return signal;
    }


    //----------------------------------------------------------
    //----------------------Available Locations-----------------------
    //----------------------------------------------------------

    public static void availableLocations(int checkArray [])
    {   
    
        System.out.print("\nAvailable locations:  ");
        for(int j=0; j<9; j++)
        {
            if(!(checkArray[j] == 0))
            {
                System.out.print(checkArray[j]);
                System.out.print(" ");
            }
        }
        System.out.print("\n");
    }




    

    //----------------------------------------------------------
    //----------------------Notifications-----------------------
    //----------------------------------------------------------

    public static void notice(int number)
    {   
        switch(number)
        {
            case 1:
                System.out.print("Location not available!");
                break;
                
         case 2:
         System.out.print("Valid Input range (1 - 9) <----- Invalid Input");
                break;

            default:
                System.out.println("Invalid");
        }
    
        
    }

}