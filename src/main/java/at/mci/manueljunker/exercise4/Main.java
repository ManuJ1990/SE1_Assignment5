package at.mci.manueljunker.exercise4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Baue ein Holzhaus:");
        HouseTemplate woodenHouse = new WoodenHouse();
        woodenHouse.buildHouse();

        System.out.println("\nBaue ein Glashaus:");
        HouseTemplate glassHouse = new GlassHouse();
        glassHouse.buildHouse();

        System.out.println("\nBaue ein Backsteinhaus:");
        HouseTemplate brickHouse = new BrickHouse();
        brickHouse.buildHouse();
    }
}
