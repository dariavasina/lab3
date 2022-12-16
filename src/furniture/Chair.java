package furniture;

import interfaces.DependingOnTheButton;
import locations.Location1;

public class Chair extends Furniture implements DependingOnTheButton {
    private boolean isFolded = true;

    public Chair(String name, Location1 room) {
        super(name, room);
    }

    public boolean isFolded() {
        return isFolded;
    }

    public void changeStatus() {
        if (isFolded) {
            System.out.printf("%s разложен\n", getName());
        }
        else {
            System.out.printf("%s сложен\n", getName());
        }
        isFolded = !isFolded;
    }
}
