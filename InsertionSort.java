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