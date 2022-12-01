package furniture;

import interfaces.DependingOnTheButton;
import locations.Location;

public abstract class Furniture implements DependingOnTheButton {
    private String name;
    private Location room;
    public Button button = new Button(this);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Furniture(String name, Location room) {
        setName(name);
        room.addFurnitureInLocation(this);
    }

    public void changeStatus(Furniture furniture) {}

    @Override
    public int hashCode() {
        return name.hashCode() * room.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Furniture furnitureToCompare = (Furniture) obj;
        return this.hashCode() == furnitureToCompare.hashCode();
    }

    @Override
    public String toString() {
        return getName();
    }
}
