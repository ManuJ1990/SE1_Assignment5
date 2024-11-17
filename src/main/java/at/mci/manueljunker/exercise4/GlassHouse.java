package at.mci.manueljunker.exercise4;

/**
 * Class representing the construction of a Glass House.
 */
public class GlassHouse extends HouseTemplate {
    @Override
    public void buildWalls() {
        System.out.println("Baue Wände aus Glas");
    }

    @Override
    public void placeRoof() {
        System.out.println("Platziere das Glasdach");
    }
}
