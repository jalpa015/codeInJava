public class BuiltInFunctions {
    public static void main(String [] args)
    {
        // Math.sin
        double sine = Math.sin(1.2);
        System.out.println("The sin of 1.2 is " + sine);

        // Math.pow 
        double power = Math.pow(2, 4);
        System.out.println("The 2 to the power 4 is " + power);

        // Random Number
        double randomNumber = Math.random() * 5;
        System.out.println("The Random number is " + randomNumber);

        // random number from double to int
        // in specific range
        randomNumber++; // this will add one to the random number to include the last value as well

        //randomNumber = (int) randomNumber;

        System.out.println("The Random number (in Int) is " + (int) randomNumber);





    }
}
