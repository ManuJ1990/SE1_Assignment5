package at.mci.manueljunker.exercise2;

/**
 * Represents a website that acts as an observer of the NewsAgency.
 * Receives and updates news articles from the NewsAgency.
 */
public class Website extends NewsOutlet {

    /**
     * Constructor to create a website with a specific name.
     *
     * @param name The name of the website.
     */
    public Website(String name) {
        super(name);
    }

    /**
     * Receives a news update and prints it in the context of a website.
     *
     * @param news The news update received from the NewsAgency.
     */
    @Override
    public void update(String news) {
        System.out.println("Website " + name + " aktualisiert mit: " + news);
    }
}
