package locations;

import furniture.Furniture;

import java.util.ArrayList;

public class Location {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location(String name) {
        setName(name);
    }

    private ArrayList<Furniture> furnitureInLocation = new ArrayList<>();

    public void addFurnitureInLocation(Furniture furniture) {
        furnitureInLocation.add(furniture);
    }

    public ArrayList<Furniture> getFurnitureInLocation() {
        return furnitureInLocation;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Location locationToCompare = (Location) obj;
        return this.hashCode() == locationToCompare.hashCode();
    }

    @Override
    public String toString() {
        return getName();
    }

}
