package at.mci.manueljunker.exercise2;

/**
 * Abstract class representing a news outlet that can subscribe and unsubscribe
 * to news updates from the NewsAgency. Implements the Observer interface.
 */
public abstract class NewsOutlet implements Observer {
    protected String name;

    /**
     * Constructor to create a NewsOutlet with a specific name.
     *
     * @param name The name of the news outlet.
     */
    public NewsOutlet(String name) {
        this.name = name;
    }

    /**
     * Abstract method to be implemented by subclasses to handle news updates.
     *
     * @param news The news update received.
     */
    public abstract void update(String news);

}
