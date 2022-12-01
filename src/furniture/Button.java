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

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Button buttonToCompare = (Button) obj;
        return this.hashCode() == buttonToCompare.hashCode();
    }

    @Override
    public int hashCode() {
        return object.hashCode();
    }

    @Override
    public String toString() {
        return "Кнопка на " + object.toString();
    }
}
