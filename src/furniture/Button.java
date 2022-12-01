package furniture;

import interfaces.DependingOnTheButton;

public class Button {
    private boolean isPressed = false;
    private DependingOnTheButton object;

    public Button(DependingOnTheButton object) {
        this.object = object;
    }

    public DependingOnTheButton getObject(){
        return object;
    }
    public boolean isPressed() {
        return isPressed;
    }

    public void press() {
        isPressed = true;
        object.changeStatus();
    }
}
