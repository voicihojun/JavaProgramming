package academy.learnprogramming;

public class LeapYearCalculator {
    public static boolean isLeapYear(int year) {

        boolean isItLeapYear = false;

        if(year >= 1 && year <= 9999) {
            if(year % 4 == 0) { // step 1 pass -> step 2, or step 5
                if(year % 100 == 0) { // step 2 pass -> step 3, or step 4
                    if(year % 400 == 0) { // step 3
                        isItLeapYear = true;
                    }
                } else {  // step 4
                    isItLeapYear = true;
                }
            } else {  // step 5
                isItLeapYear = false;
            }
        } else {
            isItLeapYear = false;
        }
        return isItLeapYear;
    }
}
