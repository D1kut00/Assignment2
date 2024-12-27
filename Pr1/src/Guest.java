import java.util.Scanner;

public class Guest {
    Scanner scanner = new Scanner(System.in);
    public String name;

    public Guest(String name) {
        SetName(name);
    }

    public void SetName(String name) {
        this.name = name;
    }

    public String GetName() {
        return name;
    }

    @Override
    public String toString() {
        return "Greetings " + name;
    }

    int GN() {
        int guestNumber = scanner.nextInt();
        return guestNumber;
    }
}
