import java.util.Objects;

public class Booking {
    public Room room;
    private Guest guest;
    public String name;

    public Booking(Room room, Guest guest, String name) {
        this.room = room;
        this.guest = guest;
        this.name = name;
    }

    public int bookingPriceS(int people) {
        return people * 150;
    }

    public int bookingPriceL(int people) {
        return people * 200;
    }
}