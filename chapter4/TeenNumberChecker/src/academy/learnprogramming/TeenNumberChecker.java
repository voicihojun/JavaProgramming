package academy.learnprogramming;

public class TeenNumberChecker {
    public static boolean hasTeen(int first, int second, int third) {
        if(isTeen(first) || isTeen(second) || isTeen(third)) {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int teenage) {
        if(teenage >= 13 && teenage <= 19) {
            return true;
        }
        return false;
    }
}
