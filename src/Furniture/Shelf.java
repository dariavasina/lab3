package Furniture;

import Interfaces.DependingOnTheButton;
import Location.Location;

public class Shelf extends Furniture implements DependingOnTheButton {
    private boolean isFolded = true;
    public Shelf(String name, Location room) {
        super(name, room);
        System.out.printf("%s создана\n", name);
    }

    public boolean isFolded() {
        return isFolded;
    }

    public void changeStatus() {
        if (isFolded) {
            isFolded = false;
            System.out.printf("%s откинулась\n", getName());
        }
        else {
            isFolded = true;
            System.out.printf("%s сложилась\n", getName());
        }
    }
}
