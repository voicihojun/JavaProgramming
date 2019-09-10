package academy.learnprogramming;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void getMinAndMax() {
        Scanner scanner = new Scanner(System.in);
        boolean isTrue = true;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(isTrue) {
            System.out.println("Enter number:");
            boolean isInt = scanner.hasNextInt();


            if(isInt) {
                int number = scanner.nextInt();

                if(number < min) {
                    min = number;
                }
                if(number > max) {
                    max = number;
                }
            } else {

                isTrue = false;
            }
            scanner.nextLine();

        }
        scanner.close();
        System.out.println("min : " + min);
        System.out.println("max : " + max);
    }

}
