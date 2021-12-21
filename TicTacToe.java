import java.util.Scanner;

public class TicTacToe 
{
    public static void main(String[] args)
    {
        String [][] board = new String [3][3];
        String [] gamePlayers = new String[4];

        int [] checkArray = {1,2,3,4,5,6,7,8,9};

        int value = 0;

        printINRO();
        createBoard(board);

        userName(gamePlayers);

        for(int i=0; i<checkArray.length; i++)
        {
            if(!(checkArray[i] % 2 == 0))
            {
                do
                {
                    value = 0;
                    System.out.println("\nTurn: " + gamePlayers[0]);
                    value = userEntry(board,gamePlayers[2], checkArray);
                    printBoard(board);
                } while(value == 20);

                

                
            }
            else
            {
                do
                {
                    value = 0;
                    System.out.println("\nTurn: " + gamePlayers[1]);
                    value = userEntry(board,gamePlayers[3],checkArray);
                    printBoard(board);
                } while(value == 20);

            }

        }  
        
    }


    public static void printINRO()
    {
        System.out.println("\n");
        System.out.println("\t\tWelcome to Tic Tac Toe Game");
        System.out.println("\t\t***************************\n");

        System.out.println("\n");
        System.out.println("Let's Play");

        System.out.println("User1: X  and Us\n");
    }

    public static void createBoard(String[][] board)
    {
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board.length; j++)
            {
                board[i][j] = "_";
                System.out.print("\t" + board[i][j] + "\t");
            }
            System.out.println("\n\n");
        }
    }


    public static void userName(String gamePlayers[])
    {
        Scanner names = new Scanner(System.in);
        for(int i=0; i<2; i++)
        {
            System.out.print("Player"+(i+1)+" :");
            gamePlayers[i] = names.nextLine();

            System.out.println(gamePlayers[i]);
        }

        int checkSymbol =0;

        // System.out.println(gamePlayers[0]);
        System.out.println("\n" + gamePlayers[0] + " Choose your Sysmbol: ");
        System.out.println("\t• 1: X");
        System.out.println("\t• 2: O");
        checkSymbol  = names.nextInt();

        if(checkSymbol == 1) 
        {
            gamePlayers[2] = "X";
            gamePlayers[3] = "O";
            System.out.println("\nPlayer Name: " + gamePlayers[0] + "\t Symbol: " + gamePlayers[2]);
            System.out.println("Player Name: " + gamePlayers[1] + "\t Symbol: " + gamePlayers[3]);
        }
        else
        {
            gamePlayers[3] = "X";
            gamePlayers[2] = "O";

            System.out.println("\nPlayer Name: " + gamePlayers[0] + "\t Symbol: " + gamePlayers[2]);
            System.out.println("\nPlayer Name: " + gamePlayers[1] + "\t Symbol: " + gamePlayers[3]);
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


    // public static int checkInteger(String input)
    // {
    //     int flag = 10;

    //     for(int i=0; i < input.length(); i++)
    //     {
    //         if( i==0 && input.charAt(i) == '_')
    //         {
    //             continue;
    //         }

    //         if( !Character.isDigit(input.charAt(i)))
    //         {
    //             flag = 20;
    //         }

    //     }
    //     return flag;

    // }

    public static int userEntry(String[][] board, String sym, int checkArray[])
    {
        Scanner userInput = new Scanner(System.in);
        int entry;
        int signal = 0;


        do
        {
            System.out.print("Enter location number ( 1 - 9): ");
            entry = userInput.nextInt();
            
        } while (!(entry >= 1 && entry <= 9) && checkArray[entry-1] != 0) ;

        if(checkArray[entry-1] == 0)
        {
            signal = 20;
        }
        
        else
        {
            signal = 10;
            
        }

        if(signal == 10)
        {
            checkArray[entry-1] = 0;
        }



        for(int j=0; j<checkArray.length; j++)
        {
            System.out.print(checkArray[j]);
        }
        System.out.println("\n");


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

        return signal;

    }

}
