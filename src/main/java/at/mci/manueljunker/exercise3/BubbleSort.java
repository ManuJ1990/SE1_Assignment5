package at.mci.manueljunker.exercise3;

/**
 * Implements the Bubble Sort algorithm to sort an array of integers.
 */
public class BubbleSort extends SortingStrategy {

    /**
     * Constructor to initialize the numbers array.
     *
     * @param numbers The array of integers to be sorted.
     */
    public BubbleSort(int[] numbers) {
        super(numbers);
    }

    /**
     * Sorts the array using the Bubble Sort algorithm.
     *
     * @return The sorted array.
     */
    @Override
    public int[] sortArray() {
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Swap the elements
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers;
    }
}
