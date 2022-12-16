package furniture;

import interfaces.DependingOnTheButton;
import people.Human1;

public class Hammock extends Furniture implements DependingOnTheButton {
    private int heightAboveGround = 20;
    private Human1 person;

    public int getHeightAboveGround() {
        return heightAboveGround;
    }

    public void setHeightAboveGround(int heightAboveGround) {
        this.heightAboveGround = heightAboveGround;
    }

    public void setPerson(Human1 person) {
        this.person = person;
    }

    public Human1 getPerson() {
        return person;
    }

    public Hammock(String name, Human1 person) {
        super(name);
        this.person = person;
    }

    public void changeStatus() {
        while (getHeightAboveGround() > 0) setHeightAboveGround(getHeightAboveGround() - 1);
        person.stretchOutOnTheFloor();
        System.out.printf("Гамак опущен, %s может вылезать\n", person.getName());
    }
}
