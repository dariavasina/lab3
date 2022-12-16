package furniture;

import interfaces.DependingOnTheButton;
import locations.Location1;

public class Shelf extends Furniture implements DependingOnTheButton {
    private boolean isFolded = true;
    public Shelf(String name, Location1 room) {
        super(name, room);
    }

    public boolean isFolded() {
        return isFolded;
    }

    public void changeStatus() {
        if (isFolded) {
            System.out.printf("%s откинулась\n", getName());
        }
        else {
            System.out.printf("%s сложилась\n", getName());
        }
        isFolded = !isFolded;
    }
}
