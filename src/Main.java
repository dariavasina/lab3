import enums.Mood;
import locations.*;
import furniture.*;
import people.*;
import garageObjects.Car;

public class Main {
    public static void main(String[] args) {
        Location1 street = new Street("Зеленая улица");
        Location1 yard = new Yard("Двор Шурупчика");
        House house = new House("Дом Шурупчика");
        Room1 room = new Room1("Комната Шурупчика");
        Garage garage = new Garage("Гараж Шурупчика");

        Mite1 Screw = new Mite1("Шурупчик", street);
        Mite1 Bagel = new Mite1("Бублик", street);
        Mite1 Cog = new Mite1("Винтик", street);
        Mite1 Rabbet = new Mite1("Шпунтик", street);

        Car car = new Car(Screw, 6);
        Hammock hammock = new Hammock("Гамак", Screw);
        Furniture table1 = new Table("Деревянный стол", room);
        Furniture table2 = new Table("Круглый стол", room);
        Furniture chair1 = new Chair("Черный стул", room);
        Furniture chair2 = new Chair("Белый стул", room);
        Furniture chair3 = new Chair("Синий стул", room);
        Furniture shelf1 = new Shelf("Полка для журналов", room);
        Furniture shelf2 = new Shelf("Полка для книг", room);
        Furniture wardrobe = new Wardrobe("Шкаф с воздушными змеями", room);
        Furniture pantry = new Pantry("Кладовушка для старых изобретений", room);

        Reader reader = new Reader("Читатель");

        Bagel.enterLocation(yard);
        Cog.enterLocation(yard);
        Rabbet.enterLocation(yard);

        Bagel.pressButton(house.getDoor().getButton());
        Bagel.enterLocation(house);
        Cog.enterLocation(house);
        Rabbet.enterLocation(house);
        Bagel.pressButton(house.getDoor().getButton());

        Bagel.enterLocation(room);
        Cog.enterLocation(room);
        Rabbet.enterLocation(room);

        Screw.lieInTheHammock();

        Cog.wantToSeatDown();
        Rabbet.wantToSeatDown();
        Screw.pressButton(chair1.getButton());
        Screw.pressButton(chair2.getButton());
        Cog.seat(chair1);
        Rabbet.seat(chair2);

        Screw.pressButton(hammock.getButton());
        Screw.walk();
        reader.setEmotions(Mood.AMAZED);
        Screw.inviteGuests(room);

        Screw.pressButton(house.getDoor().getButton());
        Bagel.enterLocation(yard);
        Cog.enterLocation(yard);
        Rabbet.enterLocation(yard);

        Screw.pressButton(garage.getDoor().getButton());
        Bagel.enterLocation(garage);
        Cog.enterLocation(garage);
        Rabbet.enterLocation(garage);

        Screw.drive(car);
    }
}