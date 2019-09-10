package academy.learnprogramming;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if(number < 2) {
            return -1;
        }
        int result = 2;
        boolean isPrime = false;
        for(int i=2; i <= number; i++) {
            if(number % i == 0) {
                for(int j=2; j < i; j++) {
                    if(i % j == 0) {
                        isPrime = false;
                        break;
                    } else {
                        isPrime = true;
                    }
                }

                if((isPrime) && (i > 1)) {
                    result = i;
                }
            }
        }
        return result;
    }
}
