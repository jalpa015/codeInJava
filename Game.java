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
        
        //printBoard(board);

        int playerSelection;
        int checkLocation=50;


        int value = tossResult(gamePlayers);
        int checker = 0;
        int index = 0;
        
        String playerSYM = "X";

            for(int i=0; i<9; i++)
            {
                do
                {
                    if(checkLocation != 0)
                    {
                        value = playerTurn(gamePlayers, value);
                        // value will change everytime it runs Even\Odd
                        // value is not an index, DO not use as index
                        
                        if(value == 0)
                        {
                            checker = 1;
                        }
                        else
                            checker = 0;
                        
                        
                        playerSYM = gamePlayers[checker + 2];
                        printBoard(board);
                    }
                    

                    System.out.println("\t " +gamePlayers[checker] + "'s Turn <----> " + gamePlayers[checker+2]);
                    playerSelection = selectLocation(checkArray);
                    checkLocation = duplicateEntry(board, checkArray, playerSelection,playerSYM);

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

    public static int tossResult(String gamePlayers[])
    {
        //returns the integer indicating index of the winner!

        int player0 = randomNumber(20);
        int player1 = randomNumber(20);
        int tossWinner=90;

        // System.out.println("random number: " + player0);
        // System.out.println("random number: " + player1);
        
        if(player0 >= player1)
        {
            gamePlayers[2] = "X";
            gamePlayers[3] = "O";
            tossWinner = 0;
        }
        else
        {
            gamePlayers[3] = "X";
            gamePlayers[2] = "O";
            tossWinner = 1;

        }
        System.out.println("\n");
        System.out.println("******************Toss Results*******************");
        System.out.println("\t Player: \"" + gamePlayers[tossWinner] + "\" playing with sign: " + gamePlayers[tossWinner + 2]);
        System.out.println("**************************************************");

        return tossWinner;

        
    }
        


    //----------------------------------------------------------
    //------------------------Player Turn-----------------------------
    //----------------------------------------------------------

    public static int playerTurn(String gamePlayers[], int number)
    {
        if(number % 2 == 0)
        {
            //System.out.println("\n"+gamePlayers [0] + "'s Turn --- >");
            number = 1;    // this will make sure nect person will get next turn
        }
        else
        {
            //System.out.println("\n"+gamePlayers[1] + "'s Turn --- >");
            number = 0;    // this will make sure nect person will get next turn
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
            //System.out.println("\n");
            availableLocations(checkArray);
            System.out.print("Enter location number ( 1 - 9): ");
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

    public static int duplicateEntry(String board[][], int checkArray[], int location, String playerSYM)
    {
        // return 0 for invalid move
        // and 10 for valid move

        int signal= 20;

        //System.out.println("Location: " + location);

        if(checkArray[location-1] == 0)
        {
            //availableLocations(checkArray);
            signal = 0;
            notice(1);
            System.out.println("\n");
            return signal;
        }

        else
        {
            signal = 10;
            checkArray[location-1] = 0;
            configureBoard(board, location, playerSYM);

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
                System.out.println("\tLocation not available! Choose from available locations!");
                break;
                
            case 2:
                System.out.print("Valid Input range (1 - 9) <----- Invalid Input");
                break;

            default:
                System.out.print("Invalid Input");
        }
    
        
    }

    //----------------------------------------------------------
    //----------------------Configure Board---------------------
    //----------------------------------------------------------

    public static void configureBoard(String board[][], int entry, String sym)
    {
        switch(entry)
        {
            case 1:
                board[0][0] = sym;
                break;
        
            case 2:
                board[0][1] = sym;
                break;
        
            case 3:
                board[0][2] = sym;
                break;
        
            case 4:
                board[1][0] = sym;
                break;

            case 5:
                board[1][1] = sym;               
                break;
                
            case 6:
                board[1][2] = sym;
                break;

            case 7:
                board[2][0] = sym;
                break;               
                
            case 8:
                board[2][1] = sym;
                break;
                
            case 9:
                board[2][2] = sym;
                break;

            default:
                System.out.println("Invalid");
        }

    }


}