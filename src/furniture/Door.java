package furniture;

import interfaces.DependingOnTheButton;

public class Door implements DependingOnTheButton {
    private Button button = new Button(this);

    private boolean isClosed = true;

    public Button getButton() {
        return button;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void close() {
        isClosed = true;
    }

    @Override
    public void changeStatus() {
        if (isClosed) {
            System.out.println("Дверь открыта");
        }
        else {
            System.out.println("Дверь закрыта");
        }
        isClosed = !isClosed;
    }
}