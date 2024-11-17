package at.mci.manueljunker.exercise3;

/**
 * Implements the Insertion Sort algorithm to sort an array of integers.
 */
public class InsertionSort extends SortingStrategy {

    /**
     * Constructor to initialize the numbers array.
     *
     * @param numbers The array of integers to be sorted.
     */
    public InsertionSort(int[] numbers) {
        super(numbers);
    }

    /**
     * Sorts the array using the Insertion Sort algorithm.
     *
     * @return The sorted array.
     */
    @Override
    public int[] sortArray() {
        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j = j - 1;
            }
            numbers[j + 1] = key;
        }
        return numbers;
    }
}