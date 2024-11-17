package at.mci.manueljunker.exercise2;

/**
 * Represents a TV station that acts as an observer of the NewsAgency.
 * Receives and broadcasts news updates from the NewsAgency.
 */
public class TVStation extends NewsOutlet {
    /**
     * Constructor to create a TV station with a specific name.
     *
     * @param name The name of the TV station.
     */
    public TVStation(String name) {
        super(name);
    }

    /**
     * Receives a news update and prints it in the context of a TV station.
     *
     * @param news The news update received from the NewsAgency.
     */
    @Override
    public void update(String news) {
        System.out.println("TV-Sender " + name + " sendet: " + news);
    }
}
