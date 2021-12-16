public class integerValues
{
    public static void main(String[] args)
    {
        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;

        System.out.println("Integer Min Value = " + myMinValue);
        System.out.println("Integer Max Value = " + myMaxValue);
        System.out.println("Underflow Min  Value = " + (myMinValue-1));
        System.out.println("Overflow  Max Value = " + (myMaxValue+1));

        System.out.println("Another Printing Format = " + 2_147_483_647);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Min  Value = " + (myMinByteValue));
        System.out.println("Byte Max Value = " + (myMaxByteValue));

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Min  Value = " + (myMinShortValue));
        System.out.println("Short Max Value = " + (myMaxShortValue));

        long myMinlongValue = Long.MIN_VALUE;
        long myMaxlongValue = Long.MAX_VALUE;

        System.out.println("Long Min  Value = " + (myMinlongValue));
        System.out.println("Long Max  Value = " + (myMaxlongValue));
    }
}


