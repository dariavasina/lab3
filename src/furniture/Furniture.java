package furniture;

import interfaces.DependingOnTheButton;
import locations.Location1;

import java.util.Objects;

public abstract class Furniture implements DependingOnTheButton {
    private String name;
    private Location1 room;
    private Button button = new Button(this);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Button getButton() {
        return button;
    }

    public Furniture(String name) {
        this.name = name;
    }

    public Furniture(String name, Location1 room) {
        this.name = name;
        room.addFurnitureInLocation(this);
        System.out.printf("Объект %s создан\n", name);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Furniture furniture = (Furniture) o;
        return Objects.equals(name, furniture.name) && room.equals(furniture.room) && button.equals(furniture.button);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, room, button);
    }

    @Override
    public String toString() {
        return getName();
    }
}
