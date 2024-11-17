package at.mci.manueljunker.exercise3;

/**
 * Abstract class representing a sorting strategy.
 */
public abstract class SortingStrategy {
    protected int[] numbers;

    /**
     * Constructor to initialize the numbers array.
     *
     * @param numbers The array of integers to be sorted.
     */
    public SortingStrategy(int[] numbers) {
        this.numbers = numbers;
    }

    /**
     * Abstract method to sort the array.
     *
     * @return The sorted array.
     */
    public abstract int[] sortArray();
}
