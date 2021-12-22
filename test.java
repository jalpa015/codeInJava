

import java.util.Scanner;

public class test 
{
    public static void main(String[] args)
    {
        //String [][] board = new String [3][3];

        String [][] board = {   {"X", "O", "O"},
                                {"O", "X", "X"},
                                {"X", "X", "X"},};
        rowlogic(board);
        collogic(board);
        col(board);
    }

    public static  void rowlogic(String board[][])
    {
        System.out.println("Row Board");
        int count =0;
        int one=0;
        int zero=0;

        for(int i=0; i<board.length; i++)
        {
            one=0;
            zero=0;
            
            if(i == count)
            {
                for(int j=0; j< board.length; j++)
                {
                    System.out.print((i)+ ""+(j)+"\t");
                    if(board[i][j].equals("X")) 
                    {
                        one++;
                    }
                    else if(board[i][j].equals("O"))
                    {
                        zero++;
                    }

                }
                count++;
                System.out.println("\nRow " + (count));
                System.out.println("One's: " + one);
                System.out.println("Zero's: " + zero);

                
            }
            
            System.out.println("\n");
        }

        // System.out.println("One's: " + one);
        // System.out.println("Zero's: " + zero);

    }


    public static  void collogic(String board[][])
    {
        System.out.println("Win?lose logic");
        int count =0;
        int colCount = 2;

        System.out.println("Break" + colCount);

        int rowcheckX=0;
        int rowcheckZERO=0;

        int D1checkX=0;
        int D1checkZERO=0;

        int D2checkX=0;
        int D2checkZERO=0;



        for(int i=0; i<board.length; i++)
        {
            rowcheckX=0;
            rowcheckZERO=0;

            // D1checkX=0;
            // D1checkZERO=0;

            // D2checkX=0;
            // D2checkZERO=0;

            for(int j=board.length-1; j>=0; j--)
            {
                if(i == (board.length-1)-j)
                {
                    //System.out.println((i)+ ""+(j)+"R2L\t");
                    if(board[i][j].equals("X")) 
                    {
                        D1checkX++;
                    }
                    else if(board[i][j].equals("O"))
                    {
                        D1checkZERO++;
                    }
                }

                if(i == j)
                {
                    //System.out.println((i)+ ""+(j)+"L2R\t");
                    if(board[i][j].equals("X")) 
                    {
                        D2checkX++;
                    }
                    else if(board[i][j].equals("O"))
                    {
                        D2checkZERO++;
                    }
                }

                if(i == count)
                {
                    //System.out.println((i)+ ""+(j)+"ROW\t");
                    if(board[i][j].equals("X")) 
                    {
                        rowcheckX++;
                    }
                    else if(board[i][j].equals("O"))
                    {
                        rowcheckZERO++;
                    }
                }
            }
            count ++;
            
            System.out.println("\nRow " + (count));
            System.out.println("X's: " + rowcheckX);
            System.out.println("O's: " + rowcheckZERO);
            
            
        }


        // System.out.println("\nRow " + (count));
        // System.out.println("X's: " + rowcheckX);
        // System.out.println("O's: " + rowcheckZERO);


        System.out.println("\nD1 " );
        System.out.println("X's: " + D1checkX);
        System.out.println("O's: " + D1checkZERO);


        System.out.println("\nD2 " + (count));
        System.out.println("X's: " + D2checkX);
        System.out.println("O's: " + D2checkZERO);
        

    }

    public static  void col(String board[][])
    {
        System.out.println("Column logic");
        int count =0;
        int colcheckX=0;
        int colcheckZERO=0;

        for(int i=(board.length-1); i>=0; i--)
        {
            for(int j=0; j<board.length; j++)
            {
                if(i==((board.length-1) - i))
                {
                    System.out.print((i)+ ""+(j)+"\t");
                        if(board[i][j].equals("X")) 
                        {
                            colcheckX++;
                        }
                        else if(board[i][j].equals("O"))
                        {
                            colcheckZERO++;
                        }
                }
                //System.out.print((i)+ ""+(j)+"\t");
                
            }
            count++;
            System.out.println("\n");
        }

        System.out.println("\nCol " + (count));
            System.out.println("X's: " + colcheckX);
            System.out.println("O's: " + colcheckZERO);
    }







        public static  void logic(String board[][])
    {
        System.out.println("Main Board");

        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j< board.length; j++)
            {
                board[i][j] = "X";
                //System.out.print((i)+ ""+(j)+"\t");
                System.out.println(board[i][j] + "\n");
            }
            System.out.println("\n");
        }

    }



}


