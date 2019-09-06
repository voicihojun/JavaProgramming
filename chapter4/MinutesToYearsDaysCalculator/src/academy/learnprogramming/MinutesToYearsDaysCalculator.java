package academy.learnprogramming;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long days = minutes / 60 / 24;
            long years = days / 365;
            long remainingDays = days % 365;
            String result = minutes + " min = " + years + " y and " + remainingDays + " d";

            System.out.println(result);
        }
    }
}
