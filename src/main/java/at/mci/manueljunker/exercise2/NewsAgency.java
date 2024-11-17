package at.mci.manueljunker.exercise2;

import java.util.ArrayList;
import java.util.List;


/**
 * Represents a news agency that maintains a list of observers (NewsOutlets).
 * It allows observers to register, unregister, and receive news updates.
 */
public class NewsAgency implements Subject {
    private static NewsAgency instance;
    private List<Observer> observers;
    private String latestNews;

    /**
     * Private constructor to prevent direct instantiation.
     * Initializes the list of observers.
     */
    public NewsAgency() {
        observers = new ArrayList<>();
    }

    /**
     * Provides a singleton instance of NewsAgency.
     *
     * @return The singleton instance of NewsAgency.
     */
    public static synchronized NewsAgency getInstance() {
        if (instance == null)
            instance = new NewsAgency();

        return instance;
    }

    /**
     * Registers an observer to receive news updates.
     *
     * @param observer The observer to register.
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        System.out.println("Beobachter registriert: " + observer.getClass().getSimpleName());
    }

    /**
     * Removes an observer from receiving news updates.
     *
     * @param observer The observer to remove.
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("Beobachter entfernt: " + observer.getClass().getSimpleName());
    }

    /**
     * Notifies all registered observers of the latest news.
     */
    @Override
    public void notifyObservers() {
        System.out.println("Benachrichtige registrierte Medien...");
        for (Observer observer : observers) {
            observer.update(latestNews);
        }
    }

    /**
     * Adds a news item and notifies all observers.
     *
     * @param news The news item to add.
     */
    public void addNews(String news) {
        this.latestNews = news;
        notifyObservers();
    }
}
