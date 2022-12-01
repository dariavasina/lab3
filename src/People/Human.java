package People;

public abstract class Human {
    private String name;
    private int height;

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

    public void stretchOutOnTheFloor() {
        System.out.printf("%s растянулся на полу\n", getName());
    }

    public void walk() {
        System.out.printf("%s принялся ходить\n", getName());
    }

}
