import java.util.Scanner; // import the scanne to get the input from user

public class ReadingUserInput {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Scanner is the type of the variable Scan
        // Scan is the variable
        // A new scanner value from (system.in)

        System.out.println("Enter your Year of Birth: ");
        int BirthYear = scan.nextInt();
        
        System.out.println("Your Year of Birth is " + BirthYear);

        /*
            Before you start this workbook, I need to warn you about the: "nextLine() trap".
            nextLine() gets "skipped" if you put it ahead of nextInt() , nextDouble(), nextLong(). 
            
            You can expect this behaviour when you try to pick up the username.
            
            You will understand why this happens when we cover Delimiters in the next section 
            (Booleans and Conditionals).
            
            The solution is to add a throwaway nextLine() before the "real" nextLine().

        */

        scan.nextLine(); // handle next line character (enter key)
        // without this, you won't get prompt for the name

        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        
        System.out.println("Your name is " + name);

        scan.close();


        


    }
    
}
