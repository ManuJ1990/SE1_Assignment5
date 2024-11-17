package at.mci.manueljunker.exercise2;

/**
 * Main class to demonstrate the use of the NewsAgency system.
 * It registers different NewsOutlets and broadcasts news updates.
 */
public class Main {
    public static void main(String[] args) {
        NewsAgency agency = NewsAgency.getInstance();

        // Create instances of various NewsOutlets
        NewsOutlet newspaper = new LocalNewspaper("Tageszeitung");
        NewsOutlet website = new Website("News Online");
        NewsOutlet tvStation = new TVStation("ORF");

        // Register outlets with the NewsAgency
        System.out.println("Registriere Medien bei der Nachrichtenagentur...");
        agency.registerObserver(newspaper);
        agency.registerObserver(website);
        agency.registerObserver(tvStation);
        System.out.println("---------------------------");

        // Broadcast news
        System.out.println("Sende neu eingetroffene Nachricht");
        agency.addNews("Trump als neuer US-Präsident");
        System.out.println("Sende neu eingetroffene Nachricht");
        agency.addNews("Chiefs schlagen die Broncos in der letzten Minute");
        System.out.println("---------------------------");

        // Unsubscribe the TV station
        agency.removeObserver(tvStation);
        System.out.println("---------------------------");

        // Broadcast more news
        System.out.println("Sende neu eingetroffene Nachricht");;
        agency.addNews("Manuel Junker gewinnt die Programmier-Weltmeisterschaft!");
    }
}
