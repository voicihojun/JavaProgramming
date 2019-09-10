package academy.learnprogramming;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if(bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int portion = goal / 5;
        int remainder = goal % 5;
        if(portion <= bigCount) {
            if(remainder <= smallCount) {
                return true;
            } else {
                return false;
            }
        } else {
            if((portion - bigCount) * 5 + remainder <= smallCount) {
                return true;
            } else {
                return false;
            }
        }
    }
}
