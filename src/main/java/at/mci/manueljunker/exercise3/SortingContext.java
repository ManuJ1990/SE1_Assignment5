package at.mci.manueljunker.exercise3;

/**
 * The context class that manages sorting strategies.
 */
public class SortingContext {
    private SortingStrategy strategy;

    /**
     * Constructor to initialize the sorting strategy.
     *
     * @param strategy The sorting strategy to be used.
     */
    public SortingContext(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Sorts the array using the assigned sorting strategy.
     *
     * @return The sorted array.
     */
    public int[] sort() {
        return strategy.sortArray();
    }
}