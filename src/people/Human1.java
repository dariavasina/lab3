package people;

import furniture.Furniture;
import locations.Location1;

import java.util.Objects;

public abstract class Human1 extends Human{
    private Location1 location;

    public Location1 getLocation() {
        return location;
    }

    public void setLocation(Location1 location) {
        this.location = location;
    }

    public Human1(String name, Location1 location) {
        super(name);
        this.location = location;
    }

    public abstract void wantToSeatDown();

    public abstract void seat(Furniture object);

    public abstract void enterLocation(Location1 place);
}
