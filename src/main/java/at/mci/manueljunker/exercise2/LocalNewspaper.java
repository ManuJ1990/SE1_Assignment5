package at.mci.manueljunker.exercise2;

/**
 * Represents a local newspaper that acts as an observer of the NewsAgency.
 * Receives and publishes news updates from the NewsAgency.
 */
public class LocalNewspaper extends NewsOutlet {
    /**
     * Constructor to create a local newspaper with a specific name.
     *
     * @param name The name of the newspaper.
     */
    public LocalNewspaper(String name) {
        super(name);
    }

    /**
     * Receives a news update and prints it in the context of a local newspaper.
     *
     * @param news The news update received from the NewsAgency.
     */
    @Override
    public void update(String news) {
        System.out.println("Lokale Zeitung " + name + " veröffentlicht: " + news);
    }
}