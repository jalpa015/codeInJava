public class casting {
    public static void main (String [] args)
    {
        int a = 10;

        // byte b = a /10;
        // result of this arithmetic will default to integer
        // integer needs more space than byte. it will give error
        byte b = (byte) (a/10);

        System.out.println(b);


    }
    
}
