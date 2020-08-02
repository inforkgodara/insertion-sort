# Insertion Sort

A simple single class implementation of insertion sort in Java. The user will be prompted to input the number of elements in a list array which they want to enter. Insertion sort is a simple sorting algorithm that builds the final sorted array one item at a time. It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort.

The insertion sorting algorithm concept is based on arranging the cards in your one hand. like, suppose when you pick up the first card that is already sorted you no need to do with that one. There are two iterations come in the picture first one picks cards and another one is shift card from right to left in ascending order and out of the inner loop the last element inserted So first outer loop runs left to right but begin from the second element of the list. Outer pointer element needs to store in a temporary variable because it overrides the inner loop while shifting.

## How to use it.
* Open a command prompt window and go to the directory where you saved the java program (InsertionSort.java).
* Type 'javac InsertionSort.java' and press enter to compile your code. If there are no errors in your code, the command prompt will take you to the next line.
* Now, type 'java InsertionSort' to run your program.
* You will be able to see an output line and asking input to enter the number of elements (integer) you want to enter.
* Next you will enter the number of elements it can be space-separated or in a new line.
* After completion of entering elements in the list, the program will show a sorted list.

## Code
```
import java.util.Scanner;

/**
 * This is an implementation of the insertion sort algorithm.
 * @author @inforkgodara
 *
 */
public class InsertionSort {

    /**
     * Insertion sort implementation.
     * @param list the array to be sorted.
     * @param length the integer size of list.
     */
    static void sort(int list[], int length) {
        for (int i = 1; i < length; ++i) { 
            int key = list[i]; 
            int j = i - 1; 
            while (j >= 0 && list[j] > key) { 
                list[j + 1] = list[j]; 
                j = j - 1; 
            } 
            list[j + 1] = key; 
        } 
    }

    public static void main(String[] args) {
        System.out.print("Enter length of list : ");
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] list = new int[length];

        for (int index = 0; index < length; index++) {
            list[index] = scanner.nextInt();
        }

        sort(list, length);

        System.out.print("Sorted list: ");

        for (int element: list) {
            System.out.print(element + " ");
        }
    }
}
```

