package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
// my version
//    public static void main(String[] args) {
//
//        System.out.println("what is the array size: \n");
//        Scanner input = new Scanner(System.in);
//        int size = input.nextInt();
//        int[] myArray = new int[size];
//        System.out.println("enter your integers:");
//        for(int i=0; i < size; i++) {
//            myArray[i] = input.nextInt();
//        }
//        printArray(myArray);
//        int[] newArray = getIntegers(myArray);
//        printArray(sortIntegers(newArray));
//    }
//
//    public static int[] getIntegers(int[] array) {
//        return array;
//    }
//
//    public static void printArray(int[] array) {
//        System.out.println("printArray : ");
//        for(int element:array) {
//            System.out.print(element + " ");
//        }
//        System.out.println();
//    }
//
//    public static int[] sortIntegers(int[] array) {
//        System.out.println("Sorted Integer : ");
//        Arrays.sort(array);
//        return array;
//    }

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for(int i=0;i <array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        int i = 1;
        for(int element : array) {
            System.out.println("Element " + i + " contents " + element);
            i++;
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        for(int i=0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for(int i=0; i < sortedArray.length - 1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

}
