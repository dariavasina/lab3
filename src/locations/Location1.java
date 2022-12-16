package locations;

import people.Human1;

import java.util.ArrayList;

public abstract class Location1 extends Location{
    public Location1(String name) {
        super(name);
        System.out.printf("Локация %s создана\n", name);
    }

    private ArrayList<Human1> peopleInLocation = new ArrayList<>();

    public void addPersonInLocation(Human1 human) {
        peopleInLocation.add(human);
    }

    public ArrayList<Human1> getPeopleInLocation() {
        return peopleInLocation;
    }

    public void removePersonFromLocation(Human1 person) {
        peopleInLocation.remove(person);
    }
}
