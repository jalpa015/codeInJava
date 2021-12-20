public class parseInt {
    public static void main( String[] args)
    {
        String numberAsString = "2018";
        int Integernumber = Integer.parseInt(numberAsString);
        
        Integernumber ++;

        System.out.println(Integernumber);

        // double

        String doubleAsString = "2018.234";
        double Doublenumber = Double.parseDouble(doubleAsString);
        
        Doublenumber ++;

        System.out.println(Doublenumber);
    }
    
}
