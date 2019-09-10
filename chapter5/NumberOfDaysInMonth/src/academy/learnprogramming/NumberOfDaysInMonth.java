package academy.learnprogramming;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 400 == 0) {
                return true;
            }

            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        int day = 0;
        if (isLeapYear(year)) {
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    day = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    day = 30;
                    break;
                case 2:
                    day = 29;
                    break;
            }
        } else {
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    day = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    day = 30;
                    break;
                case 2:
                    day = 28;
                    break;
            }
        }
        return day;
    }
}