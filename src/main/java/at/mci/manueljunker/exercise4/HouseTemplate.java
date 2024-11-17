package at.mci.manueljunker.exercise4;

/**
 * Abstract class representing a template for building houses.
 * Uses the Template Method Pattern to ensure the order of construction steps.
 */
public abstract class HouseTemplate {

    /**
     * Template method defining the steps for building a house.
     * Final to prevent overriding.
     */
    public final void buildHouse() {
        layFoundation();
        buildWalls();
        placeRoof();
        installDoorsAndWindows();
        System.out.println("Hausbau abgeschlossen");
    }

    // Steps to be implemented by subclasses
    public abstract void buildWalls();
    public abstract void placeRoof();

    /**
     * Step for laying the foundation. Common for all houses.
     */
    private void layFoundation() {
        System.out.println("Lege das Fundament für das Haus");
    }

    /**
     * Step for installing doors and windows. Common for all houses.
     */
    private void installDoorsAndWindows() {
        System.out.println("Installiere Türen und Fenster");
    }
}
