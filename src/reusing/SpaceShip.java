package reusing;

/**
 * Created by zdk on 17-2-3.
 */
public class SpaceShip extends SpaceShipControls {
    private String name;

    public SpaceShip(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        SpaceShip protector = new SpaceShip("NESA Protector");
        protector.forward(100);
    }
}
