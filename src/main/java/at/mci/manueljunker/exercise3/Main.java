package at.mci.manueljunker.exercise3;

/**
 * Main class to demonstrate the sorting of an array using different sorting algorithms.
 */
public class Main {
    /**
     * Prints the sorted array with the name of the sorting algorithm used.
     *
     * @param numbers The sorted array of integers.
     * @param algorithm The name of the sorting algorithm used.
     */
    public static void printArray(int[] numbers, String algorithm) {
        System.out.println("Array nach der Sortierung mittels " + algorithm + ": ");
        for (int number : numbers) {
            System.out.print(number + ", ");
        }
        System.out.println("\n----------------------------");
    }

    /**
     * Main method to demonstrate sorting with different algorithms.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        int[] numbers = {34, 7, 23, 32, 5, 62 };
        int[] numbers1 = {34, 7, 23, 32, 5, 62 };
        int[] numbers2 = {34, 7, 23, 32, 5, 62 };

        // Sorting using Insertion Sort
        SortingContext context = new SortingContext(new InsertionSort(numbers));
        numbers = context.sort();
        Main.printArray(numbers, "InsertionSort");

        // Sorting using Selection Sort
        context = new SortingContext(new SelectionSort(numbers1));
        numbers1 = context.sort();
        Main.printArray(numbers1, "SelectionSort");

        // Sorting using Bubble Sort
        context = new SortingContext(new BubbleSort(numbers2));
        numbers2 = context.sort();
        Main.printArray(numbers2, "BubbleSort");
    }
}
