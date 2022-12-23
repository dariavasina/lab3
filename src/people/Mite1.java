package people;

import exceptions.CannotEnterAClosedLocationException;
import exceptions.DriverIsNotAnOwnerException;
import furniture.Furniture;
import interfaces.AbleToPressButtons;

import furniture.Button;
import locations.House;
import locations.Location1;
import garageObjects.Car;

import java.util.ArrayList;


public class Mite1 extends Human1 implements AbleToPressButtons {
    public final int MAX_HEIGHT = 20;

    public Mite1(String name, Location1 location) {
        super(name, location);
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

    public void inviteGuests(Location1 room) {
        ArrayList<Furniture> furniture = room.getFurnitureInLocation();
        for (Furniture f : furniture) {
            pressButton(f.getButton());
        }
    }

    public void lieInTheHammock() {
        System.out.printf("%s, сложив кренделем ноги и глубоко засунув в карманы руки, лежит в гамаке\n", getName());
    }

    public void stretchOutOnTheFloor() {
        System.out.printf("%s растянулся на полу\n", getName());
    }

    public void wantToSeatDown() {
        System.out.printf("%s хочет присесть\n", getName());
    }

    public void walk() {
        System.out.printf("%s принялся ходить\n", getName());
    }

    public void seat(Furniture object) {
        System.out.printf("%s сел на %s\n", getName(), object.getName());
    }

    public void enterLocation(Location1 place) {
        if (place.getClass() == House.class) {
            House house = (House) place;
            if (house.getDoor().isClosed()) {
                throw new CannotEnterAClosedLocationException();
            }
            else {
                getLocation().removePersonFromLocation(this);
                place.addPersonInLocation(this);
                setLocation(place);
            }
        } else {
            getLocation().removePersonFromLocation(this);
            place.addPersonInLocation(this);
            setLocation(place);
        }
    }

    public void drive(Car car) {
        try {
            car.go(this);
            System.out.printf("%s поехал на машине\n", getName());
            System.out.printf("%s продемонстрировал езду на машине во всех положениях\n", getName());
            car.finish();
        } catch (DriverIsNotAnOwnerException e) {
            System.out.printf("%s не может управлять машиной - он не водитель\n", getName());
        }
    }
}
