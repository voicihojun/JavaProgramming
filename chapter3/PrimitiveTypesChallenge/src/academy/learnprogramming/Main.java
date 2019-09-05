package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        byte myByte = 100;
        short myShort = 200;
        int myInt = 300;
        long myLongTotal = 50000L + 10 * (myByte + myInt + myShort);
        System.out.println(myLongTotal);

        short myShortTotal = (short) (50 + 10 * (myByte + myInt + myShort));
        // we need to cast it.
    }
}
