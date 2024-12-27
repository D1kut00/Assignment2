import java.util.TreeSet;
import java.util.Scanner;
import java.util.Random;

public class Room {
    int RN(int people) {
        int roomsNeeded = Math.round(people / 5);
        return roomsNeeded;
    }

    int SR() {
        Scanner scanner = new Scanner(System.in);
        int roomNumber = scanner.nextInt();
        return roomNumber;
    }

    void RA() {
        int totalRooms = 20;
        int maxRoomNumber = 43;
        TreeSet<Integer> uniqueNumbers = new TreeSet<>();
        Random random = new Random();

        while (uniqueNumbers.size() < totalRooms) {
            uniqueNumbers.add(random.nextInt(maxRoomNumber) + 1);
        }

        System.out.print("Rooms available (in ascending order): ");
        for (int num : uniqueNumbers) {
            System.out.print(num + " ");
        }
        System.out.print("\n");
    }
}