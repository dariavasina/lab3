package locations;

import furniture.Furniture;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Location {
    private String name;

    public Location(String name) {
        this.name = name;
        System.out.printf("Локация %s создана\n", name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private ArrayList<Furniture> furnitureInLocation = new ArrayList<>();

    public void addFurnitureInLocation(Furniture furniture) {
        furnitureInLocation.add(furniture);
    }

    public ArrayList<Furniture> getFurnitureInLocation() {
        return furnitureInLocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return name.equals(location.name) && Objects.equals(furnitureInLocation, location.furnitureInLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, furnitureInLocation);
    }

    @Override
    public String toString() {
        return getName();
    }

}