package at.mci.manueljunker.exercise2;

/**
 * Subject interface that represents an entity capable of managing observers.
 */
public interface Subject {
    /**
     * Registers an observer to receive updates.
     *
     * @param observer The observer to register.
     */
    void registerObserver(Observer observer);

    /**
     * Removes an observer from receiving updates.
     *
     * @param observer The observer to remove.
     */
    void removeObserver(Observer observer);

    /**
     * Notifies all registered observers of an update.
     */
    void notifyObservers();
}
