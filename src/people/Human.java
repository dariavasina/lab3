package people;

import furniture.Button;

public abstract class Human {
    private String name;
    private int height;

    public Human(String name) {
        setName(name);
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public abstract void stretchOutOnTheFloor();

    public abstract void walk();

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Human personToCompare = (Human) obj;
        return this.hashCode() == personToCompare.hashCode();
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return getName();
    }

}