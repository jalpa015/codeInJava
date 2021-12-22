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
        System.out.println("Enter Player's Names: ");
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
                    if(value == 10)
                    {
                        printBoard(board);
                    }
                } while(value == 20);

                

                
            }
            else
            {
                do
                {
                    value = 0;
                    System.out.println("\nTurn:  " + gamePlayers[1]);
                    value = userEntry(board,gamePlayers[3],checkArray);
                    if(value == 10)
                    {
                        printBoard(board);
                    }
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
        System.out.println("Game Instructions:\n");
        System.out.println("Players can select location\t1\t\t2\t\t3");
        System.out.println("by choosing the number as");
        System.out.println("shown in the sample Board \t4\t\t5\t\t6");
        System.out.println("\n\t\t\t\t7\t\t8\t\t9");
        
        System.out.println("\n");

        System.out.println("Let's Play");
        System.out.println("Board has been reset\n");
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

            //System.out.println(gamePlayers[i]);
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

    public static  void gamelogic(String board[][])
    {
        System.out.println("Win?lose logic");
        int count =0;

        System.out.println("Break");

        int checkX;
        int checkZERO;

        for(int i=0; i<board.length; i++)
        {
            checkX=0;
            checkZERO=0;
            for(int j=board.length-1; j>=0; j--)
            {
                if(i == (board.length-1)-j)
                {
                    System.out.println((i)+ ""+(j)+"R2L\t");
                }

                if(i == j)
                {
                    System.out.println((i)+ ""+(j)+"L2R\t");
                }

                if(i == count)
                {
                    //System.out.println((i)+ ""+(j)+"ROW\t");
                    if(board[i][j].equals("X")) 
                    {
                        checkX++;
                    }
                    else if(board[i][j].equals("O"))
                    {
                        checkZERO++;
                    }
                }
            }
            count ++;
            System.out.println("\nRow " + (count));
            System.out.println("X's: " + checkX);
            System.out.println("O's: " + checkZERO);
            
        }

    }

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
            System.out.print("Location " + entry + " already Occupied! \n");
        }
        
        else
        {
            signal = 10;
            checkArray[entry-1] = 0;
            
        }

        if(signal == 10)
        {
            checkArray[entry-1] = 0;
            
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

        return signal;

    }

}
