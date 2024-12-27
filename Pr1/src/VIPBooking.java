public class VIPBooking extends Booking {
    public VIPBooking(Room room, Guest guest, String name) {
        super(room, guest, name);
    }

    @Override
    public String toString() {
        return "Welcome to the VIP room: " + name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        VIPBooking other = (VIPBooking) obj;
        return this.room.SR() % 2 == 1; // Check if the room number is odd
    }

    @Override
    public int bookingPriceS(int people) {
        return people * 275;
    }

    @Override
    public int bookingPriceL(int people) {
        return people * 350;
    }
}