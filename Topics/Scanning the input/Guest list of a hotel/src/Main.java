import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int numberOfGuests = 4;
        String[] names = new String[numberOfGuests];

        for (int i = 0; i < numberOfGuests; i++) {
            names[i] = scanner.next();
        }

        for (int i = numberOfGuests - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }

    }
}