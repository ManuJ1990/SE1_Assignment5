package at.mci.manueljunker.exercise4;

/**
 * Class representing the construction of a Brick House.
 */
public class BrickHouse extends HouseTemplate {

    @Override
    public void buildWalls() {
        System.out.println("Baue Wände aus Backstein");
    }

    @Override
    public void placeRoof() {
        System.out.println("Platziere das Backsteindach");
    }
}
