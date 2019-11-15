package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    int[] myArray = {1,2,3,4,5,6,7,8};
	    int[] myArray2 = {1,2,3,4,5,6,7};

	    printArray(myArray);
        printArray(myArray2);

        reverse(myArray);
        reverse(myArray2);

        printArray(myArray);
        printArray(myArray2);
    }

    public static void reverse(int[] array) {
        // on doit echanger les elements juste une fois.
        // par exemple,
        // {1,2,3,4,5}
        // on va echanger les places de 1 et 5, ensuite 2 et 4.
        // donc, on echange jusqu'a l'index 1 de mon tableau.
        // halfLength doit etre egale à 2 et j'utilise <, pas <=.
        int halfLength = array.length / 2;
        for(int i=0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    public static void printArray(int[] array) {
        System.out.println("Array Element is : ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
