import java.util.Scanner;
public class Privacy {
    Scanner scanner = new Scanner(System.in);

    @Override
    public int hashCode() {
        System.out.println("Enter a password as your door key: ");
        String password = scanner.nextLine();
        return password.hashCode();
    }
}