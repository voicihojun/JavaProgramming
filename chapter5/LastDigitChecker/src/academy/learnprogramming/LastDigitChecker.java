package academy.learnprogramming;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int first, int second, int third) {
        if(isValid(first) && isValid(second) && isValid(third)) {
            String strFirst = Integer.toString(first);
            String strSecond = Integer.toString(second);
            String strThird = Integer.toString(third);

            if(strFirst.charAt(strFirst.length() - 1) == strSecond.charAt(strSecond.length() - 1) ||
                    strSecond.charAt(strSecond.length() - 1) == strThird.charAt(strThird.length() - 1) ||
                    strThird.charAt(strThird.length() - 1) == strFirst.charAt(strFirst.length() - 1)) {
                return true;
            }
        }

        return false;

    }

    public static boolean isValid(int number) {
        if(number >= 10 && number <= 1000) {
            return true;
        }
        return false;
    }
}
