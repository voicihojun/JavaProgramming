package academy.learnprogramming;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if(number < 0) {
            return -1;
        }
        String strNumber = Integer.toString(number);
        String[] array = strNumber.split("");
        int size = strNumber.length();
        int sum = 0;
        while(size > 0) {
            int num = Integer.parseInt(array[size - 1]);
            if(num % 2 == 0) {
                sum += num;
            }
            size--;
        }
        return sum;

    }
}
