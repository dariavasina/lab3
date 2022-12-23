package garageObjects;

import java.util.Objects;

public class Wheel {
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private int speed = 0;

    public void spin() {
        speed = (int) (Math.random() * 100);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return speed == wheel.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}