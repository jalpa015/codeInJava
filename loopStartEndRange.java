import java.util.Scanner;

public class loopStartEndRange
{
    public static void main(String[] args)
    {
        int start, jump, end;
        Scanner scan = new Scanner(System.in);

        System.out.print("1. Pick the Starting number: ");
        start = scan.nextInt();

        System.out.print("2. Pick the Jumping number: ");
        jump = scan.nextInt();

        System.out.print("3. Pick the Ending number: ");
        end = scan.nextInt();

        printRange(start, jump, end);

        scan.close();

    }

    public static void printRange(int start, int jump, int end)
    {
        for(int i=start; i<=end; i+=jump)
        {
            System.out.print(i + " ");
        }
        System.out.println("");
    }




}

