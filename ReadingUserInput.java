import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Year of Birth: ");
        int BirthYear = scanner.nextInt();
        
        System.out.println("Your Year of Birth is " + BirthYear);

        scanner.nextLine(); // handle next line character (enter key)
        // without this, you won't get prompt for the name



        
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("Your name is " + name);

        scanner.close();


        


    }
    
}
