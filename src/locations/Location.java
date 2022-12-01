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

}
