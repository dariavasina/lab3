package locations;

import furniture.Furniture;

import java.util.ArrayList;

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
    public int hashCode() {
        return name.hashCode();
    }

    @Override
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