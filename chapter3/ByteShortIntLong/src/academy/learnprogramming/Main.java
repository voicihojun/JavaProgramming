package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    int myValue = 10000;

	    int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Min Value = " + myMinIntValue);
        System.out.println("Integer Max Value = " + myMaxIntValue);
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1));
        System.out.println("Busted Min Value = " + (myMinIntValue - 1));
        int testIntNum = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Min Value = " + myMinByteValue);
        System.out.println("Byte Max Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min Value = " + myMinShortValue);
        System.out.println("Short Max Value = " + myMaxShortValue);

        long myLongValue = 2_147_483_647_111L;
        // putting L is necessary. because Normally, the computer think that it's a integer.
        // for caculating, they always change primitive type to integer so that the calcuating is faster.
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("long Min Value = " + myMinLongValue);
        System.out.println("long Max Value = " + myMaxLongValue);

        int myTotal = myMinIntValue / 2;

        byte myNewByteValue = (byte) (myMinByteValue / 2);
        // for dividing myMinByteValue, the computer changed it into integer.
        // So, we need to cast it as byte. if not, red line!!!
    }
}
