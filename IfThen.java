import javax.lang.model.util.ElementScanner6;

public class IfThen {
    public static void main(String[] args)
    {
        int check = 20;
        int myValue = 40;
        if(myValue < check)
        {
            System.out.println(myValue + " is Less than " + check);
        }

        else if (myValue > check)
        {
            System.out.println(myValue + " is greater than " + check);

        }

        else
        {
            System.out.println(myValue + " is equal to " + check);
        }


    }
}
