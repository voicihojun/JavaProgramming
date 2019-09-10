package academy.learnprogramming;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if(number < 0) {
            return -1;
        }

        String strNumber = Integer.toString(number);
        String[] array = strNumber.split("");

        int sum = 0;
        sum = Integer.parseInt(array[0] )+ Integer.parseInt(array[array.length - 1]);
        return sum;
    }
}
