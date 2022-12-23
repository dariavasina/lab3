package garageObjects;

import exceptions.DriverIsNotAnOwnerException;
import people.Human1;

import java.util.ArrayList;
import java.util.Objects;

public class Car {
    Human1 owner;
    Engine engine = new Engine();
    ArrayList<Wheel> wheels = new ArrayList<Wheel>();

    public Car(Human1 owner, int wheelNumber) {
        this.owner = owner;
        for (int i = 0; i < wheelNumber; i++) {
            wheels.add(new Wheel());
        }
        System.out.printf("Машина с %d колесами создана\n", wheelNumber);
    }

    public void go(Human1 driver) throws DriverIsNotAnOwnerException {
        if (!Objects.equals(driver, owner)) {
            throw new DriverIsNotAnOwnerException();
        }
        else {
            engine.start();
            for (Wheel wheel : wheels) {
                wheel.spin();
            }
        }
    }

    public void finish() {
        engine.stop();
    }

    public class Engine {
        public void start() {
            System.out.println("Двигатель заведен");
        }
        public void stop() {
            System.out.println("Двигатель выключен");
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Car car = (Car) object;
        return owner.equals(car.owner) && engine.equals(car.engine) && wheels.equals(car.wheels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, engine, wheels);
    }
}
