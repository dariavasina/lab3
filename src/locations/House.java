package locations;

import furniture.Door;
import people.Human1;

public class House extends Location1 {
    private Door door = new Door();
    public House(String name) {
        super(name);
    }

    public Door getDoor() {
        return door;
    }

    @Override
    public void addPersonInLocation(Human1 human) {
        super.addPersonInLocation(human);
        System.out.printf("%s зашел в %s\n", human.getName(), this.getName());
    }
}
