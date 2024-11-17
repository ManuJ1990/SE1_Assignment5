package at.mci.manueljunker.exercise2;

/**
 * Observer interface that represents an entity capable of receiving updates.
 */
public interface Observer {
    /**
     * Receives an update from the subject.
     *
     * @param news The news update received.
     */
    void update(String news);
}
