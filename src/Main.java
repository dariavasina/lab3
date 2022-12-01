import Location.*;
import Furniture.*;
import People.*;

public class Main {
    public static void main(String[] args) {
        Location room = new Room("Комната Шурупчика");
        Underground underground  = new Underground("Подполье");

        Furniture table1 = new Table("Cтол Шурупчика", room);

        Furniture table2 = new Table("Cтол Шпунтика", room);

        Furniture chair1 = new Chair("Стул Шурупика", room);

        Furniture chair2 = new Chair("Стул Шпунтика", room);

        Furniture shelf1 = new Shelf("Полка для журналов", room);

        Furniture shelf2 = new Shelf("Полка для книг", room);

        Furniture wardrobe = new Wardrobe("Шкаф с воздушными змеями", room);

        Furniture pantry = new Pantry("Кладовушка для старых изобретений", room);

        Mite Screw = new Mite("Шурупчик");
        Hammock hammock = new Hammock("Гамак Шурупчика", room, Screw);

        Screw.pressButton(hammock.button);
        Screw.walk();
        Screw.pressButton(table1.button);
        Screw.pressButton(table2.button);
        Screw.pressButton(chair1.button);
        Screw.pressButton(chair2.button);
        Screw.pressButton(shelf1.button);
        Screw.pressButton(shelf2.button);
        Screw.pressButton(wardrobe.button);
        Screw.pressButton(pantry.button);
        underground.changeStatus();
    }
}