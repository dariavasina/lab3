package Furniture;

import Interfaces.DependingOnTheButton;
import Location.Location;

public class Table extends Furniture implements DependingOnTheButton {
    private boolean isFolded = true;

    public Table(String name, Location room) {
        super(name, room);
        System.out.printf("%s создан\n", name);
    }

    public boolean isFolded() {
        return isFolded;
    }

    public void changeStatus() {
        if (isFolded) {
            isFolded = false;
            System.out.printf("%s разложен\n", getName());
        }
        else {
            isFolded = true;
            System.out.printf("%s сложен\n", getName());
        }
    }
}
