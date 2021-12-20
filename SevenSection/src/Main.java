public class Main {
    public static void main(String[] args)
    {
        Car nissan = new Car("Nissan",5000,2020, "Red" );
        Car dodge = new Car("Dodge",15000,2022, "Blue" );


        System.out.println(nissan.make);
        System.out.println(nissan.color);
        System.out.println(nissan.price);
        System.out.println(nissan.year);

        System.out.println("\n");

        System.out.println(dodge.make);
        System.out.println(dodge.color);
        System.out.println(dodge.price);
        System.out.println(dodge.year);
    }
    
}