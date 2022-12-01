package locations;

public class Room extends Location {
    public Room(String name) {
        super(name);
        System.out.printf("%s создана\n", name);
    }

}
