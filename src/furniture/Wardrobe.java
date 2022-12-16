package furniture;

import interfaces.DependingOnTheButton;
import locations.Location1;

public class Wardrobe extends Furniture implements DependingOnTheButton {
    private boolean isClosed = true;

    public Wardrobe(String name, Location1 room) {
        super(name, room);
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void changeStatus() {
        if (isClosed) {
            System.out.printf("%s открылся\n", getName());
        }
        else {
            System.out.printf("%s закрылся\n", getName());
        }
        isClosed = !isClosed;
    }
}
