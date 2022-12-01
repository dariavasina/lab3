package furniture;

import interfaces.DependingOnTheButton;
import locations.Location;
import people.Human;

public class Hammock extends Furniture implements DependingOnTheButton {
    private int heightAboveGround = 20;
    private Human person;

    public int getHeightAboveGround() {
        return heightAboveGround;
    }

    public void setHeightAboveGround(int heightAboveGround) {
        this.heightAboveGround = heightAboveGround;
    }

    public void setPerson(Human person) {
        this.person = person;
    }

    public Human getPerson() {
        return person;
    }

    public Hammock(String name, Location room, Human person) {
        super(name, room);
        setPerson(person);
    }

    public void changeStatus() {
        while (getHeightAboveGround() > 0) setHeightAboveGround(getHeightAboveGround() - 1);
        person.stretchOutOnTheFloor();
        System.out.printf("Гамак опущен, %s может вылезать\n", person.getName());
    }
}
