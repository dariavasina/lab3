package locations;

import people.Human1;

public class Yard extends Location1 {

    public Yard(String name) {
        super(name);
    }

    @Override
    public void addPersonInLocation(Human1 human) {
        super.addPersonInLocation(human);
        System.out.printf("%s зашел во двор\n", human.getName());
    }
}
