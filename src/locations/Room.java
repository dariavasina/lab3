package locations;

public class Room extends Location1 {
    public Room(String name) {
        super(name);
        System.out.printf("%s создана\n", name);
    }

}