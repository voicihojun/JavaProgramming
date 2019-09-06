package academy.learnprogramming;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double decimalFirst, double decimalSecond) {
        int first = (int) (decimalFirst * 1000);
        int second = (int) (decimalSecond * 1000);
        if(first == second) {
            return true;
        }

        return false;
    }
}
