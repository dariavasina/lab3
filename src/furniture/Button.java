package furniture;

import interfaces.DependingOnTheButton;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Button button = (Button) o;
        return isPressed == button.isPressed && object.equals(button.object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isPressed, object);
    }

    @Override
    public String toString() {
        return "Кнопка на " + object.toString();
    }
}
