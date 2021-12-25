import java.util.Scanner;

public class loopFuzzBuzz
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int start, end;

        System.out.print("Enter the Starting number: ");
        start = scan.nextInt();

        System.out.print("Enter the Ending number: ");
        end = scan.nextInt();
        
        evenODD(start, end);
    }

    public static void evenODD(int start, int end)
    {
        for(int i=start; i<=end; i++)
        {
            if(i % 5 == 0 && i % 3 == 0)
            {
                System.out.println(i + " - FizzBuzz");
            }

            else if(i % 3 == 0)
            {
                System.out.println(i + " - Fuzz");
            }

            else if(i % 5 == 0)
            {
                System.out.println(i + " - Buzz");
            }
            
        }
    }

}

