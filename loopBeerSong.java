public class loopBeerSong
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        for(int i=9; i>0; i--)
        {
            beerSong(i);
        }
    }
    

    public static void beerSong(int i)
    {

        System.out.println(i + " bottles of the beer of the wall, " + i + " bottles of beer!");

        System.out.println("take one down, pass it around, "+ (i-1) + " bottles of the beer of the wall!");
    }
}
