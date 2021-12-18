import java.math.RoundingMode;
public class SpeedConverter
{
    public static void main(String[] args)
    {
        double kilometersPerHour = 1.5;
        long result = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + "km per hour is " + result + " miles per hour");
        printConversion(kilometersPerHour);
    }

    public static long toMilesPerHour (double kilometersPerHour)
    {
        long value;
        if(kilometersPerHour < 0)
        {
            value =  -1;
        }
        else
        {
            value = Math.round(kilometersPerHour *  0.621371);
            
        }

        return value;
        

    }


    public static void printConversion (double kilometersPerHour)
    {
        long value;

        value = Math.round(kilometersPerHour *  0.621371);
        System.out.println(kilometersPerHour + " km/h = " + value + " mi/h");

    }


}