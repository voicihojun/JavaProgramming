package academy.learnprogramming;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if(first < 10 || second < 10) {
            return -1;
        }

        while(first !=0) {
            if(first < second) {
                int temp = first;
                first = second;
                second = temp;
            } else if(first == second) {
                break;
            } else {
                first = first - second;
            }
        }
        return first;
    }
}
