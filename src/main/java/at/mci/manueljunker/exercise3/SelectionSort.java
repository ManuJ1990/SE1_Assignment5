package at.mci.manueljunker.exercise3;

/**
 * Implements the Selection Sort algorithm to sort an array of integers.
 */
public class SelectionSort extends SortingStrategy {

    /**
     * Constructor to initialize the numbers array.
     *
     * @param numbers The array of integers to be sorted.
     */
    public SelectionSort(int[] numbers) {
        super(numbers);
    }

    /**
     * Sorts the array using the Selection Sort algorithm.
     *
     * @return The sorted array.
     */
    @Override
    public int[] sortArray() {
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int tmp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = tmp;
        }
        return numbers;
    }
}