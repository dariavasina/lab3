package locations;

import furniture.Door;
import people.Human1;

public class Room1 extends Room{
    private Door door = new Door();

    public Room1(String name) {
        super(name);
    }

    public Door getDoor() {
        return door;
    }

    @Override
    public void addPersonInLocation(Human1 human) {
        super.addPersonInLocation(human);
        System.out.printf("%s поднялся по небольшой каменной лестнице и зашел в комнату\n", human.getName());
    }
}
