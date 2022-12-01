package Furniture;

import Interfaces.DependingOnTheButton;
import Location.Location;

public class Wardrobe extends Furniture implements DependingOnTheButton {
    private boolean isClosed = true;

    public Wardrobe(String name, Location room) {
        super(name, room);
        System.out.printf("%s создан\n", name);
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void changeStatus() {
        if (isClosed) {
            isClosed = false;
            System.out.printf("%s открылся\n", getName());
        }
        else {
            isClosed = true;
            System.out.printf("%s закрылся\n", getName());
        }
    }
}
