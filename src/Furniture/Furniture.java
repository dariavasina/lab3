package Furniture;

import Interfaces.DependingOnTheButton;
import Location.Location;

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

    public void changeStatus(Furniture furniture) {

    }
}
