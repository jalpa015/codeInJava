import java.util.Scanner;

public class countLoop {
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int userInput;
        System.out.print("Enter a +ive integer: ");
        userInput = scan.nextInt();

        for (int i = 0; i <= userInput; i++) {
            System.out.print(i + " ");
            
        }
        System.out.print("\n");

    }
}
