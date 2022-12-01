package People;

import Furniture.Furniture;
import Interfaces.AbleToPressButtons;

import Furniture.Button;


public class Mite extends Human implements AbleToPressButtons {
    public final int MAX_HEIGHT = 20;

    public Mite(String name) {
        setName(name);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(Math.min(height, MAX_HEIGHT));
    }

    @Override
    public void pressButton(Button button) {
            System.out.printf("%s нажал кнопку\n", getName());
            button.press();
    }

}
