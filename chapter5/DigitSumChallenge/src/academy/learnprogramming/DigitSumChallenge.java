package academy.learnprogramming;

public class DigitSumChallenge {
    public static int sumDigit(int number) {
        if(number < 10) {
            return -1;
        }

        int sum = 0;
        while(number >= 10) {

            int remainingNumber = number % 10;
            number = number / 10;
            sum += remainingNumber;
        }

        sum += number;

        return sum;
    }
}
