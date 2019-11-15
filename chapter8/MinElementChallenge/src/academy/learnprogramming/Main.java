package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("how many int do you want to put in the array : ");
        int capacity = scan.nextInt();
        int[] createdArray = readIntengers(capacity);
        int minimum = findMin(createdArray);
        System.out.println("Min in this array is " + minimum);
    }

    public static int[] readIntengers(int count) {
        int[] myArray = new int[count];
        System.out.println("enter int: ");

        for(int i = 0; i < count; i++) {
            myArray[i] = scan.nextInt();
        }
        System.out.println("myArray is : ");
        for(int i = 0; i < count; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        return myArray;
    }

    public static int findMin(int[] array) {
        int min = array[0]; //Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }


}
