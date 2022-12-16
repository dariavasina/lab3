package furniture;

import interfaces.DependingOnTheButton;
import locations.Location1;

public class Pantry extends Furniture implements DependingOnTheButton {
    private boolean isClosed = true;

    public Pantry(String name, Location1 room) {
        super(name, room);
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void changeStatus() {
        if (isClosed) {
            System.out.printf("%s открылась\n", getName());
        }
        else {
            System.out.printf("%s закрылась\n", getName());
        }
        isClosed = !isClosed;
    }
}
