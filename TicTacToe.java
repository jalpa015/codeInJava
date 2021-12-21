import java.util.Scanner;

public class TicTacToe 
{
    public static void main(String[] args)
    {
        char[][] board = new char [3][3];

        printINRO();
        createBoard(board);
        userEntry(board);
        printBoard(board);


        //printBoard(board);
        
    }


    public static void printINRO()
    {
        System.out.println("\n");
        System.out.println("\t\tWelcome to Tic Tac Toe Game");
        System.out.println("\t\t***************************\n");
    }

    public static void createBoard(char board[][])
    {
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board.length; j++)
            {
                board[i][j] = '_';
                System.out.print("\t" + board[i][j] + "\t");
            }
            System.out.println("\n\n");
        }
    }



    public static void printBoard(char board[][])
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

    public static void userEntry(char board[][])
    {
        int entry0 = 10;
        int entry1 = 10;
        int  check = 1;

        Scanner userInput = new Scanner(System.in);

        do {
            System.out.print("Enter location 1 ( 1 - 9): ");
            entry0 = userInput.nextInt();
            System.out.print("Enter location 2 ( 1 - 9): ");
            entry1 = userInput.nextInt();
            
        } while (!(entry0 >= 1 && entry0 <= 9) && !(entry1 >= 1 && entry1 <= 9)) ;

        board[entry0][entry1] = 'X';

    }

}
