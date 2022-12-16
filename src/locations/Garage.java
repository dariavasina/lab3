package locations;

import furniture.Door;
import people.Human1;

public class Garage extends Location1 {
    private Door door = new Door() {
        @Override
        public void changeStatus(){
            if (door.isClosed()) {
                System.out.println("Дверь пополза вверх, как занавес в театре");
            }
            else {
                System.out.println("Дверь закрыта");
            }
            door.close();
        }
    };

    public Garage(String name) {
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
