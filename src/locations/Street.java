package locations;

import people.Human1;

public class Street extends Location1 {
    public Street(String name) {
        super(name);
    }

    @Override
    public void addPersonInLocation(Human1 human) {
        super.addPersonInLocation(human);
        System.out.printf("%s вышел на улицу\n", human.getName());
    }
}
