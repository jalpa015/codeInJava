import java.util.Scanner;

public class JavaQuiz {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int count = 0;


        System.out.println("\n\t\tWelcome to Java Quiz!");
        System.out.println("\t\t*********************\n\n");

        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
        String ques1 = scan.nextLine();

        System.out.println("2. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
        String ques2 = scan.nextLine();

        System.out.println("3. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative\n");
        String ques3 = scan.nextLine();

        System.out.println("4. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione\n\tc) Draco Malfoy\n");
        String ques4 = scan.nextLine();

        scan.close();

        if(ques1.equals("c"))
        {
            count +=5;
        }

        if(ques2.equals("a"))
        {
            count +=5;
        }

        if(ques3.equals("d"))
        {
            count +=5;
        }

        if(ques4.equals("c"))
        {
            count +=5;
        }
        System.out.println("Score: " + count + "/20");

        if(count > 15)
        {
            System.out.println("Wow, You know your stuff!");
        }

        else if((count < 15) && (count >= 5))
        {
            System.out.println("Not Bad!");
        }
        else{
            System.out.println("Better luck next time!");
        }
        
    }
}
