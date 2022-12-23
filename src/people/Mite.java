package people;

import interfaces.AbleToPressButtons;

import furniture.Button;


public class Mite extends Human implements AbleToPressButtons {
    public final int MAX_HEIGHT = 20;

    public Mite(String name) {
        super(name);
        System.out.printf("Коротышка %s создан\n", getName());
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(Math.min(height, MAX_HEIGHT));
    }

    public void stretchOutOnTheFloor() {
        System.out.printf("%s растянулся на полу\n", getName());
    }

    @Override
    public void walk() {
        System.out.printf("%s принялся ходить\n", getName());
    }

    @Override
    public void pressButton(Button button) {
        System.out.printf("%s нажал кнопку\n", getName());
        button.press();
    }

}