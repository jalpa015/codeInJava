import java.util.Scanner;

public class loopSecretGuess
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Guess, A number between 0 and 5. ");
        guessSecretNumber(scan);
    }

    public static void guessSecretNumber(Scanner scan)
    {
        int check;
        int index = 1;

        int randomNumber = (int) (Math.random() * 5);
        randomNumber++;
        //System.out.println(randomNumber);

        do
        {
            System.out.print("Guess (" + index + ") a number ");
            check = scan.nextInt();
              
            if(check == randomNumber)
            {
                System.out.println("Guessed in " + index + " tries.");
            }
            index++;  
            
        } while(check != randomNumber);
            
        
    }

}

