package academy.learnprogramming;

import java.util.Scanner;

public class ReadingUserInput {
    public static int getSumOfUserInput() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;

        while(counter < 10) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ": ");

            boolean isInt = scanner.hasNextInt();
            if(isInt) {
                int number = scanner.nextInt();
                sum += number;
                counter++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
    return sum;
    }
}
