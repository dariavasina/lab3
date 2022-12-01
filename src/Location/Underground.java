package Location;

import Furniture.Button;
import Interfaces.DependingOnTheButton;


public class Underground extends Location implements DependingOnTheButton {
    public Button button = new Button(this);
    public Underground(String name) {
        super(name);
    }


    public void changeStatus() {
        System.out.println("Коротышка провалился в подполье!");
    }
}
