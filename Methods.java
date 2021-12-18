public class Methods
{
    public static void main(String[] args)
    {
        System.out.println("Learning Methods in Java!");

        int a = 30;
        int b = 20;

        int result = calculate(a, b);
        System.out.println("Result: " + result);
    }


    public static int calculate(int x, int y) 
    {
        return x + y;
    }

}
