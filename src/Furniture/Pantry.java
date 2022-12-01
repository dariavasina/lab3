package Furniture;

import Interfaces.DependingOnTheButton;
import Location.Location;

public class Pantry extends Furniture implements DependingOnTheButton {
    private boolean isClosed = true;

    public Pantry(String name, Location room) {
        super(name, room);
        System.out.printf("%s создана\n", name);
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void changeStatus() {
        if (isClosed) {
            isClosed = false;
            System.out.printf("%s открылась\n", getName());
        }
        else {
            isClosed = true;
            System.out.printf("%s закрылась\n", getName());
        }
    }
}
