package at.mci.manueljunker.exercise4;

/**
 * Class representing the construction of a Wooden House.
 */
public class WoodenHouse extends HouseTemplate {
    @Override
    public void buildWalls() {
        System.out.println("Baue Wände aus Holz");
    }

    @Override
    public void placeRoof() {
        System.out.println("Platziere das Holzdach");
    }
}
