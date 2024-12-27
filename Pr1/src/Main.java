import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What's your name?");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        Room r = new Room();
        Guest g = new Guest(name);
        Privacy p = new Privacy();
        Booking b;
        System.out.println(g.toString());
        System.out.println("How many people are going to be in the room? ");
        int people = g.GN();

        if (people > 5) {
            int roomsNumber = r.RN(people);
            System.out.println("You need to book " + roomsNumber + " rooms");
        }
        System.out.println("Here is the list of available rooms. Odd ones are VIP");
        r.RA();
        b = new VIPBooking(r, g, name);
        // Use overridden equals() method to check if the room is VIP
        if (b.equals(new VIPBooking(r, g, name))) {
            System.out.println(b.toString());
            if (people < 3) {
                System.out.println("Price for " + people + " people will be: " + b.bookingPriceS(people));
            } else {
                System.out.println("Price for " + people + " people will be: " + b.bookingPriceL(people));
            }
        } else {
            b = new Booking(r, g, name);
            if (people < 3) {
                System.out.println("Price for " + people + " people will be: " + b.bookingPriceS(people));
            } else {
                System.out.println("Price for " + people + " people will be: " + b.bookingPriceL(people));
            }
        }
        System.out.println("Your emergency password: " + p.hashCode());
    }
}
